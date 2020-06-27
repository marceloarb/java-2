package MyBurger_Shop;

public class Main {
	
    public static void main(String[] args) {
    	
        //main execution of the burger shop goes here.  This is the "entry point" of your application
    	 
    	
    	Burger plain = new Burger("Plain Burguer",Bread.ryeBread, Meat.beef);
    	plain.hamburguerPrice(plain.getBaconPrice(), plain.getMayoPrice(), plain.getCheesePrice(), plain.getGuacamolePrice(),plain.getBacon(), plain.getMayo(), plain.getCheese(), plain.getGuacamole());
    	
    	Burger cheeseBurger = new Burger("Cheese Burguer", Bread.ryeBread, Meat.beef);
    	cheeseBurger.hamburguerPrice(plain.getBaconPrice(), plain.getMayoPrice(),  plain.getGuacamolePrice(),plain.getBacon(), plain.getMayo(),  plain.getGuacamole());
    	
    	HealthBurger healthy = new HealthBurger("Healthy One",Bread.ryeBread,Meat.beef);
    	healthy.hamburguerPrice(healthy.getBaconPrice(), healthy.getMayoPrice(),  healthy.getGuacamolePrice(),healthy.getRelishPrice(),healthy.getBacon(), healthy.getMayo(),  healthy.getGuacamole(),healthy.getRelish());

    	HealthBurger healthy1 = new HealthBurger("Healthy Two",Bread.whiteBread,Meat.steak);
    	healthy1.hamburguerPrice( healthy1.getMayoPrice(),   healthy1.getGuacamolePrice(),healthy1.getRelishPrice(),healthy1.getMayo() , healthy1.getGuacamole(),healthy1.getRelish());

    	DeluxeBurger deluxe = new DeluxeBurger("Deluxe",Bread.ryeBread,Meat.roastBeef);
    	deluxe.hamburguerPrice(deluxe.getBaconPrice(), deluxe.getMayoPrice(), deluxe.getCheesePrice(), deluxe.getGuacamolePrice(),deluxe.getRelishPrice(),deluxe.getRelishPrice(),deluxe.getRelishPrice(),deluxe.getBacon(), deluxe.getMayo(), deluxe.getCheese(), deluxe.getGuacamole(),deluxe.getRelish(),deluxe.getRelish(),deluxe.getRelish());
    	
    	Side sides = new Side("Fries", plain);
    	sides.sideBurger();
    	
    	Meal meal1 = new Meal(Side.coke,Side.fries,plain);
    	meal1.printPlainMeal();
    	
    	Meal meal2 = new Meal(Side.coke, Side.iceCream, deluxe);
    	meal2.printPlainMeal();
    	
    	Bread bread = new Bread(plain);
    	
    	Order order1 = new Order(plain,Bread.ryeBread,Meat.beef);
    	order1.addToppings1(plain.getBaconPrice(),plain.getBacon());
    	order1.addSides(Side.coke,Side.fries);
    	
    	Order order2 = new Order(cheeseBurger,Bread.whiteBread,Meat.steak);
    	order2.addToppings2(cheeseBurger.getBaconPrice(),cheeseBurger.getCheesePrice(),cheeseBurger.getCheese(),cheeseBurger.getBacon());
    	
    
    
    
    
    
    
    
    
    
    }
    
}
