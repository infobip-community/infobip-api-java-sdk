
package io.github.infobip_community.client.channels.email.api;

import static io.github.infobip_community.client.common.RequestValidator.validateBody;
import io.github.infobip_community.client.channels.email.model.EmailValidateAddress;
import io.github.infobip_community.client.channels.email.model.response.EmailValidationResponse;
import io.github.infobip_community.client.common.ApiCallback;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import io.github.infobip_community.client.common.ApiResponse;
import io.github.infobip_community.client.common.HttpHeader;
import io.github.infobip_community.client.common.HttpMethodType;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;

@SuppressWarnings("rawtypes")
public final class EmailValidationApi {
    private static final String VALIDATE_EMAIL_ADDRESSES_ENDPOINT = "/email/2/validation";
    private ApiClient apiClient;

    public EmailValidationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Validate email addresses.<br>
     * Run validation to identify poor quality emails to clean up your recipient
     * list.
     * </p>
     *
     * @param emailValidateAddress (optional)
     * @return ApiResponse&lt;EmailValidationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href="https://www.infobip.com/docs/email/validation">Validate email
     *     addresses Documentation</a>
     */
    public ApiResponse<EmailValidationResponse> validateEmailAddresses(
            final EmailValidateAddress emailValidateAddress) throws ApiException {
        validateBody(emailValidateAddress);
        Call call = validateEmailAddressesCall(emailValidateAddress);
        return apiClient.execute(call, EmailValidationResponse.class);
    }

    /**
     * <p>
     * Validate email addresses (asynchronously).<br>
     * Run validation to identify poor quality emails to clean up your recipient
     * list.
     * </p>
     *
     * @param emailValidateAddress (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href="https://www.infobip.com/docs/email/validation">Validate email
     *     addresses Documentation</a>
     */
    public Call validateEmailAddressesAsync(final EmailValidateAddress emailValidateAddress,
            final ApiCallback<EmailValidationResponse> apiCallback) throws ApiException {
        validateBody(emailValidateAddress);
        Call call = validateEmailAddressesCall(emailValidateAddress, apiCallback);
        apiClient.executeAsync(call, EmailValidationResponse.class, apiCallback);
        return call;
    }

    private Call validateEmailAddressesCall(final EmailValidateAddress emailValidateAddress)
            throws ApiException {
        return validateEmailAddressesCall(emailValidateAddress, null);
    }

    private Call validateEmailAddressesCall(final EmailValidateAddress emailValidateAddress,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(VALIDATE_EMAIL_ADDRESSES_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, emailValidateAddress, apiCallback);
    }
}
