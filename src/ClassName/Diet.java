package ClassName;
import java.util.List;

public class Diet {
	List<Meals> meals;
	NutritionGoals nutritionGoals;
	WeeklyStatus weeklyStats;
	public Diet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Diet(List<Meals> meals, NutritionGoals nutritionGoals, WeeklyStatus weeklyStats) {
		super();
		this.meals = meals;
		this.nutritionGoals = nutritionGoals;
		this.weeklyStats = weeklyStats;
	}
	public List<Meals> getMeals() {
		return meals;
	}
	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}
	public NutritionGoals getNutritionGoals() {
		return nutritionGoals;
	}
	public void setNutritionGoals(NutritionGoals nutritionGoals) {
		this.nutritionGoals = nutritionGoals;
	}
	public WeeklyStatus getWeeklyStats() {
		return weeklyStats;
	}
	public void setWeeklyStats(WeeklyStatus weeklyStats) {
		this.weeklyStats = weeklyStats;
	}
	@Override
	public String toString() {
		return "Diet [meals=" + meals + ", nutritionGoals=" + nutritionGoals + ", weeklyStats=" + weeklyStats + "]";
	}
	
	
}
