package Burger_Shop;


public class Meal {
	
	private String sides;
	private String drinks;
	private DeluxeBurger deluxeBurger;
	private Burger burger;
	private Side side;
	public Meal(String drinks, String sides,Burger burger) {
		
			this.drinks = drinks;
			this.sides = sides;
			this.burger = burger;
		
	}
	
	public String getDrinks() {
		
		return drinks;
	}
	public void setDrinks(String drinks) {
		this.drinks = drinks;
	}
	
	
	
	public Burger getBurger() {
		
		return burger;
	}
	

	public String getSides() {
		return sides;
	}

	

	public DeluxeBurger getDeluxeBurger() {
		return deluxeBurger;
	}

	
	
	
	public void printPlainMeal() {
		System.out.println("Hamburguer meal name: " + this.burger.getName() + ", Sides: " + getSides() + ", Drink: " + getDrinks());
	}
	
	public void printDeluxeMeal() {
		System.out.println("Hamburguer meal name: " + this.deluxeBurger.getName() + ", Sides: " + getSides() + ", Drink: " + getDrinks());
	}
	
	
}
