package com.asaarnak.contact.service;

import java.util.List;

import com.asaarnak.contact.form.Contact;


public interface ContactService {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
