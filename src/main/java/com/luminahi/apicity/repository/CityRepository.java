package com.luminahi.apicity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luminahi.apicity.model.City;

public interface CityRepository extends JpaRepository<City, Integer> {

}
