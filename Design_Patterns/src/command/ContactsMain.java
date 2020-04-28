package command;

public class ContactsMain {

	public static void main(String[] args) {

		CreateContact createContact = new CreateContact();
		Contacts contacts = new Contacts();
		ContactsCommand addContacts = new AddContacts(contacts);
		ContactsCommand removeContacts = new RemoveContacts(contacts);
		ContactsCommand updateContacts = new UpdateContacts(contacts);
		
		createContact.setCommand(addContacts);
		createContact.addContacts();
		
		createContact.setCommand(removeContacts);
		createContact.removeContacts();
		
		createContact.setCommand(updateContacts);
		createContact.updateContacts();
		
	}

}