
package com.infobip.client.channels.whatsapp.model.template;

import static org.junit.Assert.assertEquals;
import com.infobip.client.channels.whatsapp.model.common.Language;
import com.infobip.client.common.ModelValidator;
import com.infobip.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Arrays;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WhatsAppTemplateTest {
    @Test
    void testWhatsAppTemplateSerialization_withRequiredParameters() throws Exception {
        WhatsAppTemplate whatsAppTemplate = getWhatsAppTemplateWithRequiredParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppTemplate);
        // System.out.println(whatsAppTemplate);
        // System.out.println(json + "\n");
    }

    @Test
    void testWhatsAppTemplateSerialization_withAllParameters() throws Exception {
        WhatsAppTemplate whatsAppTemplate = getWhatsAppTemplateWithAllParameters();
        String json = Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppTemplate);
        // System.out.println(whatsAppTemplate);
        // System.out.println(json + "\n");
    }

    @Test
    void validateWhatsAppTemplate_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppTemplate>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(getWhatsAppTemplateWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppTemplate_withAllParameters() {
        Set<ConstraintViolation<WhatsAppTemplate>> constraintViolations =
                ModelValidator.INSTANCE.getValidator()
                        .validate(getWhatsAppTemplateWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static WhatsAppTemplate getWhatsAppTemplateWithRequiredParameters() {
        return new WhatsAppTemplate("template_name", Language.EN_GB, Category.ACCOUNT_UPDATE,
                new Structure("body {{1}} content"));
    }

    public static WhatsAppTemplate getWhatsAppTemplateWithAllParameters() {
        return new WhatsAppTemplate("template_name", Language.EN_GB, Category.ACCOUNT_UPDATE,
                new Structure("body {{1}} content").header(new TextHeader("Text header text"))
                        .footer("Footer")
                        .buttons(Arrays.asList(new PhoneNumberButton("Button text", "441134960001"),
                                new UrlButton("Button text", "https://www.infobip.com/{{1}}"))));
    }
}
