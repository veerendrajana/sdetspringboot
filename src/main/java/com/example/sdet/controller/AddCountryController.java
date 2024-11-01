package com.example.sdet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sdet.beans.Country;
import com.example.sdet.service.AddCountryService;

@RestController
public class AddCountryController {
	
	@Autowired
	AddCountryService addCountryService;

	
	@PostMapping("/addcountry")
	public Country addTheCountry(@RequestBody Country country) {
		
		return addCountryService.createCountry(country);
	}
}
