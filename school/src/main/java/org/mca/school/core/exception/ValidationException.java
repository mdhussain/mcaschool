package org.mca.school.core.exception;

import javax.validation.ConstraintViolation;

/**
 * Created by Hussain on 10/28/15.
 */
public class ValidationException extends AppException {
    private String[] errors;

    public ValidationException (String... validations)
    {
        this.errors = validations;
    }

    @Override
    public String getMessage() {
        StringBuilder error = new StringBuilder();
        for (String err : errors) {
            error.append(err);
            error.append('\n');
        }
        return error.toString();
    }
}
