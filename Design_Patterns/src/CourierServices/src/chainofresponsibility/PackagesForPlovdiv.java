package chainofresponsibility;

public class PackagesForPlovdiv extends Employee {

	public PackagesForPlovdiv() {
		this.deliveryLocation = Employee.packagesForPlovdiv;
	}

	@Override
	protected void shipmentMessage(String Message) {
		System.out.println("Колети за Пловдив: "+ Message);
	}
}
