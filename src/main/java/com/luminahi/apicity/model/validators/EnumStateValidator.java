package com.luminahi.apicity.model.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.luminahi.apicity.model.annotations.EnumStatePattern;
import com.luminahi.apicity.model.enums.State;

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
