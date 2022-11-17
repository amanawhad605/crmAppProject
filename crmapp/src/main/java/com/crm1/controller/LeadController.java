package com.crm1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm1.entities.Contacts;
import com.crm1.entities.Lead;
import com.crm1.services.ContactService;
import com.crm1.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadservice;
	@Autowired
	private ContactService contactservice;
	
	@RequestMapping("/viewLeadPage")
	public String viewLeadPage(){
		return "creat_lead";
		
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead")Lead lead, ModelMap model) {
		leadservice.saveOneLead(lead);
		model.addAttribute("lead", lead);
		
		return"lead_info";
		
	}
	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("email") String email,ModelMap model) {
		model.addAttribute("email", email);
		
		return "compose_email";
		
	}
	@RequestMapping("/convertLead")
	public String convertlead(@RequestParam("id")long id) {
		Lead lead = leadservice.getOneLead(id);
		Contacts contact=new Contacts();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		contactservice.saveOneContact(contact);
		
		
		
		leadservice.deleteOneLead(lead.getId());
		 
		return"";
	}

}
