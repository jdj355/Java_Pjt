package ClassName;

import java.util.List;

public class Meals {
	
	private int id;
	private String date;
	private String type;
	private List<Foods> foods;

	public Meals(int id, String date, String type, List<Foods> foods) {
		super();
		this.id = id;
		this.date = date;
		this.type = type;
		this.foods = foods;
	}

	public Meals() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Foods> getFoods() {
		return foods;
	}

	public void setFoods(List<Foods> foods) {
		this.foods = foods;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Meals [id=" + id + ", date=" + date + ", type=" + type + ", foods=" + foods + "]";
	}
	
	
}