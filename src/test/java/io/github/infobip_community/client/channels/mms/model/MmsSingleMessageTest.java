
package io.github.infobip_community.client.channels.mms.model;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.channels.common.Day;
import io.github.infobip_community.client.channels.common.DeliveryTimeWindow;
import io.github.infobip_community.client.channels.common.From;
import io.github.infobip_community.client.channels.common.To;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class MmsSingleMessageTest {
    @Test
    void testMmsSingleMessageSerialization_withRequiredParameters() throws Exception {
        MmsSingleMessage mmsSingleMessage = getMmsSingleMessageWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(mmsSingleMessage);
    }

    @Test
    void testMmsSingleMessageSerialization_withAllParameters() throws Exception {
        MmsSingleMessage mmsSingleMessage = getMmsSingleMessageWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(mmsSingleMessage);
    }

    @Test
    void validateMmsSingleMessage_withRequiredParameters() {
        Set<ConstraintViolation<MmsSingleMessage>> constraintViolations =
                getValidator().validate(getMmsSingleMessageWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateMmsSingleMessage_withAllParameters() {
        Set<ConstraintViolation<MmsSingleMessage>> constraintViolations =
                getValidator().validate(getMmsSingleMessageWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static MmsSingleMessage getMmsSingleMessageWithRequiredParameters() {
        return new MmsSingleMessage();
    }

    public static MmsSingleMessage getMmsSingleMessageWithAllParameters() {
        return new MmsSingleMessage().head(new Head("InfoMMS", "41793026727").id("ID")
                .subject("Subject")
                .validityPeriodMinutes(15)
                .callbackData("callback")
                .notifyUrl("https://www.example.com")
                .sendAt(OffsetDateTime.parse("2021-08-25T16:00:00.000+02:00"))
                .intermediateReport(true)
                .deliveryTimeWindow(new DeliveryTimeWindow(Arrays.asList(Day.MONDAY, Day.FRIDAY))
                        .from(new From(15, 30))
                        .to(new To(16, 40))))
                .text("Some text")
                .media(new File(""))
                .externallyHostedMedia(
                        new ExternallyHostedMedia("image/png", "", "https://www.example.com"))
                .smil("asdf");
    }
}
