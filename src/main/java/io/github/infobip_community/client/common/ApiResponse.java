
package io.github.infobip_community.client.common;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * API response returned by API call.
 * <p>
 */
@SuppressWarnings("rawtypes")
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((headers == null) ? 0 : headers.hashCode());
        result = prime * result + statusCode;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiResponse)) {
            return false;
        }
        ApiResponse other = (ApiResponse) obj;
        if (data == null) {
            if (other.data != null) {
                return false;
            }
        } else if (!data.equals(other.data)) {
            return false;
        }
        if (headers == null) {
            if (other.headers != null) {
                return false;
            }
        } else if (!headers.equals(other.headers)) {
            return false;
        }
        if (statusCode != other.statusCode) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ApiResponse [statusCode=" + statusCode + ", headers=" + headers + ", data=" + data
                + "]";
    }
}
