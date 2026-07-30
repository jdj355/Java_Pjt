package ClassName;

public class WeeklyStatus {
	private	String startDate;
	private	String endDate;
	int totalCalories;
	int totalProtein;
	int totalCarbs;
	int totalFat;
	double averageCalories;
	double averageProtein;
	double averageCarbs;
	double averageFat;
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public void setTotalCalories(int totalCalories) {
		this.totalCalories = totalCalories;
	}
	public void setTotalProtein(int totalProtein) {
		this.totalProtein = totalProtein;
	}
	public void setTotalCarbs(int totalCarbs) {
		this.totalCarbs = totalCarbs;
	}
	public void setTotalFat(int totalFat) {
		this.totalFat = totalFat;
	}
	public void setAverageCalories(double averageCalories) {
		this.averageCalories = averageCalories;
	}
	public void setAverageProtein(double averageProtein) {
		this.averageProtein = averageProtein;
	}
	public void setAverageCarbs(double averageCarbs) {
		this.averageCarbs = averageCarbs;
	}
	public void setAverageFat(double averageFat) {
		this.averageFat = averageFat;
	}
	public int getTotalCalories() {
		return totalCalories;
	}
	public int getTotalProtein() {
		return totalProtein;
	}
	public int getTotalCarbs() {
		return totalCarbs;
	}
	public int getTotalFat() {
		return totalFat;
	}
	public double getAverageCalories() {
		return averageCalories;
	}
	public double getAverageProtein() {
		return averageProtein;
	}
	public double getAverageCarbs() {
		return averageCarbs;
	}
	public double getAverageFat() {
		return averageFat;
	}
	@Override
	public String toString() {
		return "WeeklyStatus [startDate=" + startDate + ", endDate=" + endDate + ", totalCalories=" + totalCalories
				+ ", totalProtein=" + totalProtein + ", totalCarbs=" + totalCarbs + ", totalFat=" + totalFat
				+ ", averageCalories=" + averageCalories + ", averageProtein=" + averageProtein + ", averageCarbs="
				+ averageCarbs + ", averageFat=" + averageFat + "]";
	}
	
}
