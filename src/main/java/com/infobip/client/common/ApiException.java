
package com.infobip.client.common;

import jakarta.validation.ConstraintViolation;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 * ApiException class.
 * </p>
 */
@SuppressWarnings("serial")
public final class ApiException extends Exception {
    private Set<? extends ConstraintViolation<?>> requestBodyValidationViolations = null;
    private int responseCode = 0;
    private Map<String, List<String>> responseHeaders = null;
    private String responseBody = null;

    /**
     * <p>
     * Constructor for ApiException.
     * </p>
     */
    public ApiException() {}

    /**
     * <p>
     * Constructor for ApiException.
     * </p>
     *
     * @param throwable a {@link java.lang.Throwable} object
     */
    public ApiException(Throwable throwable) {
        super(throwable);
    }

    /**
     * <p>
     * Constructor for ApiException.
     * </p>
     *
     * @param message the error message
     */
    public ApiException(String message) {
        super(message);
    }

    /**
     * <p>
     * Constructor for ApiException.
     * </p>
     *
     * @param message the error message
     * @param requestBodyValidationViolations a set of
     *     {@link jakarta.validation.ConstraintViolation}
     *     instances
     */
    public ApiException(String message,
            Set<? extends ConstraintViolation<?>> requestBodyValidationViolations) {
        super(message);
        this.requestBodyValidationViolations = requestBodyValidationViolations;
    }

    /**
     * <p>
     * Constructor for ApiException.
     * </p>
     *
     * @param message the error message
     * @param throwable a {@link java.lang.Throwable} object
     * @param responseCode HTTP status responseCode
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(String message, Throwable throwable, int responseCode,
            Map<String, List<String>> responseHeaders, String responseBody) {
        super(message, throwable);
        this.responseCode = responseCode;
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    /**
     * <p>
     * Constructor for ApiException.
     * </p>
     *
     * @param message the error message
     * @param responseCode HTTP status responseCode
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(String message, int responseCode, Map<String, List<String>> responseHeaders,
            String responseBody) {
        this(message, (Throwable) null, responseCode, responseHeaders, responseBody);
    }

    /**
     * <p>
     * Constructor for ApiException.
     * </p>
     *
     * @param message the error message
     * @param throwable a {@link java.lang.Throwable} object
     * @param responseCode HTTP status responseCode
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     */
    public ApiException(String message, Throwable throwable, int responseCode,
            Map<String, List<String>> responseHeaders) {
        this(message, throwable, responseCode, responseHeaders, null);
    }

    /**
     * <p>
     * Constructor for ApiException.
     * </p>
     *
     * @param responseCode HTTP status responseCode
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(int responseCode, Map<String, List<String>> responseHeaders,
            String responseBody) {
        this((String) null, (Throwable) null, responseCode, responseHeaders, responseBody);
    }

    /**
     * <p>
     * Constructor for ApiException.
     * </p>
     *
     * @param responseCode HTTP status responseCode
     * @param message a {@link java.lang.String} object
     */
    public ApiException(int responseCode, String message) {
        super(message);
        this.responseCode = responseCode;
    }

    /**
     * <p>
     * Constructor for ApiException.
     * </p>
     *
     * @param responseCode HTTP status responseCode
     * @param message the error message
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(int responseCode, String message, Map<String, List<String>> responseHeaders,
            String responseBody) {
        this(responseCode, message);
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    /**
     * <p>
     * Get the Request body validation violations.
     * </p>
     *
     * @return A set of {@link jakarta.validation.ConstraintViolation} instances
     *     which you can iterate over in
     *     order to see which validation errors occurred
     */
    public Set<? extends ConstraintViolation<?>> getRequestBodyValidationViolations() {
        return requestBodyValidationViolations;
    }

    /**
     * <p>
     * Get the HTTP status responseCode.
     * </p>
     *
     * @return HTTP status responseCode
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * <p>
     * Get the HTTP response headers.
     * </p>
     *
     * @return A map of list of string
     */
    public Map<String, List<String>> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * <p>
     * Get the HTTP response body.
     * </p>
     *
     * @return Response body in the form of string
     */
    public String getResponseBody() {
        return responseBody;
    }
}
