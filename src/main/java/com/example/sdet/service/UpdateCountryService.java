package com.example.sdet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.sdet.beans.Country;
import com.example.sdet.repositories.CountryRepository;

@Component
@Service
public class UpdateCountryService{
	
	@Autowired
	CountryRepository countryRepository;

	public Country updateCountry(Country country) {
		
		countryRepository.save(country);
		
		return country;
		
	}
}
