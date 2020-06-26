package MyBurger_Shop;

public class HealthBurger extends Burger{
	private double healthPrice = 7.99;
	public HealthBurger(String name, String breadType, String meat) {
		super("Healthy", breadType, meat);
		
	}
	
	
	@Override
	public double hamburguerPrice(double One,String top1) {
		
		
		this.healthPrice = this.healthPrice+One;
		System.out.println("Hamburguer price: $" + this.healthPrice);
		return this.healthPrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two,String top1,String top2) {
		this.healthPrice = this.healthPrice+One+Two;
		System.out.println("Hamburguer price: $" + this.healthPrice);
		return this.healthPrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two,double Three,String top1,String top2,String top3) {
		this.healthPrice = this.healthPrice+One+Two+Three;
		System.out.println("Hamburguer price: $" + this.healthPrice);
		return this.healthPrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two,double Three,double Four,String top1,String top2,String top3,String top4) {
		
		this.healthPrice = this.healthPrice+One+Two+Three+Four;
		System.out.println("Hamburguer price: $" + this.healthPrice);
		return this.healthPrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two, double Three, double Four,double Five,String top1,String top2,String top3,String top4,String top5) {
		if(getName().contains("Health")) {
			System.out.println("You can only have 4 toppings for a plain burguer");
		}
		
		return this.healthPrice ;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two, double Three, double Four,double Five,double Six,String top1,String top2,String top3,String top4,String top5,String top6) {
		if(getName().contains("Health")) {
			System.out.println("You can only have 4 toppings for a plain burguer");
		}
		
		return this.healthPrice ;
		
		
	}
	
	
}
