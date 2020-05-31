package decoratorwithfacade;

public class BurgerDecorator implements Burger {

	protected Burger decoratedBurger;

	public BurgerDecorator(Burger decoratedBurger) {
		this.decoratedBurger = decoratedBurger;
	}

	@Override
	public String getKindOfBurger() {
		return this.decoratedBurger.getKindOfBurger();
	}

	@Override
	public double getTime() {
		return this.decoratedBurger.getTime();
	}

}
