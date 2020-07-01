package NewBurgerWIthDifferentAproach;

import java.util.ArrayList;

public class PlainBurger {
	private Object[] meat = Meat.beef;
	private Object[] bread = Bread.white;
	final static Object[] name = {"Plain Burger",Meat.beef,Bread.white};
	private Object[] toppings;
	private double total;
	
	
	
	public PlainBurger() {
		
	}
	public void addToppings(Object[] top1) {
		this.total = this.total + (double) top1[1];
		System.out.println("with toppings for "+total);
	}
	public void addToppings(Object[] top1,Object[] top2) {
		this.total = this.total + (double) top1[1] + (double) top2[1];
		System.out.println(" with toppings for "+total);
	}
	public void addToppings(Object[] top1,Object[] top2,Object[] top3) {
		
		if(name[0].equals("Plain")) {
			System.out.println("You can only have 2 toppings for a plain burguer");
		}
		else {
		this.total = this.total + (double)top1[1] + (double)top2[1] + (double) top3[1];
		System.out.println(" with toppings for "+total);
		}
	}

	
	
	public void plainBurgerPrice(Object[] name) {
		meat = (Object[]) name[1];
		bread = (Object[]) name[2];
		total = (double)meat[1]+(double)bread[1];
		System.out.println("Just the "+ name[0] +" for "+total);
	}

}
