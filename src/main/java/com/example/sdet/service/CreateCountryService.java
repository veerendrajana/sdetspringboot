package com.example.sdet.service;

import com.example.sdet.beans.Country;
import com.example.sdet.utilities.GetNumberOfRecords;

public class CreateCountryService {

	public Country createCountry(Country country) {
		
		country.setId(GetNumberOfRecords.getMaxId());
		
		CountryService.countryIdMap.put(country.getId(), country);
		
		return country;
	}
}
