
package io.github.infobip_community.client.channels.sms.api;

import static io.github.infobip_community.client.common.QueryStringBuilder.buildQueryString;
import static io.github.infobip_community.client.common.RequestValidator.validateBody;
import static io.github.infobip_community.client.common.RequestValidator.validatePathParameters;
import static io.github.infobip_community.client.common.RequestValidator.validateQueryString;
import io.github.infobip_community.client.channels.sms.model.tfa.application.TfaApplication;
import io.github.infobip_community.client.channels.sms.model.tfa.application.TfaQueryStringVerificationStatus;
import io.github.infobip_community.client.channels.sms.model.tfa.application.response.TfaApplicationResponse;
import io.github.infobip_community.client.channels.sms.model.tfa.application.response.TfaVerificationResponse;
import io.github.infobip_community.client.channels.sms.model.tfa.pin.TfaQueryStringSendPinCode;
import io.github.infobip_community.client.channels.sms.model.tfa.pin.TfaResendPinCode;
import io.github.infobip_community.client.channels.sms.model.tfa.pin.TfaSendPinCode;
import io.github.infobip_community.client.channels.sms.model.tfa.pin.TfaVerifyPhoneNumber;
import io.github.infobip_community.client.channels.sms.model.tfa.pin.response.TfaStartAuthenticationResponse;
import io.github.infobip_community.client.channels.sms.model.tfa.pin.response.TfaVerifyPinResponse;
import io.github.infobip_community.client.channels.sms.model.tfa.template.TfaCreateMessage;
import io.github.infobip_community.client.channels.sms.model.tfa.template.response.TfaTemplateResponse;
import io.github.infobip_community.client.common.ApiCallback;
import io.github.infobip_community.client.common.ApiClient;
import io.github.infobip_community.client.common.ApiException;
import io.github.infobip_community.client.common.ApiResponse;
import io.github.infobip_community.client.common.HttpHeader;
import io.github.infobip_community.client.common.HttpMethodType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Call;

@SuppressWarnings("rawtypes")
public final class TfaApi {
    private static final String GET_TFA_APPLICATIONS_ENDPOINT = "/2fa/2/applications";
    private static final String CREATE_TFA_APPLICATION_ENDPOINT = "/2fa/2/applications";
    private static final String GET_TFA_APPLICATION_ENDPOINT = "/2fa/2/applications/{appId}";
    private static final String UPDATE_TFA_APPLICATION_ENDPOINT = "/2fa/2/applications/{appId}";
    private static final String GET_TFA_MESSAGE_TEMPLATES_ENDPOINT =
            "/2fa/2/applications/{appId}/messages";
    private static final String CREATE_TFA_MESSAGE_TEMPLATE_ENDPOINT =
            "/2fa/2/applications/{appId}/messages";
    private static final String GET_TFA_MESSAGE_TEMPLATE_ENDPOINT =
            "/2fa/2/applications/{appId}/messages/{msgId}";
    private static final String UPDATE_TFA_MESSAGE_TEMPLATE_ENDPOINT =
            "/2fa/2/applications/{appId}/messages/{msgId}";
    private static final String SEND_TFA_PIN_CODE_OVER_SMS_ENDPOINT = "/2fa/2/pin";
    private static final String RESEND_TFA_PIN_CODE_OVER_SMS_ENDPOINT = "/2fa/2/pin/{pinId}/resend";
    private static final String SEND_TFA_PIN_CODE_OVER_VOICE_ENDPOINT = "/2fa/2/pin/voice";
    private static final String RESEND_TFA_PIN_CODE_OVER_VOICE_ENDPOINT =
            "/2fa/2/pin/{pinId}/resend/voice";
    private static final String VERIFY_TFA_PHONE_NUMBER_ENDPOINT = "/2fa/2/pin/{pinId}/verify";
    private static final String GET_TFA_VERIFICATION_STATUS_ENDPOINT =
            "/2fa/2/applications/{appId}/verifications";
    private ApiClient apiClient;

    public TfaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p>
     * Get 2FA applications.<br>
     * An application is a container for 2FA message templates. Use this method to
     * list your applications.
     * </p>
     *
     * @return ApiResponse&lt;TfaApplicationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Get
     *     2FA applications Documentation</a>
     */
    public ApiResponse<TfaApplicationResponse> getTfaApplications() throws ApiException {
        Call call = getTfaApplicationsCall();
        return apiClient.execute(call, TfaApplicationResponse.class);
    }

    /**
     * <p>
     * Get 2FA applications (asynchronously).<br>
     * An application is a container for 2FA message templates. Use this method to
     * list your applications.
     * </p>
     *
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Get
     *     2FA applications Documentation</a>
     */
    public Call getTfaApplicationsAsync(final ApiCallback<List<TfaApplicationResponse>> apiCallback)
            throws ApiException {
        Call call = getTfaApplicationsCall(apiCallback);
        apiClient.executeAsync(call, TfaApplicationResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Create 2FA application.<br>
     * Create and configure a new 2FA application.
     * </p>
     *
     * @param tfaApplication (optional)
     * @return ApiResponse&lt;TfaApplicationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Create
     *     2FA application Documentation</a>
     */
    public ApiResponse<TfaApplicationResponse>
            createTfaApplication(final TfaApplication tfaApplication) throws ApiException {
        validateBody(tfaApplication);
        Call call = createTfaApplicationCall(tfaApplication);
        return apiClient.execute(call, TfaApplicationResponse.class);
    }

    /**
     * <p>
     * Create 2FA application (asynchronously).<br>
     * Create and configure a new 2FA application.
     * </p>
     *
     * @param tfaApplication (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Create
     *     2FA application Documentation</a>
     */
    public Call createTfaApplicationAsync(final TfaApplication tfaApplication,
            final ApiCallback<TfaApplicationResponse> apiCallback) throws ApiException {
        validateBody(tfaApplication);
        Call call = createTfaApplicationCall(tfaApplication, apiCallback);
        apiClient.executeAsync(call, TfaApplicationResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Get 2FA application.<br>
     * Get a single 2FA application to see its configuration details.
     * </p>
     *
     * @param appId ID of application for which configuration view was requested.
     *     (required)
     * @return ApiResponse&lt;TfaApplicationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Get
     *     2FA application Documentation</a>
     */
    public ApiResponse<TfaApplicationResponse> getTfaApplication(final String appId)
            throws ApiException {
        validatePathParameters(Arrays.asList(appId));
        Call localVarCall = getTfaApplicationCall(appId);
        return apiClient.execute(localVarCall, TfaApplicationResponse.class);
    }

    /**
     * <p>
     * Get 2FA application (asynchronously).<br>
     * Get a single 2FA application to see its configuration details.
     * </p>
     *
     * @param appId ID of application for which configuration view was requested.
     *     (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Get
     *     2FA application Documentation</a>
     */
    public Call getTfaApplicationAsync(final String appId,
            final ApiCallback<TfaApplicationResponse> apiCallback) throws ApiException {
        validatePathParameters(Arrays.asList(appId));
        Call call = getTfaApplicationCall(appId, apiCallback);
        apiClient.executeAsync(call, TfaApplicationResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Update 2FA application.<br>
     * Change configuration options for your existing 2FA application.
     * </p>
     *
     * @param appId ID of application that should be updated. (required)
     * @param tfaApplication (optional)
     * @return ApiResponse&lt;TfaApplicationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Update
     *     2FA application Documentation</a>
     */
    public ApiResponse<TfaApplicationResponse> updateTfaApplication(final String appId,
            final TfaApplication tfaApplication) throws ApiException {
        validatePathParameters(Arrays.asList(appId));
        validateBody(tfaApplication);
        Call call = updateTfaApplicationCall(appId, tfaApplication);
        return apiClient.execute(call, TfaApplicationResponse.class);
    }

    /**
     * <p>
     * Update 2FA application (asynchronously).<br>
     * Change configuration options for your existing 2FA application.
     * </p>
     *
     * @param appId ID of application that should be updated. (required)
     * @param tfaApplication (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Update
     *     2FA application Documentation</a>
     */
    public Call updateTfaApplicationAsync(final String appId, final TfaApplication tfaApplication,
            final ApiCallback<TfaApplicationResponse> apiCallback) throws ApiException {
        validatePathParameters(Arrays.asList(appId));
        validateBody(tfaApplication);
        Call call = updateTfaApplicationCall(appId, tfaApplication, apiCallback);
        apiClient.executeAsync(call, TfaApplicationResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Get 2FA message templates.<br>
     * List all message templates in a 2FA application.
     * </p>
     *
     * @param appId ID of application for which requested message was created.
     *     (required)
     * @return ApiResponse&lt;TfaTemplateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Get
     *     2FA message templates Documentation</a>
     */
    public ApiResponse<TfaTemplateResponse> getTfaMessageTemplates(final String appId)
            throws ApiException {
        validatePathParameters(Arrays.asList(appId));
        Call call = getTfaMessageTemplatesCall(appId);
        return apiClient.execute(call, TfaTemplateResponse.class);
    }

    /**
     * <p>
     * Get 2FA message templates (asynchronously).<br>
     * List all message templates in a 2FA application.
     * </p>
     *
     * @param appId ID of application for which requested message was created.
     *     (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Get
     *     2FA message templates Documentation</a>
     */
    public Call getTfaMessageTemplatesAsync(final String appId,
            final ApiCallback<List<TfaTemplateResponse>> apiCallback) throws ApiException {
        validatePathParameters(Arrays.asList(appId));
        Call call = getTfaMessageTemplatesCall(appId, apiCallback);
        apiClient.executeAsync(call, TfaTemplateResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Create 2FA message template.<br>
     * Once you have your [2FA
     * application](#channels/sms/create-Tfa-message-template), create one or more
     * message templates where your PIN will be dynamically included when you send
     * the PIN message.
     * </p>
     *
     * @param appId ID of application for which requested message was created.
     *     (required)
     * @param tfaCreateMessage (optional)
     * @return ApiResponse&lt;TfaTemplateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Create
     *     2FA message template Documentation</a>
     */
    public ApiResponse<TfaTemplateResponse> createTfaMessageTemplate(final String appId,
            final TfaCreateMessage tfaCreateMessage) throws ApiException {
        validatePathParameters(Arrays.asList(appId));
        validateBody(tfaCreateMessage);
        Call call = createTfaMessageTemplateCall(appId, tfaCreateMessage);
        return apiClient.execute(call, TfaTemplateResponse.class);
    }

    /**
     * <p>
     * Create 2FA message template (asynchronously).<br>
     * Once you have your [2FA
     * application](#channels/sms/create-Tfa-message-template), create one or more
     * message templates where your PIN will be dynamically included when you send
     * the PIN message.
     * </p>
     *
     * @param appId ID of application for which requested message was created.
     *     (required)
     * @param tfaCreateMessage (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Create
     *     2FA message template Documentation</a>
     */
    public Call createTfaMessageTemplateAsync(final String appId,
            final TfaCreateMessage tfaCreateMessage,
            final ApiCallback<TfaTemplateResponse> apiCallback) throws ApiException {
        validatePathParameters(Arrays.asList(appId));
        validateBody(tfaCreateMessage);
        Call call = createTfaMessageTemplateCall(appId, tfaCreateMessage, apiCallback);
        apiClient.executeAsync(call, TfaTemplateResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Get 2FA message template.<br>
     * Get a single 2FA message template from an application to see its
     * configuration details.
     * </p>
     *
     * @param appId ID of application for which requested message was created.
     *     (required)
     * @param msgId Requested message ID. (required)
     * @return ApiResponse&lt;TfaTemplateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Get
     *     2FA message template Documentation</a>
     */
    public ApiResponse<TfaTemplateResponse> getTfaMessageTemplate(final String appId,
            final String msgId) throws ApiException {
        validatePathParameters(Arrays.asList(appId, msgId));
        Call call = getTfaMessageTemplateCall(appId, msgId);
        return apiClient.execute(call, TfaTemplateResponse.class);
    }

    /**
     * <p>
     * Get 2FA message template (asynchronously).<br>
     * Get a single 2FA message template from an application to see its
     * configuration details.
     * </p>
     *
     * @param appId ID of application for which requested message was created.
     *     (required)
     * @param msgId Requested message ID. (required)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Get
     *     2FA message template Documentation</a>
     */
    public Call getTfaMessageTemplateAsync(final String appId, final String msgId,
            final ApiCallback<TfaTemplateResponse> apiCallback) throws ApiException {
        validatePathParameters(Arrays.asList(appId, msgId));
        Call call = getTfaMessageTemplateCall(appId, msgId, apiCallback);
        apiClient.executeAsync(call, TfaTemplateResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Update 2FA message template.<br>
     * Change configuration options for your existing 2FA application message
     * template.
     * </p>
     *
     * @param appId ID of application for which requested message was created.
     *     (required)
     * @param msgId Requested message ID. (required)
     * @param tfaCreateMessage (optional)
     * @return ApiResponse&lt;TfaTemplateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Update
     *     2FA message template Documentation</a>
     */
    public ApiResponse<TfaTemplateResponse> updateTfaMessageTemplate(final String appId,
            final String msgId, final TfaCreateMessage tfaCreateMessage) throws ApiException {
        validatePathParameters(Arrays.asList(appId, msgId));
        validateBody(tfaCreateMessage);
        Call call = updateTfaMessageTemplateCall(appId, msgId, tfaCreateMessage);
        return apiClient.execute(call, TfaTemplateResponse.class);
    }

    /**
     * <p>
     * Update 2FA message template (asynchronously).<br>
     * Change configuration options for your existing 2FA application message
     * template.
     * </p>
     *
     * @param appId ID of application for which requested message was created.
     *     (required)
     * @param msgId Requested message ID. (required)
     * @param tfaCreateMessage (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Update
     *     2FA message template Documentation</a>
     */
    public Call updateTfaMessageTemplateAsync(final String appId, final String msgId,
            final TfaCreateMessage tfaCreateMessage,
            final ApiCallback<TfaTemplateResponse> apiCallback) throws ApiException {
        validatePathParameters(Arrays.asList(appId, msgId));
        validateBody(tfaCreateMessage);
        Call call = updateTfaMessageTemplateCall(appId, msgId, tfaCreateMessage, apiCallback);
        apiClient.executeAsync(call, TfaTemplateResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send 2FA PIN code over SMS.<br>
     * Send a PIN code over SMS using a previously created [message
     * template](#channels/sms/create-Tfa-message-template).
     * <p>
     *
     *
     * @param tfaQueryStringSendPinCode (optional)
     * @param tfaSendPinCode (optional)
     * @return ApiResponse&lt;TfaStartAuthenticationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Send
     *     2FA PIN code over SMS Documentation</a>
     */
    public ApiResponse<TfaStartAuthenticationResponse> sendTfaPinCodeOverSms(
            final TfaQueryStringSendPinCode tfaQueryStringSendPinCode,
            final TfaSendPinCode tfaSendPinCode) throws ApiException {
        validateQueryString(tfaQueryStringSendPinCode);
        validateBody(tfaSendPinCode);
        Call call = sendTfaPinCodeOverSmsCall(tfaQueryStringSendPinCode, tfaSendPinCode);
        return apiClient.execute(call, TfaStartAuthenticationResponse.class);
    }

    /**
     * <p>
     * Send 2FA PIN code over SMS (asynchronously).<br>
     * Send a PIN code over SMS using a previously created [message
     * template](#channels/sms/create-Tfa-message-template).
     * </p>
     *
     * @param tfaQueryStringSendPinCode (optional)
     * @param tfaSendPinCode (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Send
     *     2FA PIN code over SMS Documentation</a>
     */
    public Call sendTfaPinCodeOverSmsAsync(
            final TfaQueryStringSendPinCode tfaQueryStringSendPinCode,
            final TfaSendPinCode tfaSendPinCode,
            final ApiCallback<TfaStartAuthenticationResponse> apiCallback) throws ApiException {
        validateQueryString(tfaQueryStringSendPinCode);
        validateBody(tfaSendPinCode);
        Call call =
                sendTfaPinCodeOverSmsCall(tfaQueryStringSendPinCode, tfaSendPinCode, apiCallback);
        apiClient.executeAsync(call, TfaStartAuthenticationResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Resend 2FA PIN code over SMS.<br>
     * If needed, you can resend the same (previously sent) PIN code over SMS.
     * </p>
     *
     * @param pinId ID of the pin code that has to be verified. (required)
     * @param tfaResendPinCode (optional)
     * @return ApiResponse&lt;TfaStartAuthenticationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Resend
     *     2FA PIN code over SMS Documentation</a>
     */
    public ApiResponse<TfaStartAuthenticationResponse> resendTfaPinCodeOverSms(final String pinId,
            final TfaResendPinCode tfaResendPinCode) throws ApiException {
        validatePathParameters(Arrays.asList(pinId));
        validateBody(tfaResendPinCode);
        Call call = resendTfaPinCodeOverSmsCall(pinId, tfaResendPinCode);
        return apiClient.execute(call, TfaStartAuthenticationResponse.class);
    }

    /**
     * <p>
     * Resend 2FA PIN code over SMS (asynchronously).<br>
     * If needed, you can resend the same (previously sent) PIN code over SMS.
     * </p>
     *
     * @param pinId ID of the pin code that has to be verified. (required)
     * @param tfaResendPinCode (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Resend
     *     2FA PIN code over SMS Documentation</a>
     */
    public Call resendTfaPinCodeOverSmsAsync(final String pinId,
            final TfaResendPinCode tfaResendPinCode,
            final ApiCallback<TfaStartAuthenticationResponse> apiCallback) throws ApiException {
        validatePathParameters(Arrays.asList(pinId));
        validateBody(tfaResendPinCode);
        Call call = resendTfaPinCodeOverSmsCall(pinId, tfaResendPinCode, apiCallback);
        apiClient.executeAsync(call, TfaStartAuthenticationResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Send 2FA PIN code over Voice.<br>
     * Send a PIN code over Voice using previously created [message
     * template](#channels/sms/create-Tfa-message-template).
     * </p>
     *
     * @param tfaSendPinCode (optional)
     * @return ApiResponse&lt;TfaStartAuthenticationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Send
     *     2FA PIN code over Voice Documentation</a>
     */
    public ApiResponse<TfaStartAuthenticationResponse>
            sendTfaPinCodeOverVoice(final TfaSendPinCode tfaSendPinCode) throws ApiException {
        validateBody(tfaSendPinCode);
        Call call = sendTfaPinCodeOverVoiceCall(tfaSendPinCode);
        return apiClient.execute(call, TfaStartAuthenticationResponse.class);
    }

    /**
     * <p>
     * Send 2FA PIN code over Voice (asynchronously).<br>
     * Send a PIN code over Voice using previously created [message
     * template](#channels/sms/create-Tfa-message-template).
     * </p>
     *
     * @param tfaSendPinCode (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Send
     *     2FA PIN code over Voice Documentation</a>
     */
    public Call sendTfaPinCodeOverVoiceAsync(final TfaSendPinCode tfaSendPinCode,
            final ApiCallback<TfaStartAuthenticationResponse> apiCallback) throws ApiException {
        validateBody(tfaSendPinCode);
        Call call = sendTfaPinCodeOverVoiceCall(tfaSendPinCode, apiCallback);
        apiClient.executeAsync(call, TfaStartAuthenticationResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Resend 2FA PIN code over Voice.<br>
     * If needed, you can resend the same (previously sent) PIN code over Voice.
     * </p>
     *
     * @param pinId ID of the pin code that has to be verified. (required)
     * @param tfaResendPinCode (optional)
     * @return ApiResponse&lt;TfaStartAuthenticationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Resend
     *     2FA PIN code over Voice Documentation</a>
     */
    public ApiResponse<TfaStartAuthenticationResponse> resendTfaPinCodeOverVoice(final String pinId,
            final TfaResendPinCode tfaResendPinCode) throws ApiException {
        validatePathParameters(Arrays.asList(pinId));
        validateBody(tfaResendPinCode);
        Call call = resendTfaPinCodeOverVoiceCall(pinId, tfaResendPinCode);
        return apiClient.execute(call, TfaStartAuthenticationResponse.class);
    }

    /**
     * <p>
     * Resend 2FA PIN code over Voice (asynchronously).<br>
     * If needed, you can resend the same (previously sent) PIN code over Voice.
     * </p>
     *
     * @param pinId ID of the pin code that has to be verified. (required)
     * @param tfaResendPinCode (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Resend
     *     2FA PIN code over Voice Documentation</a>
     */
    public Call resendTfaPinCodeOverVoiceAsync(final String pinId,
            final TfaResendPinCode tfaResendPinCode,
            final ApiCallback<TfaStartAuthenticationResponse> apiCallback) throws ApiException {
        validatePathParameters(Arrays.asList(pinId));
        validateBody(tfaResendPinCode);
        Call call = resendTfaPinCodeOverVoiceCall(pinId, tfaResendPinCode, apiCallback);
        apiClient.executeAsync(call, TfaStartAuthenticationResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Verify phone number.<br>
     * Verify a phone number to confirm successful 2FA authentication.
     * </p>
     *
     * @param pinId ID of the pin code that has to be verified. (required)
     * @param tfaVerifyPhoneNumber (optional)
     * @return ApiResponse&lt;TfaVerifyPinResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Verify
     *     phone number Documentation</a>
     */
    public ApiResponse<TfaVerifyPinResponse> verifyTfaPhoneNumber(final String pinId,
            final TfaVerifyPhoneNumber tfaVerifyPhoneNumber) throws ApiException {
        validatePathParameters(Arrays.asList(pinId));
        validateBody(tfaVerifyPhoneNumber);
        Call call = verifyTfaPhoneNumberCall(pinId, tfaVerifyPhoneNumber);
        return apiClient.execute(call, TfaVerifyPinResponse.class);
    }

    /**
     * <p>
     * Verify phone number (asynchronously).<br>
     * Verify a phone number to confirm successful 2FA authentication.
     * </p>
     *
     * @param pinId ID of the pin code that has to be verified. (required)
     * @param tfaVerifyPhoneNumber (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Verify
     *     phone number Documentation</a>
     */
    public Call verifyTfaPhoneNumberAsync(final String pinId,
            final TfaVerifyPhoneNumber tfaVerifyPhoneNumber,
            final ApiCallback<TfaVerifyPinResponse> apiCallback) throws ApiException {
        validatePathParameters(Arrays.asList(pinId));
        validateBody(tfaVerifyPhoneNumber);
        Call call = verifyTfaPhoneNumberCall(pinId, tfaVerifyPhoneNumber, apiCallback);
        apiClient.executeAsync(call, TfaVerifyPinResponse.class, apiCallback);
        return call;
    }

    /**
     * <p>
     * Get 2FA verification status.<br>
     * Check if a phone number is already verified for a specific 2FA application.
     * </p>
     *
     * @param appId ID of 2-FA application for which phone number verification
     *     status is requested. (required)
     * @param tfaQueryStringVerificationStatus (optional)
     * @return ApiResponse&lt;TfaVerificationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *     deserialize the response body
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Get
     *     2FA verification status Documentation</a>
     */
    public ApiResponse<TfaVerificationResponse> getTfaVerificationStatus(final String appId,
            final TfaQueryStringVerificationStatus tfaQueryStringVerificationStatus)
            throws ApiException {
        validatePathParameters(Arrays.asList(appId));
        validateQueryString(tfaQueryStringVerificationStatus);
        Call call = getTfaVerificationStatusCall(appId, tfaQueryStringVerificationStatus);
        return apiClient.execute(call, TfaVerificationResponse.class);
    }

    /**
     * <p>
     * Get 2FA verification status (asynchronously).<br>
     * Check if a phone number is already verified for a specific 2FA application.
     * </p>
     *
     * @param appId ID of 2-FA application for which phone number verification
     *     status is requested. (required)
     * @param tfaQueryStringVerificationStatus (optional)
     * @param apiCallback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *     request body object
     * @see <a href=
     *     "https://www.infobip.com/docs/use-cases/two-factor-authentication-over-api">Get
     *     2FA verification status Documentation</a>
     */
    public Call getTfaVerificationStatusAsync(final String appId,
            final TfaQueryStringVerificationStatus tfaQueryStringVerificationStatus,
            final ApiCallback<TfaVerificationResponse> apiCallback) throws ApiException {
        validatePathParameters(Arrays.asList(appId));
        validateQueryString(tfaQueryStringVerificationStatus);
        Call call =
                getTfaVerificationStatusCall(appId, tfaQueryStringVerificationStatus, apiCallback);
        apiClient.executeAsync(call, TfaVerificationResponse.class, apiCallback);
        return call;
    }

    private Call getTfaApplicationsCall() throws ApiException {
        return getTfaApplicationsCall(null);
    }

    private Call getTfaApplicationsCall(final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(GET_TFA_APPLICATIONS_ENDPOINT, null, HttpMethodType.GET,
                httpHeaders, null, apiCallback);
    }

    private Call createTfaApplicationCall(final TfaApplication tfaApplication) throws ApiException {
        return createTfaApplicationCall(tfaApplication, null);
    }

    private Call createTfaApplicationCall(final TfaApplication tfaApplication,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(CREATE_TFA_APPLICATION_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, tfaApplication, apiCallback);
    }

    private Call getTfaApplicationCall(final String appId) throws ApiException {
        return getTfaApplicationCall(appId, null);
    }

    private Call getTfaApplicationCall(final String appId, final ApiCallback apiCallback)
            throws ApiException {
        String getTfaApplicationEndpoint = GET_TFA_APPLICATION_ENDPOINT
                .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(getTfaApplicationEndpoint, null, HttpMethodType.GET, httpHeaders,
                null, apiCallback);
    }

    private Call updateTfaApplicationCall(final String appId, final TfaApplication tfaApplication)
            throws ApiException {
        return updateTfaApplicationCall(appId, tfaApplication, null);
    }

    private Call updateTfaApplicationCall(final String appId, final TfaApplication tfaApplication,
            final ApiCallback apiCallback) throws ApiException {
        String updateTfaApplicationEndpoint = UPDATE_TFA_APPLICATION_ENDPOINT
                .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(updateTfaApplicationEndpoint, null, HttpMethodType.PUT,
                httpHeaders, tfaApplication, apiCallback);
    }

    private Call getTfaMessageTemplatesCall(final String appId) throws ApiException {
        return getTfaMessageTemplatesCall(appId);
    }

    private Call getTfaMessageTemplatesCall(final String appId, final ApiCallback apiCallback)
            throws ApiException {
        String getTfaMessageTemplatesEndpoint = GET_TFA_MESSAGE_TEMPLATES_ENDPOINT
                .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(getTfaMessageTemplatesEndpoint, null, HttpMethodType.GET,
                httpHeaders, null, apiCallback);
    }

    private Call createTfaMessageTemplateCall(final String appId,
            final TfaCreateMessage tfaCreateMessage) throws ApiException {
        return createTfaMessageTemplateCall(appId, tfaCreateMessage, null);
    }

    private Call createTfaMessageTemplateCall(final String appId,
            final TfaCreateMessage tfaCreateMessage, final ApiCallback apiCallback)
            throws ApiException {
        String createTfaMessageTemplateEndpoint = CREATE_TFA_MESSAGE_TEMPLATE_ENDPOINT
                .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(createTfaMessageTemplateEndpoint, null, HttpMethodType.POST,
                httpHeaders, tfaCreateMessage, apiCallback);
    }

    private Call getTfaMessageTemplateCall(final String appId, final String msgId)
            throws ApiException {
        return getTfaMessageTemplateCall(appId, msgId, null);
    }

    private Call getTfaMessageTemplateCall(final String appId, final String msgId,
            final ApiCallback apiCallback) throws ApiException {
        String getTfaMessageTemplateEndpoint = GET_TFA_MESSAGE_TEMPLATE_ENDPOINT
                .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
                .replaceAll("\\{" + "msgId" + "\\}", apiClient.escapeString(msgId.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(getTfaMessageTemplateEndpoint, null, HttpMethodType.GET,
                httpHeaders, null, apiCallback);
    }

    private Call updateTfaMessageTemplateCall(final String appId, final String msgId,
            final TfaCreateMessage tfaCreateMessage) throws ApiException {
        return updateTfaMessageTemplateCall(appId, msgId, tfaCreateMessage, null);
    }

    private Call updateTfaMessageTemplateCall(final String appId, final String msgId,
            final TfaCreateMessage tfaCreateMessage, final ApiCallback apiCallback)
            throws ApiException {
        String updateTfaMessageTemplateEndpoint = UPDATE_TFA_MESSAGE_TEMPLATE_ENDPOINT
                .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
                .replaceAll("\\{" + "msgId" + "\\}", apiClient.escapeString(msgId.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(updateTfaMessageTemplateEndpoint, null, HttpMethodType.PUT,
                httpHeaders, tfaCreateMessage, apiCallback);
    }

    private Call sendTfaPinCodeOverSmsCall(
            final TfaQueryStringSendPinCode tfaQueryStringSendPinCode,
            final TfaSendPinCode tfaSendPinCode) throws ApiException {
        return sendTfaPinCodeOverSmsCall(tfaQueryStringSendPinCode, tfaSendPinCode, null);
    }

    private Call sendTfaPinCodeOverSmsCall(
            final TfaQueryStringSendPinCode tfaQueryStringSendPinCode,
            final TfaSendPinCode tfaSendPinCode, final ApiCallback apiCallback)
            throws ApiException {
        String queryString = buildQueryString(tfaQueryStringSendPinCode);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(SEND_TFA_PIN_CODE_OVER_SMS_ENDPOINT, queryString,
                HttpMethodType.POST, httpHeaders, tfaSendPinCode, apiCallback);
    }

    private Call resendTfaPinCodeOverSmsCall(final String pinId,
            final TfaResendPinCode tfaResendPinCode) throws ApiException {
        return resendTfaPinCodeOverSmsCall(pinId, tfaResendPinCode, null);
    }

    private Call resendTfaPinCodeOverSmsCall(final String pinId,
            final TfaResendPinCode tfaResendPinCode, final ApiCallback apiCallback)
            throws ApiException {
        String resendTfaPinCodeOverSmsEndpoint = RESEND_TFA_PIN_CODE_OVER_SMS_ENDPOINT
                .replaceAll("\\{" + "pinId" + "\\}", apiClient.escapeString(pinId.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(resendTfaPinCodeOverSmsEndpoint, null, HttpMethodType.POST,
                httpHeaders, tfaResendPinCode, apiCallback);
    }

    private Call sendTfaPinCodeOverVoiceCall(final TfaSendPinCode tfaSendPinCode)
            throws ApiException {
        return sendTfaPinCodeOverVoiceCall(tfaSendPinCode, null);
    }

    private Call sendTfaPinCodeOverVoiceCall(final TfaSendPinCode tfaSendPinCode,
            final ApiCallback apiCallback) throws ApiException {
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(SEND_TFA_PIN_CODE_OVER_VOICE_ENDPOINT, null, HttpMethodType.POST,
                httpHeaders, tfaSendPinCode, apiCallback);
    }

    private Call resendTfaPinCodeOverVoiceCall(final String pinId,
            final TfaResendPinCode tfaResendPinCode) throws ApiException {
        return resendTfaPinCodeOverVoiceCall(pinId, tfaResendPinCode, null);
    }

    private Call resendTfaPinCodeOverVoiceCall(final String pinId,
            final TfaResendPinCode tfaResendPinCode, final ApiCallback apiCallback)
            throws ApiException {
        String resendTfaPinCodeOverVoiceEndpoint = RESEND_TFA_PIN_CODE_OVER_VOICE_ENDPOINT
                .replaceAll("\\{" + "pinId" + "\\}", apiClient.escapeString(pinId.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(resendTfaPinCodeOverVoiceEndpoint, null, HttpMethodType.POST,
                httpHeaders, tfaResendPinCode, apiCallback);
    }

    private Call verifyTfaPhoneNumberCall(final String pinId,
            final TfaVerifyPhoneNumber tfaVerifyPhoneNumber) throws ApiException {
        return verifyTfaPhoneNumberCall(pinId, tfaVerifyPhoneNumber, null);
    }

    private Call verifyTfaPhoneNumberCall(final String pinId,
            final TfaVerifyPhoneNumber tfaVerifyPhoneNumber, final ApiCallback apiCallback)
            throws ApiException {
        String verifyTfaPhoneNumberEndpoint = VERIFY_TFA_PHONE_NUMBER_ENDPOINT
                .replaceAll("\\{" + "pinId" + "\\}", apiClient.escapeString(pinId.toString()));
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        httpHeaders.put(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(verifyTfaPhoneNumberEndpoint, null, HttpMethodType.POST,
                httpHeaders, tfaVerifyPhoneNumber, apiCallback);
    }

    private Call getTfaVerificationStatusCall(final String appId,
            final TfaQueryStringVerificationStatus tfaQueryStringVerificationStatus)
            throws ApiException {
        return getTfaVerificationStatusCall(appId, tfaQueryStringVerificationStatus, null);
    }

    private Call getTfaVerificationStatusCall(final String appId,
            final TfaQueryStringVerificationStatus tfaQueryStringVerificationStatus,
            final ApiCallback apiCallback) throws ApiException {
        String getTfaVerificationStatusEndpoint = GET_TFA_VERIFICATION_STATUS_ENDPOINT
                .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));
        String queryString = buildQueryString(tfaQueryStringVerificationStatus);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(HttpHeader.ACCEPT, HttpHeader.APPLICATION_JSON);
        return apiClient.buildCall(getTfaVerificationStatusEndpoint, queryString,
                HttpMethodType.GET, httpHeaders, null, apiCallback);
    }
}
