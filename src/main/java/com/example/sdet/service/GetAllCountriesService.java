package com.example.sdet.service;

import java.util.ArrayList;
import java.util.List;

import com.example.sdet.beans.Country;

public class GetAllCountriesService {

	public List<Country> getAllCountries() {
		
		List<Country> countries = new ArrayList<>(CountryService.countryIdMap.values());
		
		return countries;
	}
}
