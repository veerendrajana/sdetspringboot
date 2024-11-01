package com.example.sdet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sdet.beans.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
