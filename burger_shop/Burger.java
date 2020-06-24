package burger_shop;



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
	
	
	
	public Burger(String name, String breadType, String meat) {
		this.name = name;
		this.breadType = breadType;
		this.meat = meat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreadType() {
		return breadType;
	}
	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}
	public String getMeat() {
		return meat;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}

	public String getLettuce() {
		return lettuce;
	}
	public void setLettuce(String lettuce) {
		this.lettuce = lettuce;
	}
	public double getLettucePrice() {
		return lettucePrice;
	}
	public void setLettucePrice(double lettucePrice) {
		this.lettucePrice = lettucePrice;
	}
	public String getTomatoes() {
		return tomatoes;
	}
	public void setTomatoes(String tomatoes) {
		this.tomatoes = tomatoes;
	}
	public double getTomatoesPrice() {
		return tomatoesPrice;
	}
	public void setTomatoesPrice(double tomatoesPrice) {
		this.tomatoesPrice = tomatoesPrice;
	}
	public String getMustard() {
		return mustard;
	}
	public void setMustard(String mustard) {
		this.mustard = mustard;
	}
	public double getMustardPrice() {
		return mustardPrice;
	}
	public void setMustardPrice(double mustardPrice) {
		this.mustardPrice = mustardPrice;
	}
	public String getKetchup() {
		return ketchup;
	}
	public void setKetchup(String ketchup) {
		this.ketchup = ketchup;
	}
	public double getKetchupPrice() {
		return ketchupPrice;
	}
	public void setKetchupPrice(double ketchupPrice) {
		this.ketchupPrice = ketchupPrice;
	}
	public String getRelish() {
		return relish;
	}
	public void setRelish(String relish) {
		this.relish = relish;
	}
	public double getRelishPrice() {
		return relishPrice;
	}
	public void setRelishPrice(double relishPrice) {
		this.relishPrice = relishPrice;
	}
	public String getGuacamole() {
		return guacamole;
	}
	public void setGuacamole(String guacamole) {
		this.guacamole = guacamole;
	}
	public double getGuacamolePrice() {
		return guacamolePrice;
	}
	public void setGuacamolePrice(double guacamolePrice) {
		this.guacamolePrice = guacamolePrice;
	}
	public String getCheese() {
		return cheese;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public double getCheesePrice() {
		return cheesePrice;
	}
	public void setCheesePrice(double cheesePrice) {
		this.cheesePrice = cheesePrice;
	}
	public String getBacon() {
		return bacon;
	}
	public void setBacon(String bacon) {
		this.bacon = bacon;
	}
	public double getBaconPrice() {
		return BaconPrice;
	}
	public void setBaconPrice(double baconPrice) {
		BaconPrice = baconPrice;
	}
	public String getMayo() {
		return mayo;
	}
	public void setMayo(String mayo) {
		this.mayo = mayo;
	}
	public double getMayoPrice() {
		return this.mayoPrice;
	}
	public void setMayoPrice(double mayoPrice) {
		this.mayoPrice = mayoPrice;
	}
	public double getNamePrice() {
		return namePrice;
	}
	public void setNamePrice(double namePrice) {
		this.namePrice = namePrice;
	}
	
	public double hamburguerPrice(double One) {
		this.total = this.namePrice+One;
		System.out.println("Hamburguer price: $" + this.total);
		return this.total;
		
	}
	public double hamburguerPrice(double One, double Two) {
		this.total = this.namePrice+One+Two;
		System.out.println("Hamburguer price: $" + this.total);
		return this.total;
		
	}
	public double hamburguerPrice(double One, double Two, double Three) {
		if(getName().equals("Plain Burguer")) {
			System.out.println("You can only have 2 toppings for a plain burguer");
		}
		else {
			this.total = this.namePrice+One+Two+Three;
			System.out.println("Hamburguer price: $" + this.total);
			
		}
		return this.total;
		
	}
	public double hamburguerPrice(double One,double Two, double Three, double Four) {
		if(getName().equals("Plain Burguer")) {
			System.out.println("You can only have 2 toppings for a plain burguer");
		}
		else {
			this.total = this.namePrice+One+Two+Three+Four;
			System.out.println("Hamburguer price: $" + this.total);
			
		}
		return this.total;
		
	}
	public double hamburguerPrice(double One,double Two, double Three, double Four,double Five) {
		if(getName().equals("Plain Burguer")) {
			System.out.println("You can only have 2 toppings for a plain burguer");
		}
		else {
			this.total = this.namePrice+One+Two+Three+Four+Five;
			System.out.println("Hamburguer price: $" + this.total);
			
		}
		return this.total;
		
	}
	public double hamburguerPrice(double One,double Two, double Three, double Four,double Five,double Six) {
		if(getName().equals("Plain Burguer")) {
			System.out.println("You can only have 2 toppings for a plain burguer");
		}
		else {
			this.total = this.namePrice+One+Two+Three+Four+Five+Six;
			System.out.println("Hamburguer price: $" + this.total);
			
		}
		return this.total;
		
	}
	
	
	
	
	
}
