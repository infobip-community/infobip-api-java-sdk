
package io.github.infobip_community.client.channels.whatsapp.model;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WhatsAppDeleteMediaTest {
    @Test
    void testWhatsAppDeleteMediaSerialization_withRequiredParameters() throws Exception {
        WhatsAppDeleteMedia rcsMessage = getWhatsAppDeleteMediaWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(rcsMessage);
    }

    @Test
    void validateWhatsAppDeleteMedia_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppDeleteMedia>> constraintViolations =
                getValidator().validate(getWhatsAppDeleteMediaWithRequiredParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static WhatsAppDeleteMedia getWhatsAppDeleteMediaWithRequiredParameters() {
        return new WhatsAppDeleteMedia("XXX https://www.infobip.com/infobip-logo.png");
    }
}
