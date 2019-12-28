package com.example.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecivedAddressDTO {

	private int addressId;
	private String firstAddress;
	/* private String secondAddress; */


	/**
	 * @return the addressId
	 */
	public int getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the firstAddress
	 */
	public String getFirstAddress() {
		return firstAddress;
	}

	/**
	 * @param firstAddress the firstAddress to set
	 */
	public void setFirstAddress(String firstAddress) {
		this.firstAddress = firstAddress;
	}

	/**
	 * @return the secondAddress
	 */
	/*
	 * public String getSecondAddress() { return secondAddress; }
	 */
	/**
	 * @param secondAddress the secondAddress to set
	 */
	/*
	 * public void setSecondAddress(String secondAddress) { this.secondAddress =
	 * secondAddress; }
	 * 
	 */	
		
}
