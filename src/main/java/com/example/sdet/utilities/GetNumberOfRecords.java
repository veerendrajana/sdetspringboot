package com.example.sdet.utilities;

import com.example.sdet.service.CountryService;

public class GetNumberOfRecords {

	public static int getMaxId() {
		
		return CountryService.countryIdMap.keySet().size() + 1;
	}
}
