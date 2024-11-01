package com.example.sdet.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.sdet.beans.Country;
import com.example.sdet.repositories.CountryRepository;

@Component
@Service
public class GetCountryByIdService{
	
	@Autowired
	CountryRepository countryRepository;

	public Country getCountryById(int id) {
		
		Optional<Country> countryById = countryRepository.findById(id);
		
		if(countryById.isPresent()) {
			return countryById.get();
		}
		
		return null;
	}
}
