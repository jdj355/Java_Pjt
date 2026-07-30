package ClassName;

import java.util.List;

public class User {
	private int id;
	private String name;
	private int age;
	private double height;
	private double weight;
	private List<String> disease;
	private String user_id;
	private String passwordHash;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, int age, double height, double weight, List<String> disease, String user_id,
			String passwordHash) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.disease = disease;
		this.user_id = user_id;
		this.passwordHash = passwordHash;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public List<String> getDisease() {
		return disease;
	}

	public void setDisease(List<String> disease) {
		this.disease = disease;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public String getUser_id() {
		return user_id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight
				+ ", disease=" + disease + ", user_id=" + user_id + ", passwordHash=" + passwordHash + "]";
	}

	
}
