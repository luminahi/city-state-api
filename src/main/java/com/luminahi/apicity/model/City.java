package com.luminahi.apicity.model;

import java.util.Objects;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.luminahi.apicity.enums.State;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@JsonSerialize(using = StateSerializer.class)
public class City {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotBlank(message = "um nome de cidade deve ser providenciado")
    @Column(nullable = false, length = 128)
    private String city;

    @NotNull(message = "um número ou nome de estado deve ser providenciado")
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
