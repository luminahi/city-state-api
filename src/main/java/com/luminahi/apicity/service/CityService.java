package com.luminahi.apicity.service;

import org.springframework.stereotype.Service;

import com.luminahi.apicity.repository.CityRepository;

@Service
public class CityService {
    
    private CityRepository repository;
    
    public CityService(CityRepository repository) {
        this.repository = repository;
    }
    
    public CityRepository getRepository() {
        return repository;
    }
}
