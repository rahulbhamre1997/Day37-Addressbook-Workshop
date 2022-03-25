package com.addressbook;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

	public class AddressBookTest {
		@Test
		public void givenContactCheckifItIsCorrect() {
			try {
				Contact contacts = new Contact("Rahul", "Bhamre", "Stadium", "Jalgaon", "Maharshtra", 424009,
						"8006060693", "ragul123@gmail.com");
				AddressBook addressBook = new AddressBook();
				addressBook.addContact(contacts);
				List<Contact> contactList = addressBook.getcontactList();
				Assert.assertTrue(contactList.contains(contacts));
				System.out.println(contactList);
			} catch (Exception e) {
				System.out.println("Issue In Adding Contacts");
			}

		}

	
}

				
		

