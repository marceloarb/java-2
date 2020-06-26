package MyBurger_Shop;

import java.util.List;

public class Meat {
	
	private String meat = "beef";
	private Burger burgers;
	public Meat(String meat, Burger burgers) {
		this.meat = meat;
		this.burgers = burgers;
	}
	public void meatBurguer() {
		System.out.println("I am able to access the burger class using aggregation. Burger: " + burgers);
		
	}
	public String getMeat() {
		return meat;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public Burger getBurgers() {
		return burgers;
	}
	public void setBurgers(Burger burgers) {
		this.burgers = burgers;
	}
	
	
}
