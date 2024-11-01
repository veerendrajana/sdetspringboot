package com.example.sdet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sdet.beans.Country;
import com.example.sdet.service.GetCountryByNameService;

@RestController
public class GetCountryByNameController {

	@Autowired
	GetCountryByNameService getCountryByNameService;
	
	@GetMapping("/getcountries/countryname")
	public ResponseEntity<Country> getCountryByName(@RequestParam(name = "name") String countryName) {
		
		try {
			
			Country country = getCountryByNameService.getCountryByName(countryName);
			return new ResponseEntity<Country>(country,HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
