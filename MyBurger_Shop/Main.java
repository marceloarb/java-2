package MyBurger_Shop;

public class Main {
	
    public static void main(String[] args) {
    	
        //main execution of the burger shop goes here.  This is the "entry point" of your application
    	 
    	
    	Burger plain = new Burger("Plain Burguer","Wheat", "beef");
    	plain.hamburguerPrice(plain.getBaconPrice(), plain.getMayoPrice(), plain.getCheesePrice(), plain.getGuacamolePrice());
    	Burger cheeseBurger = new Burger("Cheese Burguer", "Normal", "beef");
    	cheeseBurger.hamburguerPrice(plain.getBaconPrice(), plain.getMayoPrice(), plain.getCheesePrice(), plain.getGuacamolePrice());
    	plain.getNamePrice();
    	HealthBurger healthy = new HealthBurger("Healthy","wheat","chicken");
    	healthy.hamburguerPrice(healthy.getBaconPrice(), healthy.getMayoPrice(), healthy.getCheesePrice(), healthy.getGuacamolePrice(),healthy.getRelishPrice());
    	HealthBurger healthy1 = new HealthBurger("Healthy","wheat","beef");
    	healthy1.hamburguerPrice( healthy.getMayoPrice(), healthy.getCheesePrice(), healthy.getGuacamolePrice(),healthy.getRelishPrice());
    	DeluxeBurger deluxe = new DeluxeBurger("Deluxe","Normal","beef");
    	deluxe.hamburguerPrice(healthy.getBaconPrice(), healthy.getMayoPrice(), healthy.getCheesePrice(), healthy.getGuacamolePrice(),healthy.getRelishPrice(),healthy.getRelishPrice(),healthy.getRelishPrice());
    	Side sides = new Side("Fries", plain);
    	sides.sideBurger();
    	Meal meal1 = new Meal("Coke",Side.fries,plain);
    	meal1.printPlainMeal();
    	Meal meal2 = new Meal("Pepsi", "Ice cream", deluxe);
    	meal2.printPlainMeal();
    	Bread bread = new Bread(plain);
    	Meat meat = new Meat("Roast beef",plain);
    	Order order1 = new Order(plain,bread,meat);
    	order1.printOrder();
    
    
    
    
    
    
    
    
    
    
    }
    
}
