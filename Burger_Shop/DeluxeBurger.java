package Burger_Shop;

public class DeluxeBurger extends Burger{
	private double deluxePrice = 7.99;

	public DeluxeBurger(String name, String breadType, String meat) {
		super("Deluxe", breadType, meat);
		
	}
	@Override
	public double hamburguerPrice(double One,String top1) {
		this.deluxePrice = this.deluxePrice+One;
		System.out.println("Hamburguer price: $" + this.deluxePrice);
		return this.deluxePrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two,String top1,String top2) {
		this.deluxePrice = this.deluxePrice+One+Two;
		System.out.println("Hamburguer price: $" + this.deluxePrice);
		return this.deluxePrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two,double Three,String top1,String top2,String top3) {
		this.deluxePrice = this.deluxePrice+One+Two+Three;
		System.out.println("Hamburguer price: $" + this.deluxePrice);
		return this.deluxePrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two,double Three,double Four,String top1,String top2,String top3,String top4) {
		this.deluxePrice = this.deluxePrice+One+Two+Three+Four;
		System.out.println("Hamburguer price: $" + this.deluxePrice);
		return this.deluxePrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two,double Three,double Four,double Five,String top1,String top2,String top3,String top4,String top5) {
		this.deluxePrice = this.deluxePrice+One+Two+Three+Four+Five;
		System.out.println("Hamburguer price: $" + this.deluxePrice);
		return this.deluxePrice;
		
	}
	@Override
	public double hamburguerPrice(double One,double Two,double Three,double Four,double Five,double Six,String top1,String top2,String top3,String top4,String top5,String top6) {
		this.deluxePrice = this.deluxePrice+One+Two+Three+Four+Five+Six;
		System.out.println("Hamburguer price: $" + this.deluxePrice);
		return this.deluxePrice;
		
	}
	public double hamburguerPrice(double One,double Two,double Three,double Four,double Five,double Six,double Seven,String top1,String top2,String top3,String top4,String top5,String top6,String top7) {
		if(getName().contains("Deluxe")) {
			System.out.println("You can only have 6 toppings for a Deluxe hamburguer");
		}
		
		this.deluxePrice = this.deluxePrice+One+Two+Three+Four+Five+Six;
		System.out.println("Hamburguer price: $" + this.deluxePrice);
		return this.deluxePrice;
		
	}
}
