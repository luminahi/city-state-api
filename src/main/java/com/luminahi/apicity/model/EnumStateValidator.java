package com.luminahi.apicity.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.luminahi.apicity.enums.State;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EnumStateValidator  implements ConstraintValidator<EnumStatePattern, State>{
    
    private Pattern pattern;
    
    @Override
    public void initialize(EnumStatePattern annotation) {
        pattern = Pattern.compile(annotation.regexp());
    }
    
    @Override
    public boolean isValid(State value, ConstraintValidatorContext context) {
        if (value == null) return true;
        Matcher result = pattern.matcher(value.name());
        return result.matches();
    }
}
