
package com.infobip.client.common;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * Callback for asynchronous API call.
 * </p>
 *
 * @param <T> The return type
 */
public interface ApiCallback<T> {
    /**
     * <p>
     * This is called when the API call fails.
     * </p>
     *
     * @param e The exception causing the failure
     * @param statusCode Status code of the response if available, otherwise it
     * would be 0
     * @param responseHeaders Headers of the response if available, otherwise it
     * would be null
     */
    void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders);
    /**
     * <p>
     * This is called when the API call succeeded.
     * </p>
     *
     * @param result The result deserialized from response
     * @param statusCode Status code of the response
     * @param responseHeaders Headers of the response
     */
    void onSuccess(T result, int statusCode, Map<String, List<String>> responseHeaders);
}
