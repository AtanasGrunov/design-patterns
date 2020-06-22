package state;

public class EmployeeIsPreparing implements State {

	@Override
	public void doAction(Context context) {
		 System.out.print("\nСлужителя подготвя доставката.");
		 context.setState(this);
	}
}
