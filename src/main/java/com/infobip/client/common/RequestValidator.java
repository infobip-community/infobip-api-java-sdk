
package com.infobip.client.common;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.List;
import java.util.Set;

public final class RequestValidator {
    private static final String PATH_PARAMETER_MISSING_ERR = "Path parameter is missing [%s]";
    private static final String BODY_MISSING_ERR = "Request body is missing";
    private static final String BODY_VALIDATION_ERR = "Request body validation error(s)";
    private static final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    private RequestValidator() {}

    public static void validate(List<String> pathParameters, Object body) throws ApiException {
        validatePathParameters(pathParameters);
        validateBody(body);
    }

    public static void validatePathParameters(List<String> pathParameters) throws ApiException {
        if (pathParameters == null || pathParameters.isEmpty()) {
            throw new ApiException();
        }
        for (String pathParameter : pathParameters) {
            if (pathParameter == null || pathParameter.isEmpty()) {
                throw new ApiException(String.format(PATH_PARAMETER_MISSING_ERR,
                        pathParameters.indexOf(pathParameter)));
            }
        }
    }

    public static void validateBody(Object body) throws ApiException {
        if (body == null) {
            throw new ApiException(BODY_MISSING_ERR);
        }
        Set<? extends ConstraintViolation<?>> violations = getValidator().validate(body);
        if (!violations.isEmpty()) {
            throw new ApiException(BODY_VALIDATION_ERR, violations);
        }
    }

    public static Validator getValidator() {
        return factory.getValidator();
    }
}
