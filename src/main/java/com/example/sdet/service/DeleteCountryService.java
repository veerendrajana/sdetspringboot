package com.example.sdet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.sdet.controller.DeleteResponseController;
import com.example.sdet.repositories.CountryRepository;

@Component
@Service
public class DeleteCountryService{
	
	@Autowired
	CountryRepository countryRepository;

	public DeleteResponseController deleteCountry(int id) {
		
		countryRepository.deleteById(id);
		
		DeleteResponseController response = new DeleteResponseController();
		
		response.setId(id);
		response.setMessage("Country Deleted");
		
		return response;
	}
}
