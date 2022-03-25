package com.addressbook;

public class Contact {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipcode;
	private String phoneNo;
	private String email;

	public Contact(String firstName, String lastName, String address, String city, String state, int zipcode,
			String phoneNo, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zipcode=" + zipcode + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}

}
	
}
