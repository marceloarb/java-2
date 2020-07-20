package Burger_Shop;



public class Meat {
	
	final static String beef = "beef";
	final static String roastBeef = "Roast Beef";
	final static String steak = "Steak";
	
	private Burger burgers;
	public Meat( Burger burgers) {
		this.burgers = burgers;
	}
	public void meatBurguer() {
		
		System.out.println("I am able to access the burger class using aggregation. Burger: " + burgers.getName());
		
	}
	
	
	
}
