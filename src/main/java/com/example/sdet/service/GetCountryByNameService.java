package com.example.sdet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.sdet.beans.Country;
import com.example.sdet.repositories.CountryRepository;

@Component
@Service
public class GetCountryByNameService {
	
	@Autowired
	CountryRepository countryRepository;
	
	public Country getCountryByName(String name) {
		
		Country country = null;
		
		List<Country> countries = countryRepository.findAll();
		
		for(Country con : countries) {
			if(con.getCountryName().equalsIgnoreCase(name)) {
				country = con;
			}
		}
		
		
		return country;
	}
}
