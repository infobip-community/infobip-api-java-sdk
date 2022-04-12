
package io.github.infobip_community.client.channels.email.model;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.channels.common.NotifyContentType;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class EmailFullyFeaturedTest {
    @Test
    void testEmailFullyFeaturedSerialization_withRequiredParameters() throws Exception {
        EmailFullyFeatured emailFullyFeatured = getEmailFullyFeaturedWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(emailFullyFeatured);
    }

    @Test
    void testEmailFullyFeaturedSerialization_withAllParameters() throws Exception {
        EmailFullyFeatured emailFullyFeatured = getEmailFullyFeaturedWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(emailFullyFeatured);
    }

    @Test
    void validateEmailFullyFeatured_withRequiredParameters() {
        Set<ConstraintViolation<EmailFullyFeatured>> constraintViolations =
                getValidator().validate(getEmailFullyFeaturedWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateEmailFullyFeatured_withAllParameters() {
        Set<ConstraintViolation<EmailFullyFeatured>> constraintViolations =
                getValidator().validate(getEmailFullyFeaturedWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static EmailFullyFeatured getEmailFullyFeaturedWithRequiredParameters() {
        return new EmailFullyFeatured("from@example.com", "to@example.com", "Subject");
    }

    public static EmailFullyFeatured getEmailFullyFeaturedWithAllParameters() {
        return new EmailFullyFeatured("from@example.com", "to@example.com", "Subject")
                .cc("cc@example.com")
                .bcc("bcc@example.com")
                .text("body")
                .bulkId("bulkId")
                .messageId("messageId")
                .templateid(11)
                .attachment(new File(""))
                .inlineImage(new File(""))
                .html("html")
                .replyto("replyTo XXX @ XXX example.com")
                .defaultplaceholders("placeholders")
                .preserverecipients(true)
                .trackingUrl("https://www.example.com")
                .trackclicks(true)
                .trackopens(false)
                .track(true)
                .callbackData("callback")
                .intermediateReport(true)
                .notifyUrl("https://www.example.com")
                .notifyContentType(NotifyContentType.JSON)
                .sendAt(OffsetDateTime.parse("2021-08-25T16:00:00.000+02:00"))
                .landingPagePlaceholders("landing")
                .landingPageId("landing id");
    }
}
