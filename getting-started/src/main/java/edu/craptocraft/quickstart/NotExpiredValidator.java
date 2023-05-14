package edu.craptocraft.quickstart;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NotExpiredValidator implements ConstraintValidator<NotExpired, LocalDate> {

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        LocalDate now = LocalDate.now();

        return ChronoUnit.YEARS.between(now, value) > 0;

    }

}
