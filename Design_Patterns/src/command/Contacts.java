package command;

public class Contacts {
	
	private Boolean addContacts;
	private Boolean updateContacts;
	
	public void addContacts() {
		System.out.println("The contact is added");
		this.addContacts = true;
	}
	
	public void removeContacts() {
		System.out.println("The contact has been removed");
		this.addContacts = false;
	}
	
	public void updateContacts() {
		System.out.println("The contact has been updated");
		this.updateContacts = true;
		
	}
	
}
