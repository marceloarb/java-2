package burger_shop;

public class Main {
	public static void main(String[] args) {
		Burger burger = new Burger("Basic", "Sausage", 3.56, "White");
	      double price = burger.itemizeHamburger();
	      burger.addHamburgerAddition1("Tomato", 0.27);
	      burger.addHamburgerAddition2("Lettuce", 0.75);
	      burger.addHamburgerAddition3("Cheese", 1.13);
	      System.out.println("Total Burger price is " + burger.itemizeHamburger());
	
	      HealthBurger healthyBurger = new HealthBurger("Bacon", 5.67);
	      healthyBurger.addHamburgerAddition1("Egg", 5.43);
	      healthyBurger.addHealthAddition1("Lentils", 3.41);
	      System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());
	
	      DeluxeBurger db = new DeluxeBurger();
	      db.addHamburgerAddition3("Should not do this", 50.53);
	      db.itemizeHamburger();
	}
	
	  
	    
}
