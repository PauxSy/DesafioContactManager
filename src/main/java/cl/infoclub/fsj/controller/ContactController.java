package cl.infoclub.fsj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.infoclub.fsj.entity.Contact;
@Controller
@RequestMapping(value="/contactManager", method = RequestMethod.GET)
public class ContactController {
	@Autowired
	Contact contact;
	
	private List<Contact> listContact;

	ContactController() {
		super();
		listContact = new ArrayList<Contact>();
	}
	
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	@RequestMapping(value="/getContact", method = RequestMethod.GET)
	public String getContactList(ModelMap model) {
		
		if(contact.getIdContact() > 0) {
			listContact.add(contact);
		}
		
		model.put("listContact", listContact);
		
		return "contactManager";
	}
	
	@RequestMapping(value="/addContact", method = RequestMethod.POST)
	public String addContact(ModelMap model, @ModelAttribute("contact") Contact contact) {
		contact.setIdContact(listContact.size() + 1);
		listContact.add(contact);
		model.put("listContact", listContact);
		return "contactManager";
	}
	
	@RequestMapping(value="/deleteContact", method = RequestMethod.GET)
	public String deleteContact(ModelMap model, @RequestParam("id") int id) {
		listContact.remove(id - 1);
		model.put("listContact", listContact);
		return "contactManager";
	}
}
