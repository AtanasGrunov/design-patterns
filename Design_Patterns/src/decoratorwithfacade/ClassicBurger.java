package decoratorwithfacade;

public class ClassicBurger implements Burger {
	@Override
	public String getKindOfBurger() {

		return "Classic burger";
	}
	
	@Override
	public double getTime() {	
		return 10.00;
	}
}
	

