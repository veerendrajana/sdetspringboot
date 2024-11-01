package com.example.sdet.utilities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.sdet.beans.Country;
import com.example.sdet.repositories.CountryRepository;

public class GetNumberOfRecords {
	
	@Autowired
	CountryRepository countryRepository;

	public int getMaxId() {
		
		List<Country> countries = countryRepository.findAll();
		
		return countries.size() + 1;
	}
}
