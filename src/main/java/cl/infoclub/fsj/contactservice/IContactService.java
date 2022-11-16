package cl.infoclub.fsj.contactservice;

import java.util.List;

import cl.infoclub.fsj.entity.Contact;

public interface IContactService {
	List<Contact> getContactList();
	boolean addContact();
	
}
