
package io.github.infobip_community.client.channels.rcs.model;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Arrays;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class RcsBulkMessageTest {
    @Test
    void testRcsBulkMessageSerialization_withRequiredParameters() throws Exception {
        RcsBulkMessage rcsBulkMessage = getRcsBulkMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(rcsBulkMessage);
    }

    @Test
    void testRcsBulkMessageSerialization_withAllParameters() throws Exception {
        RcsBulkMessage rcsBulkMessage = getRcsBulkMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(rcsBulkMessage);
    }

    @Test
    void validateRcsBulkMessage_withRequiredParameters() {
        Set<ConstraintViolation<RcsBulkMessage>> constraintViolations =
                getValidator().validate(getRcsBulkMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateRcsBulkMessage_withAllParameters() {
        Set<ConstraintViolation<RcsBulkMessage>> constraintViolations =
                getValidator().validate(getRcsBulkMessageWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static RcsBulkMessage getRcsBulkMessageWithRequiredParameters() {
        return new RcsBulkMessage().messages(
                Arrays.asList(new RcsMessage("385977666618", new TextContent("exampleText 1")),
                        new RcsMessage("385977666618", new TextContent("exampleText 2"))));
    }

    //@formatter:off
    public static RcsBulkMessage getRcsBulkMessageWithAllParameters() {
        return new RcsBulkMessage().messages(Arrays.asList(
                new RcsMessage("385977666618", new TextContent("exampleText 1")),
                new RcsMessage("385977666618",
                        new TextContent("exampleText 2").suggestions(Arrays.asList(
                                new ReplySuggestion("exampleText", "examplePostbackData"),
                                new OpenUrlSuggestion("exampleText", "examplePostbackData",
                                        "http://www.example.test"),
                                new DialPhoneSuggestion("exampleText", "examplePostbackData")
                                        .phoneNumber("385977666618"),
                                new ShowLocationSuggestion("exampleText", "examplePostbackData",
                                        45.793418, 15.946297).label("label"),
                                new RequestLocationSuggestion("exampleText",
                                        "examplePostbackData")))).from("myRcsSender")
                                                .validityPeriod(15)
                                                .validityPeriodTimeUnit(
                                                        ValidityPeriodTimeUnit.MINUTES)
                                                .smsFailover(
                                                        new SmsFailover("441134960000", "")
                                                                .validityPeriod(20)
                                                                .validityPeriodTimeUnit(
                                                                    ValidityPeriodTimeUnit.MINUTES))
                                                .notifyUrl("https://www.example.com/rcs")
                                                .callbackData("Callback data")
                                                .messageId("externalMessageId")));
    }
    //@formatter:on
}
