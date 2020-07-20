package Burger_Shop;

public class Order {
	private Burger burger;
	private String bread;
	private String meat;
	private Meal meal;
	public Order(Burger burger, String ryebread, String beef) {
		this.burger = burger;
		this.bread = ryebread;
		this.meat = beef;
	}
	
	public Order(Meal meal) {
		this.meal = meal;
	}
	
	
	public void addToppings1(double d, String s) {
		burger.hamburguerPrice(d, s);
	}

	public void addSides(String drink, String side) {
		
		
	}

	public void addToppings2(double One, double Two, String top1, String top2) {
		burger.hamburguerPrice(One, Two, top1, top2);
	}


}
