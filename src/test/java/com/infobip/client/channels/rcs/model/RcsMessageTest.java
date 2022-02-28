
package com.infobip.client.channels.rcs.model;

import com.infobip.client.common.Serde;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class RcsMessageTest {
    @Test
    void testRcsMessageSerialization_withRequiredParameters() throws Exception {
        RcsMessage rcsMessage = getRcsMessageWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(rcsMessage);
        System.out.println(rcsMessage);
        System.out.println(json + "\n");
    }

    @Test
    void testRcsMessageSerialization_withAllParameters() throws Exception {
        RcsMessage rcsMessage = getRcsMessageWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(rcsMessage);
        System.out.println(rcsMessage);
        System.out.println(json + "\n");
    }

    public static RcsMessage getRcsMessageWithRequiredParameters() {
        return new RcsMessage("385977666618", new TextContent("exampleText"));
    }

    public static RcsMessage getRcsMessageWithAllParameters() {
        return new RcsMessage("385977666618",
                new TextContent("exampleText").suggestions(Arrays.asList(
                        new ReplySuggestion("exampleText", "examplePostbackData"),
                        new OpenUrlSuggestion("exampleText", "examplePostbackData",
                                "www.example.test"),
                        new DialPhoneSuggestion("exampleText", "examplePostbackData")
                                .phoneNumber("385977666618"),
                        new ShowLocationSuggestion("exampleText", "examplePostbackData", 45.793418,
                                15.946297).label("label"),
                        new RequestLocationSuggestion("exampleText", "examplePostbackData"))))
                                .from("myRcsSender")
                                .validityPeriod(15)
                                .validityPeriodTimeUnit(ValidityPeriodTimeUnit.MINUTES)
                                .smsFailover(new SmsFailover("441134960000", "Some text")
                                        .validityPeriod(20)
                                        .validityPeriodTimeUnit(ValidityPeriodTimeUnit.MINUTES))
                                .notifyUrl("https://www.example.com/rcs")
                                .callbackData("Callback data")
                                .messageId("externalMessageId");
    }
}
