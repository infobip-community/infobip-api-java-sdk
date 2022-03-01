
package com.infobip.client.channels.whatsapp.model;

import static org.junit.Assert.assertEquals;
import com.infobip.client.common.ModelValidator;
import com.infobip.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class WhatsAppDeleteMediaTest {
    @Test
    void testWhatsAppDeleteMediaSerialization_withRequiredParameters() throws Exception {
        WhatsAppDeleteMedia rcsMessage = getWhatsAppDeleteMediaWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(rcsMessage);
        // System.out.println(rcsMessage);
        // System.out.println(json + "\n");
    }

    @Test
    void validateWhatsAppDeleteMedia_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppDeleteMedia>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(getWhatsAppDeleteMediaWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static WhatsAppDeleteMedia getWhatsAppDeleteMediaWithRequiredParameters() {
        return new WhatsAppDeleteMedia("https://www.infobip.com/infobip-logo.png");
    }
}
