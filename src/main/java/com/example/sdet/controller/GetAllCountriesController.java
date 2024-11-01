package com.example.sdet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sdet.beans.Country;
import com.example.sdet.service.GetAllCountriesService;

@RestController
public class GetAllCountriesController {

	@Autowired
	GetAllCountriesService getAllCountriesService;
	
	@GetMapping("/getcountries")
	public List<Country> getAllCountries() {
		
		return getAllCountriesService.getAllCountries();
	}
}
