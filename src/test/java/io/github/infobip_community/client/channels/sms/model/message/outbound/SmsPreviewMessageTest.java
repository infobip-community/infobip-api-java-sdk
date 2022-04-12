
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class SmsPreviewMessageTest {
    @Test
    void testSmsAdvancedTextMessageSerialization_withRequiredParameters() throws Exception {
        SmsPreviewMessage smsPreviewMessage = getSmsPreviewMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsPreviewMessage);
    }

    @Test
    void testSmsAdvancedTextMessageSerialization_withAllParameters() throws Exception {
        SmsPreviewMessage smsPreviewMessage = getSmsPreviewMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(smsPreviewMessage);
    }

    @Test
    void validateSmsPreviewMessage_withRequiredParameters() {
        Set<ConstraintViolation<SmsPreviewMessage>> constraintViolations =
                getValidator().validate(getSmsPreviewMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateSmsPreviewMessage_withAllParameters() {
        Set<ConstraintViolation<SmsPreviewMessage>> constraintViolations =
                getValidator().validate(getSmsPreviewMessageWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static SmsPreviewMessage getSmsPreviewMessageWithRequiredParameters() {
        return new SmsPreviewMessage(
                "Let's see how many characters remain unused in this message.");
    }

    public static SmsPreviewMessage getSmsPreviewMessageWithAllParameters() {
        return new SmsPreviewMessage(null).languageCode(LanguageCode.TR)
                .transliteration(Transliteration.TURKISH);
    }
}
