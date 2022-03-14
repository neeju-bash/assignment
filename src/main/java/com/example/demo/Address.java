package com.example.demo;


public class Address {
	
	private String street;
	private String city;
	private String state;
	private String Country;
	
	private String zip;
	
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", Country=" + Country + ", zip="
				+ zip + "]";
	}
	public Address() {
		System.out.print("true");
	}
}
