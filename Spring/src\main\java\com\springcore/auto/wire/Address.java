package com.springcore.auto.wire;

public class Address {
	private String street;
	private String city;
	private String country;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		System.out.println("setting street");
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("setting city");
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		System.out.println("setting country");
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + "]";
	}
	
	
	
}
