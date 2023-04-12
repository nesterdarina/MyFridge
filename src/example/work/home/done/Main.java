package example.work.home.done;

public class Main {

	public static void main(String[] args) {
		Fridge fridge = new Fridge();

		fridge.add(new Food("Milk", 1, 12.04));
		fridge.add(new Food("Butter", 1, 13.04));
		fridge.add(new Food("Kefir", 1, 14.04));
		fridge.add(new Food("Eggs", 2, 15.04));
		fridge.add(new Food("Soup", 2, 16.04));
		fridge.add(new Food("Cheese", 2, 17.04));
		fridge.add(new Food("Orange", 3, 18.04));
		fridge.add(new Food("Apple", 3, 19.04));
		fridge.add(new Food("Tomato", 3, 20.04));
		
		Food food = fridge.findByName("Soup");
		food.print(food);
		
		fridge.print();
		
		fridge.deleteByName("Eggs");
		
		fridge.print();
	}

}
