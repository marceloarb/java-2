package Burger_Shop;



public class Burger {
	private String name;
	private double namePrice = 5.99;
	private String breadType;
	private String meat;
	private String lettuce = "Lettuce";
	private double lettucePrice = 0.20;
	private String tomatoes = "Tomatoes";
	private double tomatoesPrice = 0.20;
	private String mustard = "Mustard";
	private double mustardPrice = 0.10;
	private String ketchup = "Ketchup";
	private double ketchupPrice = 0.10;
	private String relish = "Relish";
	private double relishPrice = 0.20;
	private String guacamole = "Guacamole";
	private double guacamolePrice = 0.50;
	private String cheese = "Cheese";
	private double cheesePrice = 0.50;
	private String bacon = "Bacon";
	private double BaconPrice = 0.50;
	private String mayo = "Mayo";
	private double mayoPrice = 0.10;
	private double total = 0.0;
	static String plain = "plain";
	
	
	
	public Burger(String name, String breadType, String meat) {
		this.name = name;
		this.breadType = breadType;
		this.meat = meat;
	}
	public String getName() {
		return name;
	}
	
	public String getBreadType() {
		return breadType;
	}
	
	public String getMeat() {
		return meat;
	}
	

	public String getLettuce() {
		return lettuce;
	}
	
	public double getLettucePrice() {
		return lettucePrice;
	}
	
	public String getTomatoes() {
		return tomatoes;
	}
	
	public double getTomatoesPrice() {
		return tomatoesPrice;
	}
	
	public String getMustard() {
		return mustard;
	}
	
	public double getMustardPrice() {
		return mustardPrice;
	}
	
	public String getKetchup() {
		if(getName().contains("Healthy")) {
			System.out.println("This is a healthy hamburguer you can not put ketchup on it");
			return null;
		}
		return ketchup;
	}
	
	public double getKetchupPrice() {
		if(getName().contains("Healthy")) {
			return 0.0;
		}
		return ketchupPrice;
	}
	
	public String getRelish() {
		return relish;
	}
	
	public double getRelishPrice() {
		return relishPrice;
	}
	
	public String getGuacamole() {
		return guacamole;
	}
	
	public double getGuacamolePrice() {
		return guacamolePrice;
	}
	
	public String getCheese() {
		if(getName().contains("Healthy")) {
			System.out.println("This is a healthy hamburguer you can not put cheese on it" + this.name);
			return null;
		}
		return cheese;
	}
	
	public double getCheesePrice() {
		if(getName().contains("Healthy")) {
			return 0.0;
		}
		return cheesePrice;
	}
	
	public String getBacon() {
		if(getName().contains("Healthy")) {
			System.out.println("This is a healthy hamburguer you can not put bacon on it" + getName());
			return null;
		}
		return bacon;
	}
	
	public double getBaconPrice() {
		if(getName().contains("Healthy")) {
			return 0.0;
		}
		return BaconPrice;
	}
	
	public String getMayo() {
		return mayo;
	}
	
	public double getMayoPrice() {
		return this.mayoPrice;
	}
	
	public double getNamePrice() {
		return namePrice;
	}
	
	// Overloading
	public double hamburguerPrice(double One, String top1) {
		this.total = this.namePrice+One;
		System.out.println("Hamburguer price with toppings included: $" + this.total +". Topping "+ top1 );
		return this.total;
		
	}
	public double hamburguerPrice(double One, double Two, String top1, String top2) {
		this.total = this.namePrice+One+Two;
		System.out.println("Hamburguer price with toppings included: $" + this.total +". Topping "+ top1 +", " +top2);
		return this.total;
		
	}
	public double hamburguerPrice(double One, double Two, double Three,String top1, String top2,String top3) {
		if(getName().equals("Plain Burguer")) {
			System.out.println("You can only have 2 toppings for a plain burguer");
		}
		else {
			this.total = this.namePrice+One+Two+Three;
			System.out.println("Hamburguer price with toppings included: $" + this.total +". Topping "+ top1 +", " +top2 +", " +top3);
			
		}
		return this.total;
		
	}
	public double hamburguerPrice(double One,double Two, double Three, double Four,String top1, String top2,String top3,String top4) {
		if(getName().equals("Plain Burguer")) {
			System.out.println("You can only have 2 toppings for a plain burguer");
		}
		else {
			this.total = this.namePrice+One+Two+Three+Four;
			System.out.println("Hamburguer price with toppings included: $" + this.total +". Topping "+ top1 +", " +top2 +", " +top3 +", " +top4);
			
		}
		return this.total;
		
	}
	public double hamburguerPrice(double One,double Two, double Three, double Four,double Five,String top1, String top2,String top3,String top4,String top5) {
		if(getName().equals("Plain Burguer")) {
			System.out.println("You can only have 2 toppings for a plain burguer");
		}
		else {
			this.total = this.namePrice+One+Two+Three+Four+Five;
			System.out.println("Hamburguer price with toppings included: $" + this.total +". Topping "+ top1 +", " +top2 +", " +top3 +", " +top4+", " +top5);
			
		}
		return this.total;
		
	}
	public double hamburguerPrice(double One,double Two, double Three, double Four,double Five,double Six,String top1, String top2,String top3,String top4,String top5,String top6) {
		if(getName().equals("Plain Burguer")) {
			System.out.println("You can only have 2 toppings for a plain burguer");
		}
		else {
			this.total = this.namePrice+One+Two+Three+Four+Five+Six;
			System.out.println("Hamburguer price with toppings included: $" + this.total +". Topping "+ top1 +", " +top2 +", " +top3 +", " +top4+", " +top5+", " +top6);
			
		}
		return this.total;
		
	}
	
	
	
	
	
}
