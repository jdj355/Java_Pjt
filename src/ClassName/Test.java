package ClassName;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

import com.google.gson.Gson;

import ClassName.Diet;
import ClassName.Foods;

public class Test {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("diet-data.json"))) {
			StringBuffer sb = new StringBuffer();
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				sb.append(line);
			}
			System.out.println(sb.toString());
			
			Diet diet = new Gson().fromJson(sb.toString(), Diet.class);
			for (Meals m : diet.meals) {
				System.out.println(m.getId());
				System.out.println(m.getType());
				System.out.println(m.getDate());
				for (Foods foods : m.getFoods()) {
					System.out.println(foods.getName());
					System.out.println(foods.getCalories());
					System.out.println(foods.getFat());
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
