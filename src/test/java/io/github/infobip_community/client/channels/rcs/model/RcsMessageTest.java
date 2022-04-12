
package io.github.infobip_community.client.channels.rcs.model;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Arrays;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class RcsMessageTest {
    @Test
    void testRcsMessageSerialization_withRequiredParameters() throws Exception {
        RcsMessage rcsMessage = getRcsMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(rcsMessage);
    }

    @Test
    void testRcsMessageSerialization_withAllParameters() throws Exception {
        RcsMessage rcsMessage = getRcsMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(rcsMessage);
    }

    @Test
    void validateRcsMessage_withRequiredParameters() {
        Set<ConstraintViolation<RcsMessage>> constraintViolations =
                getValidator().validate(getRcsMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateRcsMessage_withAllParameters() {
        Set<ConstraintViolation<RcsMessage>> constraintViolations =
                getValidator().validate(getRcsMessageWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static RcsMessage getRcsMessageWithRequiredParameters() {
        return new RcsMessage("385977666618", new TextContent("exampleText"));
    }

    public static RcsMessage getRcsMessageWithAllParameters() {
        return new RcsMessage("385977666618",
                new TextContent("exampleText").suggestions(Arrays.asList(
                        new ReplySuggestion("exampleText", "examplePostbackData"),
                        new OpenUrlSuggestion("exampleText", "examplePostbackData",
                                "https://www.example.test"),
                        new DialPhoneSuggestion("exampleText", "examplePostbackData")
                                .phoneNumber("385977666618"),
                        new ShowLocationSuggestion("exampleText", "examplePostbackData", 45.793418,
                                15.946297).label("label"),
                        new RequestLocationSuggestion("exampleText", "examplePostbackData"))))
                                .from("myRcsSender")
                                .validityPeriod(15)
                                .validityPeriodTimeUnit(ValidityPeriodTimeUnit.MINUTES)
                                .smsFailover(new SmsFailover("441134960000", "").validityPeriod(20)
                                        .validityPeriodTimeUnit(ValidityPeriodTimeUnit.MINUTES))
                                .notifyUrl("https://www.example.com/rcs")
                                .callbackData("Callback data")
                                .messageId("externalMessageId");
    }
}
