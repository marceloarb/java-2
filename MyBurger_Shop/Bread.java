package MyBurger_Shop;

import java.util.List;

public class Bread {
    private String bread = "rye";
    private Burger burgers;
	public Bread( Burger burgers) {
		this.burgers = burgers;
	}
	
	public void breadBurguer() {
		System.out.println("I am able to access the burger class using aggregation. Burger: " + burgers);
		
	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public Burger getBurgers() {
		return burgers;
	}

	public void setBurgers(Burger burgers) {
		this.burgers = burgers;
	}
    
    
}
