
package com.infobip.client.common;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public enum ModelValidator {
    INSTANCE;

    private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    private ModelValidator() {}

    public Validator getValidator() {
        return factory.getValidator();
    }
}
