package NewBurgerWIthDifferentAproach;

public class Meal {
	private Object[] name ;
	private Object[] side ;
	private Object[] drink;
	final static Object[] plainBurger = {PlainBurger.name,Sides.fries,Drink.coke};
	final static Object[] deluxeBurger = {DeluxeBurger.name,Sides.fries,Drink.coke};
	final static Object[] healthBurger = {HealthyBurger.name,Sides.applePie,Drink.water};
	
	public Meal() {
		this.name = PlainBurger.name;
		this.side = Sides.fries;
		this.drink = Drink.coke;
	}
	
	public Meal(Object[] name  , Object[] side, Object[] drink) {
		this.name = name;
		this.side = side;
		this.drink = drink;
	}
	
	
	
	

}
