package burger_shop;

import java.util.List;

public class Meat {
	
	private String meat;
	private Burger burgers;
	public Meat(String meat, Burger burgers) {
		this.meat = meat;
		this.burgers = burgers;
	}
	public void meatBurguer() {
		System.out.println("I am able to access the burger class using aggregation. Burger: " + burgers);
		
	}
	
	
}
