package cl.infoclub.fsj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.infoclub.fsj.contactservice.IContactService;
import cl.infoclub.fsj.contactserviceimpl.ContactServiceImpl;
import cl.infoclub.fsj.entity.Contact;
@Controller
@RequestMapping(value="/contactManager", method = RequestMethod.GET)
public class ContactController {
	ContactServiceImpl contactoService = new ContactServiceImpl();
	//IContactService contactoService;
	
	
	
	@RequestMapping(value="/getContact", method = RequestMethod.GET)
	public String getContactList(ModelMap model) {
		contactoService.getContactList(model);
		
		return "contactManager";
	}
	
	@RequestMapping(value="/addContact", method = RequestMethod.POST)
	public String addContact(ModelMap model, @ModelAttribute("contact") Contact contact) {
		contactoService.addContact(model, contact);
		return "contactManager";
	}
	
	@RequestMapping(value="/deleteContact", method = RequestMethod.GET)
	public String deleteContact(ModelMap model, @RequestParam("id") int id) {
		
		contactoService.deleteContact(model, id);
		return "contactManager";
	}
}
