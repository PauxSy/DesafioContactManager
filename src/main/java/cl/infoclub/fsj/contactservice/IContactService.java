package cl.infoclub.fsj.contactservice;

import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import cl.infoclub.fsj.entity.Contact;

public interface IContactService {
	List<Contact> getContactList(ModelMap model);
	String addContact(ModelMap model, @ModelAttribute("contact") Contact contact);
	String deleteContact(ModelMap model, @RequestParam("id") int id);
}
