package com.addressbook;

import java.util.ArrayList;
import java.util.List;


public class AddressBook {
	List<Contact> contactList = new ArrayList<Contact>();

	public void addContact(Contact contacts) {
		contactList.add(contacts);
	}

	public List<Contact> getcontactList() {
		return contactList;
	}
}