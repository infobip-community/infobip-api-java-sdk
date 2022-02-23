
package com.infobip.client.common;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * API response returned by API call.
 * <p>
 */
public final class ApiResponse<T> {
    private final int statusCode;
    private final Map<String, List<String>> headers;
    private final T data;

    /**
     * <p>
     * Constructor for ApiResponse.
     * </p>
     *
     * @param statusCode The status code of HTTP response
     * @param headers The headers of HTTP response
     */
    public ApiResponse(int statusCode, Map<String, List<String>> headers) {
        this(statusCode, headers, null);
    }

    /**
     * <p>
     * Constructor for ApiResponse.
     * </p>
     *
     * @param statusCode The status code of HTTP response
     * @param headers The headers of HTTP response
     * @param data The object deserialized from response bod
     */
    public ApiResponse(int statusCode, Map<String, List<String>> headers, T data) {
        this.statusCode = statusCode;
        this.headers = headers;
        this.data = data;
    }

    /**
     * <p>
     * Get the <code>status code</code>.
     * </p>
     *
     * @return the status code
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * Get the <code>headers</code>.
     * </p>
     *
     * @return a {@link java.util.Map} of headers
     */
    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * Get the <code>data</code>.
     * </p>
     *
     * @return the data
     */
    public T getData() {
        return data;
    }
}
