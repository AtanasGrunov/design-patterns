package chainofresponsibility;

import observer.Employees;
import observer.Observer;
import state.Context;
import state.EmployeeIsPreparing;
import state.EmployeeIsWaiting;

public class MainClass {
	
	private static Employee getChain() {
		Employee PackagesForForeignCountry = new PackagesForForeignCountry();
		Employee PackagesForBulgaria = new PackagesForBulgaria();
		Employee PackagesForPlovdiv = new PackagesForPlovdiv();
		PackagesForForeignCountry.setNextEmployee(PackagesForBulgaria);
		PackagesForBulgaria.setNextEmployee(PackagesForPlovdiv);
		return PackagesForForeignCountry;
	}

	public static void main(String[] args) {
	Employee chain = getChain();
	chain.deliveryMessage("ForeignCountry", "Доставка за чужбина.");
	chain.deliveryMessage("Bulgaria", "Доставка за България.");
	chain.deliveryMessage("Plovdiv", "Доставка за Пловдив.");
	
	
	Context context = new Context();
	EmployeeIsPreparing preparing = new EmployeeIsPreparing();
	preparing.doAction(context);
	
	EmployeeIsWaiting waiting = new EmployeeIsWaiting();
	waiting.doAction(context);
	
	Observer employee1 = new Employees("\nНаско", "packagesForForeignCountry");
	Observer employee2 = new Employees("Иван", "packagesForBulgaria");
	Observer employee3 = new Employees("Георги", "packagesForPlovdiv");
	
	employee1.ChangeState(preparing);
	employee2.ChangeState(preparing);
	employee3.ChangeState(preparing);
	
	}
}

