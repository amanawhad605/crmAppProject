package com.crm1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm1.entities.Contacts;
import com.crm1.repositories.ContactRepository2;
@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository2 contactRepo;

	@Override
	public void saveOneContact(Contacts contact) {
	contactRepo.save(contact);

	}

}
