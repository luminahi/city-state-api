package com.luminahi.apicity.controller;

import java.net.URI;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.luminahi.apicity.model.City;
import com.luminahi.apicity.model.exceptions.CityNotFoundException;
import com.luminahi.apicity.service.CityService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cidades")
public class CityController {
    
    CityService service;
    
    public CityController(CityService service) {
        this.service = service;
    }
    
    @GetMapping
    public Page<City> getAllCities(Pageable pageable) {
        return service.getRepository().findAll(pageable);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<City> getCity(@PathVariable Integer id) throws CityNotFoundException {
        City city = service.getRepository().findById(id)
            .orElseThrow(() -> new CityNotFoundException(
                "Cidade com o id: " + id + " não foi achada"
            ));
        
        return ResponseEntity.ok(city);
    }
    
    @PostMapping
    public ResponseEntity<?> createCity(@Valid @RequestBody City city) {
        City newCity = service.getRepository().save(city);
        
        URI uriOfNewResource = ServletUriComponentsBuilder
                .fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(newCity.getId())
                .toUri();
        
        return ResponseEntity.created(uriOfNewResource).build();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> updateCity(@Valid @RequestBody City city, @PathVariable Integer id) {
        service.getRepository().findById(id).map(modifiedCity -> {
           modifiedCity.setCity(city.getCity());
           modifiedCity.setState(city.getState());
           return service.getRepository().save(modifiedCity);
        }).orElseGet(() -> service.getRepository().save(city));
        
        return ResponseEntity.noContent().build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCity(@PathVariable Integer id) {
        service.getRepository().deleteById(id);
        
        return ResponseEntity.noContent().build();
    }
}
