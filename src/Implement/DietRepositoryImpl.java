package Implement;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ClassName.Diet;
import ClassName.Meals;
import ClassName.NutritionGoals;
import ClassName.WeeklyStatus;
import Interface.IDietRepository;

public class DietRepositoryImpl implements IDietRepository {

	private static DietRepositoryImpl instance = new DietRepositoryImpl();

	private Diet diet;
	private static final String FILE_PATH = "data/diet.json";
	private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

	private DietRepositoryImpl() {
		loadFromFile();
	}

	public static DietRepositoryImpl getInstance() {
		return instance;
	}

	@Override
	public void loadFromFile() {
		try (FileReader reader = new FileReader(FILE_PATH)) {
			diet = gson.fromJson(reader, Diet.class);
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없어 새 데이터로 시작합니다: " + e.getMessage());
		}

		// 파일이 없거나 내용이 비어있으면 빈 Diet로 초기화 (NPE 방지)
		if (diet == null) {
			diet = new Diet(new ArrayList<>(), new NutritionGoals(), new WeeklyStatus());
		}
		if (diet.getMeals() == null) {
			diet.setMeals(new ArrayList<>());
		}
	}

	@Override
	public void saveToFile() {
		try (FileWriter writer = new FileWriter(FILE_PATH)) {
			gson.toJson(diet, writer);
		} catch (IOException e) {
			System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
		}
	}

	// ---- Meals ----

	@Override
	public void addMeal(Meals meal) {
		diet.getMeals().add(meal);
		saveToFile();
	}

	@Override
	public Meals findMealById(int id) {
		for (Meals meal : diet.getMeals()) {
			if (meal.getId() == id) {
				return meal;
			}
		}
		return null;   // 못 찾으면 null 반환 → 호출부에서 null 체크 필요
	}

	@Override
	public List<Meals> findAllMeals() {
		return diet.getMeals();
	}

	@Override
	public void updateMeal(Meals meal) {
		List<Meals> meals = diet.getMeals();
		for (int i = 0; i < meals.size(); i++) {
			if (meals.get(i).getId() == meal.getId()) {
				meals.set(i, meal);
				saveToFile();
				return;
			}
		}
		System.out.println("수정할 식단(id=" + meal.getId() + ")을 찾지 못했습니다.");
	}

	@Override
	public void deleteMeal(int id) {
		boolean removed = diet.getMeals().removeIf(meal -> meal.getId() == id);
		if (removed) {
			saveToFile();
		} else {
			System.out.println("삭제할 식단(id=" + id + ")을 찾지 못했습니다.");
		}
	}

	// ---- NutritionGoals ----

	@Override
	public NutritionGoals getNutritionGoals() {
		return diet.getNutritionGoals();
	}

	@Override
	public void updateNutritionGoals(NutritionGoals goals) {
		diet.setNutritionGoals(goals);
		saveToFile();
	}

	// ---- WeeklyStatus ----

	@Override
	public WeeklyStatus getWeeklyStats() {
		return diet.getWeeklyStats();
	}

	@Override
	public void updateWeeklyStats(WeeklyStatus stats) {
		diet.setWeeklyStats(stats);
		saveToFile();
	}

	@Override
	public WeeklyStatus recalculateWeeklyStats() {
		List<Meals> meals = diet.getMeals();

		int totalCalories = 0, totalProtein = 0, totalCarbs = 0, totalFat = 0;

		for (Meals meal : meals) {
			for (var food : meal.getFoods()) {
				totalCalories += food.getCalories();
				totalProtein += food.getProtein();
				totalCarbs += food.getCarbs();
				totalFat += food.getFat();
			}
		}

		int mealCount = meals.size();
		double avgCalories = mealCount == 0 ? 0 : (double) totalCalories / mealCount;
		double avgProtein = mealCount == 0 ? 0 : (double) totalProtein / mealCount;
		double avgCarbs = mealCount == 0 ? 0 : (double) totalCarbs / mealCount;
		double avgFat = mealCount == 0 ? 0 : (double) totalFat / mealCount;

		WeeklyStatus stats = new WeeklyStatus();
		stats.setTotalCalories(totalCalories);
		stats.setTotalProtein(totalProtein);
		stats.setTotalCarbs(totalCarbs);
		stats.setTotalFat(totalFat);
		stats.setAverageCalories(avgCalories);
		stats.setAverageProtein(avgProtein);
		stats.setAverageCarbs(avgCarbs);
		stats.setAverageFat(avgFat);

		diet.setWeeklyStats(stats);
		saveToFile();

		return stats;
	}
}