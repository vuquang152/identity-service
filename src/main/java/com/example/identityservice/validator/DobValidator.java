package com.example.identityservice.validator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DobValidator implements ConstraintValidator<DobConstraint, LocalDate> {

    private int min;

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        if (Objects.isNull(value)) return true;

        long years = Period.between(value, LocalDate.now()).getYears();
        return years >= min;
    }

    @Override
    public void initialize(DobConstraint constrainAnnotation) {
        ConstraintValidator.super.initialize(constrainAnnotation);
        min = constrainAnnotation.min();
    }
}
