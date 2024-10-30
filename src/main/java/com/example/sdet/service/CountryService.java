package com.example.sdet.service;

import java.util.HashMap;

import com.example.sdet.beans.Country;

public class CountryService {

	public static HashMap<Integer,Country> countryIdMap;
	
	public CountryService() {
		
		countryIdMap = new HashMap<>();
		
		Country countryIndia = new Country(1,"India","Delhi");
		Country countryUSA = new Country(2,"USA","Washington DC");
		Country countrySriLanka = new Country(3, "Sri Lanka","Colombo");
		
		countryIdMap.put(1, countryIndia);
		countryIdMap.put(2, countryUSA);
		countryIdMap.put(3, countrySriLanka);
	}
}
