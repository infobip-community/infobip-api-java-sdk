
package io.github.infobip_community.client.common;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.List;
import java.util.Set;

public final class RequestValidator {
    private static final String PATH_PARAMETER_MISSING_ERR = "Path parameter is missing [%s]";
    private static final String REQUEST_MISSING_ERR = "Request object is missing";
    private static final String REQUEST_VALIDATION_ERR = "Request object [%s] validation error(s)";
    private static final ValidatorFactory FACTORY = Validation.buildDefaultValidatorFactory();

    private RequestValidator() {}

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
        validateRequest(body);
    }

    public static void validateQueryString(Object queryString) throws ApiException {
        validateRequest(queryString);
    }

    private static void validateRequest(Object request) throws ApiException {
        if (request == null) {
            throw new ApiException(REQUEST_MISSING_ERR);
        }
        Set<? extends ConstraintViolation<?>> violations = getValidator().validate(request);
        if (!violations.isEmpty()) {
            throw new ApiException(
                    String.format(REQUEST_VALIDATION_ERR, request.getClass().getSimpleName()),
                    violations);
        }
    }

    public static Validator getValidator() {
        return FACTORY.getValidator();
    }
}
