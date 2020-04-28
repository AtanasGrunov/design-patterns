package command;

public class AddContacts implements ContactsCommand {

	private Contacts contacts;
	
	public AddContacts(Contacts contacts) {
		this.contacts = contacts;
	}
	
	@Override
	public void execute() {
		this.contacts.addContacts();

	}

}
