package com.example.sdet.service;

import java.util.Set;

import com.example.sdet.beans.Country;

public class GetCountryByNameService {
	
	public Country getCountryByName(String name) {
		
		Country country = null;
		
		
		Set<Integer> countryKeySet = CountryService.countryIdMap.keySet();
		
		for(int i : countryKeySet) {
			if(CountryService.countryIdMap.get(i).getCountryName().equals(name)) {
				country = CountryService.countryIdMap.get(i);
			}
		}
		
		return country;
	}
}
