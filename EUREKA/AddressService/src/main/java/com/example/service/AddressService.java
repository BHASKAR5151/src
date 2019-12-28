package com.example.service;

import org.springframework.stereotype.Service;

import com.example.beans.AddressForm;

@Service
public class AddressService {

	public AddressForm getAddress(String custId) {
		return new AddressForm(123,"Anantapur","Bangalore");
	}

}
