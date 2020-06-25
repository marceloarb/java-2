package burger_shop;

public class Main {
	
    public static void main(String[] args) {
    	
        //main execution of the burger shop goes here.  This is the "entry point" of your application
    	 double total = 0.0;
    	
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
    	Meal meal1 = new Meal("Coke","Fries",plain);
    	meal1.printPlainMeal();
    	Meal meal2 = new Meal("Pepsi", "Ice cream", deluxe);
    	meal2.printPlainMeal();
    	
    
    
    
    
    
    
    
    
    
    
    }
    
}
