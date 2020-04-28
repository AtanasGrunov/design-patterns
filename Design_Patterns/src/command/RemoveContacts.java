package command;

public class RemoveContacts implements ContactsCommand {

	private Contacts contacts;
	
	public RemoveContacts(Contacts contacts) {
		this.contacts = contacts;
	}
	
	@Override
	public void execute() {
		this.contacts.removeContacts();

	}

}

