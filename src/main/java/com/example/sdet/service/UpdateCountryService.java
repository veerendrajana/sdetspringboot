package com.example.sdet.service;

import com.example.sdet.beans.Country;

public class UpdateCountryService {

	public Country updateCountry(Country country) {
		
		if(country.getId() > 0) {
			CountryService.countryIdMap.put(country.getId(), country);
		}
		
		return country;
	}
}
