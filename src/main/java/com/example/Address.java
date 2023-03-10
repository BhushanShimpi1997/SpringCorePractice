package com.example;

import org.springframework.stereotype.Component;

public class Address {
	
	private String streetName;
	private String cityName;
	private long pinCode;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", cityName=" + cityName + ", pinCode=" + pinCode + "]";
	}
	
	

}
