package com.luminahi.apicity.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class HttpMessageNotReadableAdvice {
    
    @ResponseBody
    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String httpMessageNotReadableHandler(HttpMessageNotReadableException ex) {
        return "providencie um número de 0 a 26 inclusos ou nome de estado" 
                + " brasileiro com underlines e caixa alta como"
                + " SAO_PAULO, RIO_DE_JANEIRO ou RIO_GRANDE_DO_NORTE";
    }
}


