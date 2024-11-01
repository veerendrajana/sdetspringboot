package com.example.sdet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.sdet.beans.Country;
import com.example.sdet.repositories.CountryRepository;

@Component
@Service
public class AddCountryService {
	
	@Autowired
	CountryRepository countryRepository;

	public Country createCountry(Country country) {
		
		country.setId(getMaxId());
		
		countryRepository.save(country);
		
		return country;
	}
	
	public int getMaxId() {
		
		List<Country> countries = countryRepository.findAll();
		
		return countries.size() + 1;
	}
}
