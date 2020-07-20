package NewBurgerWIthDifferentAproach;

public class DeluxeBurger extends PlainBurger{
	
	private Object[] meat = Meat.steak;
	private Object[] bread = Bread.white;
	final static Object[] name = {"Deluxe Burger",Meat.steak,Bread.white};
	private Object[] toppings;
	private double total;
	public DeluxeBurger() {
		super();
	}
	@Override
	public void addToppings(Object[] top1) {

		super.addToppings(top1);
	}
	@Override
	public void addToppings(Object[] top1, Object[] top2) {

		super.addToppings(top1, top2);
	}
	@Override
	public void addToppings(Object[] top1, Object[] top2, Object[] top3) {

		super.addToppings(top1, top2, top3);
	}
	public void addToppings(Object[] top1,Object[] top2,Object[] top3,Object[] top4) {
		this.total = this.total + (double) top1[1] + (double) top2[1]+ (double) top3[1]+ (double) top4[1];
		System.out.println(" with toppings for "+total);
	}
	public void addToppings(Object[] top1,Object[] top2,Object[] top3,Object[] top4,Object[] top5) {
		this.total = this.total + (double) top1[1] + (double) top2[1]+ (double) top3[1]+ (double) top4[1]+ (double) top5[1];
		System.out.println(" with toppings for "+total);
	}
	public void addToppings(Object[] top1,Object[] top2,Object[] top3,Object[] top4,Object[] top5,Object[] top6) {
		this.total = this.total + (double) top1[1] + (double) top2[1]+ (double) top3[1]+ (double) top4[1]+ (double) top5[1] + (double) top6[1];
		System.out.println(" with toppings for "+total);
	}
	public void addToppings(Object[] top1,Object[] top2,Object[] top3,Object[] top4,Object[] top5,Object[] top6,Object[] top7) {
		if(name.equals(name)) {
			System.out.println("Six is the max of toppings you can add");
		}
		else {
			this.total = this.total + (double) top1[1] + (double) top2[1]+ (double) top3[1]+ (double) top4[1]+ (double) top5[1] + (double) top6[1]+ (double) top7[1];
		System.out.println(" with toppings for "+total);
		}
		
	}
	@Override
	public void plainBurgerPrice(Object[] name) {
		
		total = (double)meat[1]+(double)bread[1];
		System.out.println("Just the "+ name[0] +" for "+total);
	}
	
	
	

}
