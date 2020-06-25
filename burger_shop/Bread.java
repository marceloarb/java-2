package burger_shop;

import java.util.List;

public class Bread {
    String bread = "rye";
    private Burger burgers;
	public Bread( Burger burgers) {
		this.burgers = burgers;
	}
	
	public void breadBurguer() {
		System.out.println("I am able to access the burger class using aggregation. Burger: " + burgers);
		
	}
    
    
}
