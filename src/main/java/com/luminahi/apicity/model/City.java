package com.luminahi.apicity.model;

import java.util.Objects;

import com.luminahi.apicity.enums.State;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class City {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false, length = 128)
    private String city;
    
    @Column(nullable = false)
    private State state;
    
    public City(String city, State state) {
        this.city = city;
        this.state = state;
    }

    public City() {}
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public State getState() {
        return state;
    }
    
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        City other = (City) obj;
        return Objects.equals(id, other.id) && Objects.equals(city, other.city);
    }

    @Override
    public String toString() {
        return "City [city=" + city + "]";
    }
}
