package NewBurgerWIthDifferentAproach;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		PlainBurger plainBurger = new PlainBurger();
		plainBurger.plainBurgerPrice(PlainBurger.name);
		plainBurger.addToppings(Toppings.bacon, Toppings.cheese,Toppings.bacon);
		
		System.out.println("**********************************************");
		
		HealthyBurger healthy = new HealthyBurger();
		healthy.plainBurgerPrice(HealthyBurger.name);
		healthy.addToppings(Toppings.lettuce,Toppings.tomatoes, Toppings.mashrooms);
		
		System.out.println("**********************************************");
		
		DeluxeBurger deluxe = new DeluxeBurger();
		deluxe.plainBurgerPrice(DeluxeBurger.name);

		Order order1 = new Order();
		order1.addBurger(PlainBurger.name);
		
		
		
		
	}
	

}
