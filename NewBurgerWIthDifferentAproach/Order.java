package NewBurgerWIthDifferentAproach;



public class Order {
	
	private Object[] name;
	private Object[] meat ;
	private Object[] bread ;
	private Object[] meal;
	private Object[] toppings;
	private PlainBurger burger = new PlainBurger();
	private HealthyBurger healthy = new HealthyBurger();
	private double total;
	public Order(Object[] name, Object[] meat, Object[] bread) {
		this.name = name;
		this.meat = meat;
		this.bread = bread;
	}
	
	public Order (Object[] meal) {
		this.meal = meal;
	}
	public Order() {
		
	}
	
	public void addBurger(Object[] burger1) {
		
		this.burger.plainBurgerPrice(burger1);
	}
	
	public void addToppings(Object[] top1) {
		
		this.burger.addToppings(top1);
	}
	public void addToppings(Object[] top1,Object[] top2) {
		
		this.burger.addToppings(top1,top2);
	}
	public void addToppings(Object[] top1,Object[] top2,Object[] top3) {
		
		this.burger.addToppings(top1,top2,top3);
	}
	
	public void addToppings(Object[] top1,Object[] top2,Object[] top3,Object[] top4) {
			
			this.healthy.addToppings(top1,top2,top3,top4);
		}
	
}
