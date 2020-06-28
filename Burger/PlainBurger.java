package Burger;

import java.util.ArrayList;

public class PlainBurger {
	private Object[] meat = Meat.beef;
	private Object[] bread = Bread.white;
	final static Object[] name = {"Plain Burger",Meat.beef,Bread.white};
	private Object[] toppings;
	private double total;
	
	
	
	public PlainBurger() {
		
	}
	public void addToppings(double top1) {
		this.total = this.total + top1;
		System.out.println("Plain burger with toppings for "+total);
	}
	public void addToppings(double top1,double top2) {
		this.total = this.total + top1 + top2;
		System.out.println("Plain burger with toppings for "+total);
	}
	public void addToppings(double top1,double top2,double top3) {
		
		if(name.equals("Plain Burguer")) {
			System.out.println("You can only have 2 toppings for a plain burguer");
		}
		else {
		this.total = this.total + top1 + top2 + top3;
		System.out.println("Plain burger with toppings for "+total);
		}
	}
	
	
	
	
	
	public void totalBurgerPrice(){
		
	}
	
	public void plainBurgerPrice() {
		
		total = (double)meat[1]+(double)bread[1];
		System.out.println("Just the plain burger for "+total);
	}

}
