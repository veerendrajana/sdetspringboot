package com.example.sdet.service;

import com.example.sdet.controller.DeleteResponseController;

public class DeleteCountryService {

	public DeleteResponseController deleteCountry(int id) {
		
		CountryService.countryIdMap.remove(id);
		
		DeleteResponseController response = new DeleteResponseController();
		
		response.setId(id);
		response.setMessage("Country Deleted");
		
		return response;
	}
}
