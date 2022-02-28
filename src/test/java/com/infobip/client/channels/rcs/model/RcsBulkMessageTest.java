
package com.infobip.client.channels.rcs.model;

import com.infobip.client.common.Serde;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class RcsBulkMessageTest {
    @Test
    void testRcsBulkMessageSerialization_withRequiredParameters() throws Exception {
        RcsBulkMessage rcsBulkMessage = getRcsBulkMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(rcsBulkMessage);
        System.out.println(rcsBulkMessage);
        System.out.println(json + "\n");
    }

    @Test
    void testRcsBulkMessageSerialization_withAllParameters() throws Exception {
        RcsBulkMessage rcsBulkMessage = getRcsBulkMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(rcsBulkMessage);
        System.out.println(rcsBulkMessage);
        System.out.println(json + "\n");
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
                                        "www.example.test"),
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
                                                        new SmsFailover("441134960000", "Some text")
                                                                .validityPeriod(20)
                                                                .validityPeriodTimeUnit(
                                                                    ValidityPeriodTimeUnit.MINUTES))
                                                .notifyUrl("https://www.example.com/rcs")
                                                .callbackData("Callback data")
                                                .messageId("externalMessageId")));
    }
    //@formatter:on
}
