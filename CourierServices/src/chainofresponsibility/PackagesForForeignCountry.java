package chainofresponsibility;

public class PackagesForForeignCountry extends Employee {

	public PackagesForForeignCountry() {
		this.deliveryLocation = Employee.packagesForForeignCountry;
	}

	@Override
	protected void shipmentMessage(String Message) {
		System.out.println("Колети за чужбина: "+ Message);
	}
}
