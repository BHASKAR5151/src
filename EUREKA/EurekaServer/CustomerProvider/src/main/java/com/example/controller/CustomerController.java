/**
 * 
 */
package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.beans.RecivedAddressDTO;

/**
 * @author Dongala.Reddy
 *
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	public RestTemplate template;

	@GetMapping("/getCustMsg")
	public String getMessage() {
		return "Bhaskar";
	}
	
	// TODO @RequestParam @RequestBody
	// public RecivedAddressDTO getCustomerDeatils(@PathVariable("custId") String
	// custId) {
	@GetMapping("/getCustAddr")
	public ResponseEntity<RecivedAddressDTO> getCustomerDeatils(@Param("custId") String custId) {
		RecivedAddressDTO addressDto = template.getForObject("http://localhost:8082/address/getCustAddr/" + custId,
				RecivedAddressDTO.class);
		return new ResponseEntity<RecivedAddressDTO>(addressDto,HttpStatus.OK);
	}
	
	@PostMapping("/getCustAddrWithPost")
	public RecivedAddressDTO getCustomerDeatilsWithPost(@RequestBody RecivedAddressDTO custId) {
		RecivedAddressDTO addressDto = template.getForObject("http://localhost:8082/address/getCustAddr/" + custId,
				RecivedAddressDTO.class);
		return addressDto;
	}
	
}
