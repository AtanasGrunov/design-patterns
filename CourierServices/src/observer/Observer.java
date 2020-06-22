package observer;

import state.EmployeeIsPreparing;
import state.State;

public interface Observer {

	public State getUpdate();
	public void ChangeState(EmployeeIsPreparing preparing);
}
