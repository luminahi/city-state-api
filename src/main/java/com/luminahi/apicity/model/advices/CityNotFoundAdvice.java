package com.luminahi.apicity.model.advices;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.luminahi.apicity.model.exceptions.CityNotFoundException;

@ControllerAdvice
public class CityNotFoundAdvice {
    
    @ResponseBody
    @ExceptionHandler(CityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    Map<String, String> cityNotFoundHandler(CityNotFoundException ex) {
        return Map.of(HttpStatus.NOT_FOUND.toString(), ex.getMessage());
    }
}
