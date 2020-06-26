package MyBurger_Shop;



public class Bread {
    final static String ryeBread = "rye";
    final static String whiteBread = "White";
    private Burger burgers;
	public Bread( Burger burgers) {
		this.burgers = burgers;
	}
	
	public void breadBurguer() {
		System.out.println("I am able to access the burger class using aggregation. Burger: " + burgers);
		
	}

	
    
    
}
