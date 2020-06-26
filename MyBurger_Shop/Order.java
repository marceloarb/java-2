package MyBurger_Shop;

public class Order {
	private Burger burger;
	private Bread bread;
	private Meat meat;
	private Meal meal;
	public Order(Burger burger, Bread bread, Meat meat) {
		this.burger = burger;
		this.bread = bread;
		this.meat = meat;
	}
	
	public Order(Meal meal) {
		this.meal = meal;
	}
	
	
	
	public void printOrder() {
		System.out.println("Hamburguer meal name: " + this.burger.getName() + ", Bread: " + bread.getBread() + ", Meat: " + meat.getMeat());
	}
}
