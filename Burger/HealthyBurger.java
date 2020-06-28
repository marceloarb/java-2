package Burger;

public class HealthyBurger extends PlainBurger{
	
	private Object[] meat = Meat.chicken;
	private Object[] bread = Bread.wheat;
	final static Object[] name = {"Healthy Burger",Meat.chicken,Bread.wheat};
	private Object[] toppings;
	private double total;

	public HealthyBurger() {
		super();
		
	}

	@Override
	public void addToppings(Object[] top1) {
		if(top1[0].equals(Toppings.bacon[0]) || top1[0].equals(Toppings.cheese[0]) || top1[0].equals(Toppings.ketchup[0]) || top1[0].equals(Toppings.mayo[0]) ) {
			System.out.print("This is a healthy burger you can't add this type of toppings.");
			
		}
		else {
			super.addToppings(top1);
		}
		
	}

	@Override
	public void addToppings(Object[] top1, Object[] top2) {
		if(top1[0].equals(Toppings.bacon[0]) || top1[0].equals(Toppings.cheese[0]) || top1[0].equals(Toppings.ketchup[0]) || top1[0].equals(Toppings.mayo[0]) || top2[0].equals(Toppings.bacon[0]) || top2[0].equals(Toppings.cheese[0]) || top2[0].equals(Toppings.ketchup[0]) || top2[0].equals(Toppings.mayo[0])) {
			System.out.print("This is a healthy burger you can't add this type of toppings.");
			
		}
		else {
			super.addToppings(top1, top2);
		}
		
	}

	@Override
	public void addToppings(Object[] top1, Object[] top2, Object[] top3) {
		if(top1[0].equals(Toppings.bacon[0]) || top1[0].equals(Toppings.cheese[0]) || top1[0].equals(Toppings.ketchup[0]) || top1[0].equals(Toppings.mayo[0]) || top2[0].equals(Toppings.bacon[0]) || top2[0].equals(Toppings.cheese[0]) || top2[0].equals(Toppings.ketchup[0]) || top2[0].equals(Toppings.mayo[0])|| top3[0].equals(Toppings.bacon[0]) || top3[0].equals(Toppings.cheese[0]) || top3[0].equals(Toppings.ketchup[0]) || top3[0].equals(Toppings.mayo[0])) {
			System.out.print("This is a healthy burger you can't add this type of toppings.");
			
		}
		else {
			super.addToppings(top1, top2, top3);
		}
		
	}
	public void addToppings(Object[] top1, Object[] top2, Object[] top3,Object[] top4) {
		if(top1[0].equals(Toppings.bacon[0]) || top1[0].equals(Toppings.cheese[0]) || top1[0].equals(Toppings.ketchup[0]) || top1[0].equals(Toppings.mayo[0]) || top2[0].equals(Toppings.bacon[0]) || top2[0].equals(Toppings.cheese[0]) || top2[0].equals(Toppings.ketchup[0]) || top2[0].equals(Toppings.mayo[0])|| top3[0].equals(Toppings.bacon[0]) || top3[0].equals(Toppings.cheese[0]) || top3[0].equals(Toppings.ketchup[0]) || top3[0].equals(Toppings.mayo[0])||top4[0].equals(Toppings.bacon[0]) || top4[0].equals(Toppings.cheese[0]) || top4[0].equals(Toppings.ketchup[0]) || top4[0].equals(Toppings.mayo[0])) {
			System.out.print("This is a healthy burger you can't add this type of toppings.");
			
		}
		else {
			this.total = this.total + (double)top1[1] + (double)top2[1] + (double) top3[1] + (double) top4[1];
			System.out.println(" with toppings for "+total);
		}
		
	}
	public void addToppings(Object[] top1, Object[] top2, Object[] top3,Object[] top4,Object[] top5) {
		
		if(((String) name[0]).contains("Healthy")) {
			System.out.println("You can only add 4 toppings for the helthy burger");
			super.plainBurgerPrice(name);
		}
		else {
			this.total = this.total + (double)top1[1] + (double)top2[1] + (double) top3[1] + (double) top4[1] + (double) top5[1];
			System.out.println(" with toppings for "+total);
		}
		
	}

	@Override
	public void plainBurgerPrice(Object[] name) {
		super.plainBurgerPrice(name);
	}
	
	
	
	
	
}
