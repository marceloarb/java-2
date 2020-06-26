package MyBurger_Shop;

import java.util.List;

public class Side {
	
	public static String fries = "Fries";
	private String side;
	private Burger burgers;
	public Side(String side, Burger burgers) {
		this.side = side;
		this.burgers = burgers;
	}
	
	public void sideBurger() {
		
		System.out.println("I am able to access the burger class using aggregation. Burger: " + burgers);
		
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public Burger getBurgers() {
		return burgers;
	}

	public void setBurgers(Burger burgers) {
		this.burgers = burgers;
	}

	
	
	
}
