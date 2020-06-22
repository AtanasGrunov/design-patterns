package observer;

import state.EmployeeIsPreparing;
import state.EmployeeIsWaiting;
import state.State;

public class Employees implements Observer {
	
	private String deliveryLocation;
	private String name;
	private String state = "preparing";
	private EmployeeIsPreparing preparing;
	private EmployeeIsWaiting waiting;

	public Employees(String name, String deliveryLocation) {
		this.name = name;
		this.deliveryLocation = deliveryLocation;
	}
	
	@Override
	public void ChangeState(EmployeeIsPreparing preparing) {
		if(this.state.equals("preparing")) {
			System.out.println(this.name + " стои и чака да влезне нов клиент.");
		}
		return;
	}
	
	@Override
	public State getUpdate() {
		return this.waiting;
	}
}
