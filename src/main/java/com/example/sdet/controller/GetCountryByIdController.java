package com.example.sdet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.sdet.beans.Country;
import com.example.sdet.service.GetCountryByIdService;

@RestController
public class GetCountryByIdController {

	@Autowired
	GetCountryByIdService getCountryByIdservice;
	
	@GetMapping("/getcountries/{id}")
	public ResponseEntity<Country> getCountryById(@PathVariable int id) {
		
		try {
			
			return new ResponseEntity<Country>(getCountryByIdservice.getCountryById(id),HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<Country>(HttpStatus.NOT_FOUND);
		}
	}
}
