package decoratorwithfacade;

public class BurgerMain {

	public static void main(String[] args) {
		
		BurgerFacade burgerfacade = new BurgerFacade();
		
		burgerfacade.getClassicBurger();
		burgerfacade.getClassicBurgerEgg();
		burgerfacade.getClassicBurgerCheese();	
	}
}
