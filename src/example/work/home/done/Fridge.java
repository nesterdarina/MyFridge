package example.work.home.done;

import java.util.List;
import java.util.ArrayList;

public class Fridge {
	private List<Food> foods = new ArrayList<Food>();

	public Fridge() {
	}

	public void add(Food food) {
		foods.add(food);
	}

	public Food findByName(String _name) {

		for (int i = 0; i < foods.size(); i++) {
			Food f = foods.get(i);
			String nameFood = f.getName();
			if (nameFood.contains(_name)) {
				return f;
			}
		}
		return null;

	}

	public void print() {
		System.out.println("---------Food---------");
		for (int i = 0; i < foods.size(); i++) {
			Food food = foods.get(i);
			System.out.println("Food shelf: " + food.getShelf());
			System.out.println("Food name: " + food.getName());
			System.out.println("Food date: " + food.getDate());
			System.out.println("-----------------------");
		}

	}

	public void deleteByName(String name) {
		int deleteType = -1;
		for (int i = 0; i < foods.size(); i++) {
			Food f = foods.get(i);
			String _name = f.getName();

			if (_name.contains(name)) {
				deleteType = i;
				foods.remove(deleteType);
				i--;
			}
		}
	}

}
