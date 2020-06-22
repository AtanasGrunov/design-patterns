package chainofresponsibility;

public class PackagesForBulgaria extends Employee {

	public PackagesForBulgaria() {
		this.deliveryLocation = Employee.packagesForBulgaria;
	}

	@Override
	protected void shipmentMessage(String Message) {
		System.out.println("Колети за България: "+ Message);
	}
}
