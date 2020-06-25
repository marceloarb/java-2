package burger_shop;

public class DeluxeBurger extends Burger{
	private double deluxePrice = 7.99;

	public DeluxeBurger(String name, String breadType, String meat) {
		super("Deluxe", breadType, meat);
		
	}
	@Override
	public double hamburguerPrice(double One) {
		this.deluxePrice = this.deluxePrice+One;
		System.out.println("Hamburguer price: $" + this.deluxePrice);
		return this.deluxePrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two) {
		this.deluxePrice = this.deluxePrice+One+Two;
		System.out.println("Hamburguer price: $" + this.deluxePrice);
		return this.deluxePrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two,double Three) {
		this.deluxePrice = this.deluxePrice+One+Two+Three;
		System.out.println("Hamburguer price: $" + this.deluxePrice);
		return this.deluxePrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two,double Three,double Four) {
		this.deluxePrice = this.deluxePrice+One+Two+Three+Four;
		System.out.println("Hamburguer price: $" + this.deluxePrice);
		return this.deluxePrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two,double Three,double Four,double Five) {
		this.deluxePrice = this.deluxePrice+One+Two+Three+Four+Five;
		System.out.println("Hamburguer price: $" + this.deluxePrice);
		return this.deluxePrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two,double Three,double Four,double Five,double Six) {
		this.deluxePrice = this.deluxePrice+One+Two+Three+Four+Five+Six;
		System.out.println("Hamburguer price: $" + this.deluxePrice);
		return this.deluxePrice;
		
	}
	public double hamburguerPrice(double One,double Two,double Three,double Four,double Five,double Six,double Seven) {
		if(getName().contains("Deluxe")) {
			System.out.println("You can only have 6 toppings for a Deluxe hamburguer");
		}
		
		this.deluxePrice = this.deluxePrice+One+Two+Three+Four+Five+Six;
		System.out.println("Hamburguer price: $" + this.deluxePrice);
		return this.deluxePrice;
		
	}
}
