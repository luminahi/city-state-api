package com.luminahi.apicity.model;

import com.luminahi.apicity.enums.State;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StateValidator implements ConstraintValidator<ValidState, State>{
    
    @Override
    public boolean isValid(State value, ConstraintValidatorContext context) {
        if (value == null) return false;
        return value.ordinal() >= 0 || value.ordinal() <= 26;
    }
}
