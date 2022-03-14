package com.example.demo;

public class Customer {
	
	private String customerId;
	private String customerName;
	private String customerContact;
	
	private Address customerAddress;

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public void setCustomerAddress(Address custmerAddress) {
		this.customerAddress = custmerAddress;
	}

	void displayInfo(){  
	    System.out.println(customerId+" "+ customerName+" "+ customerContact);  
	    System.out.println(customerAddress);  
	}  
	
}
