package decoratorwithfacade;

public class CheeseBurger extends BurgerDecorator {

	public CheeseBurger(Burger decoratedBurger) {
		super(decoratedBurger);
		
	}
	public String getKindOfBurger(){
		return decoratedBurger.getKindOfBurger() + " with cheese";
	}
	public double getTime(){
		return decoratedBurger.getTime() + 15.00;
	}
}
