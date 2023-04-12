package example.work.home.done;

import java.util.Objects;

public class Food {

	private String name;
	private int shelf;
	private double date;

	public Food() {
		name = "I";
		shelf = 0;
		date = 0;
	}

	public Food(String _name, int _shelf, double _date) {
		name = _name;
		shelf = _shelf;
		date = _date;
	}

	public void setName(String _name) {
		name = _name;
	}

	public String getName() {
		return name;
	}

	public void setShelf(int _shelf) {
		shelf = _shelf;
	}

	public int getShelf() {
		return shelf;
	}

	public void setDate(double _date) {
		date = _date;
	}

	public double getDate() {
		return date;
	}

	public void print(Food food) {
		if (food != null) {
			System.out.println("---------Food---------");
			System.out.println("Food shelf: " + food.getShelf());
			System.out.println("Food name: " + food.getName());
			System.out.println("Food date: " + food.getDate());
			System.out.println("-----------------------");
		} else {
			System.out.println("There is no such food in the Fridge");
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, name, shelf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Double.doubleToLongBits(date) == Double.doubleToLongBits(other.date) && Objects.equals(name, other.name)
				&& shelf == other.shelf;
	}

}
