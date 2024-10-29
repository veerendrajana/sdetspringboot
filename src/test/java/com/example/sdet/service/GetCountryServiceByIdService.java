package com.example.sdet.service;

import com.example.sdet.beans.Country;

public class GetCountryServiceByIdService {

	public Country getCountryById(int id) {
		
		return CountryService.countryIdMap.get(id);
	}
}
