package cl.infoclub.fsj.contactserviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.ModelMap;

import cl.infoclub.fsj.contactservice.IContactService;
import cl.infoclub.fsj.entity.Contact;

public class ContactServiceImpl implements IContactService{
	IContactService contactoService;
	
	Contact contact;
	private List<Contact> listContact=new ArrayList<Contact>();
	
	@Override
	public List<Contact> getContactList(ModelMap model) {
		model.put("listContact", listContact);
		return listContact;
	}

	

	@Override
	public String addContact(ModelMap model, Contact contact) {
		if (listContact.size()==0) {
			contact.setIdContact(listContact.size()+1);
		}else {
			int index = 0;
			for(int i =0; i<listContact.size();i++) {
				if (listContact.get(i).getIdContact()>index) {
					index=(listContact.get(i).getIdContact());
				}
			}
			index+=1;
			contact.setIdContact(index);
		}
		
		
		listContact.add(contact);
		model.put("listContact", listContact);
		
		return "Listo";
	}

	


	@Override
	public String deleteContact(ModelMap model, int id) {
		listContact.remove(id - 1);
		model.put("listContact", listContact);
		
		return "Listo";
	}



	public ContactServiceImpl(IContactService contactoService, Contact contact, List<Contact> listContact) {
		super();
		this.contactoService = contactoService;
		this.contact = contact;
		this.listContact = listContact;
	}



	public ContactServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
}
