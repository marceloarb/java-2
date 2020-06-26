package MyBurger_Shop;

public class Main {
	
    public static void main(String[] args) {
    	
        //main execution of the burger shop goes here.  This is the "entry point" of your application
    	 
    	
    	Burger plain = new Burger("Plain Burguer",Bread.ryeBread, Meat.beef);
    	plain.hamburguerPrice(plain.getBaconPrice(), plain.getMayoPrice(), plain.getCheesePrice(), plain.getGuacamolePrice(),plain.getBacon(), plain.getMayo(), plain.getCheese(), plain.getGuacamole());
    	Burger cheeseBurger = new Burger("Cheese Burguer", "Normal", "beef");
    	cheeseBurger.hamburguerPrice(plain.getBaconPrice(), plain.getMayoPrice(), plain.getCheesePrice(), plain.getGuacamolePrice(),plain.getBacon(), plain.getMayo(), plain.getCheese(), plain.getGuacamole());
    	HealthBurger healthy = new HealthBurger("Healthy","wheat","chicken");
    	healthy.hamburguerPrice(healthy.getBaconPrice(), healthy.getMayoPrice(), healthy.getCheesePrice(), healthy.getGuacamolePrice(),healthy.getRelishPrice(),healthy.getBacon(), healthy.getMayo(), healthy.getCheese(), healthy.getGuacamole(),healthy.getRelish());
    	HealthBurger healthy1 = new HealthBurger("Healthy","wheat","beef");
    	healthy1.hamburguerPrice( healthy.getMayoPrice(), healthy.getCheesePrice(), healthy.getGuacamolePrice(),healthy.getRelishPrice(),healthy.getMayo(), healthy.getCheese(), healthy.getGuacamole(),healthy.getRelish());
    	DeluxeBurger deluxe = new DeluxeBurger("Deluxe","Normal","beef");
    	deluxe.hamburguerPrice(healthy.getBaconPrice(), healthy.getMayoPrice(), healthy.getCheesePrice(), healthy.getGuacamolePrice(),healthy.getRelishPrice(),healthy.getRelishPrice(),healthy.getRelishPrice(),healthy.getBacon(), healthy.getMayo(), healthy.getCheese(), healthy.getGuacamole(),healthy.getRelish(),healthy.getRelish(),healthy.getRelish());
    	Side sides = new Side("Fries", plain);
    	sides.sideBurger();
    	Meal meal1 = new Meal("Coke",Side.fries,plain);
    	meal1.printPlainMeal();
    	Meal meal2 = new Meal("Pepsi", "Ice cream", deluxe);
    	meal2.printPlainMeal();
    	Bread bread = new Bread(plain);
    	Order order1 = new Order(plain,Bread.ryeBread,Meat.beef);
    	order1.addToppings1(plain.getBaconPrice(),plain.getBacon());
    	order1.addSides(Side.coke,Side.fries);
    	Order order2 = new Order(cheeseBurger,Bread.whiteBread,Meat.steak);
    	order2.addToppings2(cheeseBurger.getBaconPrice(),cheeseBurger.getCheesePrice(),cheeseBurger.getCheese(),cheeseBurger.getBacon());
    
    
    
    
    
    
    
    
    
    
    }
    
}
