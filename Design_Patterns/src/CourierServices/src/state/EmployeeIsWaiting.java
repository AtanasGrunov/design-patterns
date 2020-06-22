package state;

public class EmployeeIsWaiting implements State {


	@Override
	public void doAction(Context context) {
		 System.out.println("\nСлужителя чака да дойде нов клиент.");
		 context.setState(this);
	}
}
