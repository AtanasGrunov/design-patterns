package command;

public class UpdateContacts implements ContactsCommand {

private Contacts contacts;
	
	public UpdateContacts(Contacts contacts) {
		this.contacts = contacts;
	}
	
	
	@Override
	public void execute() {
		this.contacts.updateContacts();
		
	}

}
