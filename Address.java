package com.subodh.SpringBeans;

public class Address {

	private int houseNo;
	private String city;
	private int pincode;
	
	public Address(int houseNo, String city, int pincode) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}
