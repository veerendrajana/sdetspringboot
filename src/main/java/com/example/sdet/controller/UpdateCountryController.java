package com.example.sdet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sdet.beans.Country;
import com.example.sdet.service.GetCountryByIdService;
import com.example.sdet.service.UpdateCountryService;

@RestController
public class UpdateCountryController {

	@Autowired UpdateCountryService updateCountryService;
	
	@Autowired
	GetCountryByIdService getCountryByIdService;
	
	@PutMapping("/updatecountry/{id}")
	public ResponseEntity<Country> updateCountry(@PathVariable int id, @RequestBody Country country) {
		
		try {
			Country existCountry = getCountryByIdService.getCountryById(id);
			
			existCountry.setCountryCapital(country.getCountryCapital());
			existCountry.setCountryName(country.getCountryName());
			
			Country updated_country = updateCountryService.updateCountry(existCountry);
			return new ResponseEntity<Country>(updated_country,HttpStatus.OK);
			
		}catch(Exception e) {
			
			return new ResponseEntity<Country>(HttpStatus.CONFLICT);
		}
	}
}
