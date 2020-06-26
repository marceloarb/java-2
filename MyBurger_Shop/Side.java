package MyBurger_Shop;



public class Side {
	
	final static String fries = "Fries";
	final static String coke = "Coke";
	final static String iceCream = "Ice Cream";
	final static String sprite = "Sprite";
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

	

	public Burger getBurgers() {
		return burgers;
	}

	

	
	
	
}
