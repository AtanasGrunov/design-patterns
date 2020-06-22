package chainofresponsibility;


public abstract class Employee {

	public static String packagesForForeignCountry = "ForeignCountry";
	public static String packagesForBulgaria = "Bulgaria";
	public static String packagesForPlovdiv = "Plovdiv";
	
	public String deliveryLocation;
	
	protected Employee nextEmployee;
	
	public void setNextEmployee(Employee nextEmployee) {
		this.nextEmployee = nextEmployee;
	}
	
	public void deliveryMessage(String deliveryLocation, String Message) {
		
		if(this.deliveryLocation.equals(deliveryLocation)) {
			this.shipmentMessage(Message);
			return;
		}
		if(this.nextEmployee != null) {
			this.nextEmployee.deliveryMessage(deliveryLocation, Message);
		}
	}
	abstract protected void shipmentMessage(String Message);
}
	





