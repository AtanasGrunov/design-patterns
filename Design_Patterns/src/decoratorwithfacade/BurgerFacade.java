package decoratorwithfacade;

public class BurgerFacade {
	
	private Burger classic;
	private Burger classicWithEgg;
	private Burger classicWithCheese;
	
	public BurgerFacade(){
		
		this.classic = new ClassicBurger();
		this.classicWithEgg = new BurgerWithEggs(classic);
		this.classicWithCheese = new CheeseBurger(classic);
	}
	
	public void getClassicBurger(){
		System.out.println("Kind of burger: " + this.classic.getKindOfBurger());
		System.out.println("Delivery time: " + this.classic.getTime() + " min");
		System.out.println();
	}
	
	public void getClassicBurgerEgg(){
		System.out.println("Kind of burger: " + this.classicWithEgg.getKindOfBurger());
		System.out.println("Delivery time: " + this.classicWithEgg.getTime() + " min");
		System.out.println();
	}
	
	public void getClassicBurgerCheese(){
		System.out.println("Kind of burger: " + this.classicWithCheese.getKindOfBurger());
		System.out.println("Delivery time: " + this.classicWithCheese.getTime() + " min");
		System.out.println();
	}

}
