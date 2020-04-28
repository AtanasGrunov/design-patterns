package command;

public class CreateContact {
	
	private ContactsCommand command;

	public void setCommand(ContactsCommand command) {
		this.command = command;
	}
	
	public void addContacts() {
		System.out.println("Adding Contacts");
		this.command.execute();
	}
	
	public void removeContacts() {
		System.out.println("Removing Contacts");
		this.command.execute();
	}
	
	public void updateContacts() {
		System.out.println("Updating Contacts");
		this.command.execute();
	}
	
}
