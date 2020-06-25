package burger_shop;

import java.util.List;

public class Side {
	
	private String side;
	private Burger burgers;
	public Side(String side, Burger burgers) {
		this.side = side;
		this.burgers = burgers;
	}
	
	public void sideBurger() {
		
		System.out.println("I am able to access the burger class using aggregation. Burger: " + burgers);
		
	}

	
	
	
}
