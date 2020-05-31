package decoratorwithfacade;

public class BurgerWithEggs extends BurgerDecorator{

	public BurgerWithEggs(Burger decoratedBurger) {
		super(decoratedBurger);	
	}
	
	public String getKindOfBurger(){
		return decoratedBurger.getKindOfBurger() + " with egg";
	}
	public double getTime(){
		return decoratedBurger.getTime() + 20.00;
	}
}
