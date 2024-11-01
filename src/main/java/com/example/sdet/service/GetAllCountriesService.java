package com.example.sdet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.sdet.beans.Country;
import com.example.sdet.repositories.CountryRepository;

@Component
@Service
public class GetAllCountriesService {
	
	@Autowired
	CountryRepository countryRepository;

	public List<Country> getAllCountries() {
		
		return countryRepository.findAll();
	}
}
