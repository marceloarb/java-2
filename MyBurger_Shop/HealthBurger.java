package MyBurger_Shop;

public class HealthBurger extends Burger{
	private double healthPrice = 7.99;
	public HealthBurger(String name, String breadType, String meat) {
		super("Healthy", breadType, meat);
		
	}
	
	
	@Override
	public double hamburguerPrice(double One) {
		
		
		this.healthPrice = this.healthPrice+One;
		System.out.println("Hamburguer price: $" + this.healthPrice);
		return this.healthPrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two) {
		this.healthPrice = this.healthPrice+One+Two;
		System.out.println("Hamburguer price: $" + this.healthPrice);
		return this.healthPrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two,double Three) {
		this.healthPrice = this.healthPrice+One+Two+Three;
		System.out.println("Hamburguer price: $" + this.healthPrice);
		return this.healthPrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two,double Three,double Four) {
		
		this.healthPrice = this.healthPrice+One+Two+Three+Four;
		System.out.println("Hamburguer price: $" + this.healthPrice);
		return this.healthPrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two, double Three, double Four,double Five) {
		if(getName().contains("Health")) {
			System.out.println("You can only have 4 toppings for a plain burguer");
		}
		
		return this.healthPrice ;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two, double Three, double Four,double Five,double Six) {
		if(getName().contains("Health")) {
			System.out.println("You can only have 4 toppings for a plain burguer");
		}
		
		return this.healthPrice ;
		
		
	}
	
	
}
