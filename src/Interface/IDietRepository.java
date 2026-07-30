package Interface;

import java.util.List;

import ClassName.Meals;
import ClassName.NutritionGoals;
import ClassName.WeeklyStatus;

public interface IDietRepository {
	 // 파일 입출력
    void loadFromFile();
    void saveToFile();

    // ---- Meals 관련 CRUD ----
    void addMeal(Meals meal);
    Meals findMealById(int id);
    List<Meals> findAllMeals();
    void updateMeal(Meals meal);
    void deleteMeal(int id);

    // ---- NutritionGoals 관련 ----
    NutritionGoals getNutritionGoals();
    void updateNutritionGoals(NutritionGoals goals);

    // ---- WeeklyStatus 관련 ----
    WeeklyStatus getWeeklyStats();
    void updateWeeklyStats(WeeklyStatus stats);
    WeeklyStatus recalculateWeeklyStats();   // meals 기반으로 새로 계산해서 갱신

}
