package com.example.sdet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.sdet.service.DeleteCountryService;

@RestController
public class DeleteCountryController {

	@Autowired
	DeleteCountryService deleteCountryService;
	
	@DeleteMapping("/deletecountry/{id}")
	public DeleteResponseController deleteCountr(@PathVariable int id) {
		
		return deleteCountryService.deleteCountry(id);
	}
}
