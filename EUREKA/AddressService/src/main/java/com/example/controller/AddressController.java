/**
 * 
 */
package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.beans.AddressForm;
import com.example.service.AddressService;

/**
 * @author Dongala.Reddy
 *
 */
@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	public RestTemplate resttemplate;

	@Autowired
	public AddressService service;

	@GetMapping("/getCustAddr/{custId}")
	public AddressForm getCustomerAddress(@PathVariable("custId") String custId) {
		return service.getAddress(custId);
	}
	
	
}
