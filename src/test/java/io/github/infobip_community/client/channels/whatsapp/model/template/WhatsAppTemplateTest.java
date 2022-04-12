
package io.github.infobip_community.client.channels.whatsapp.model.template;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.channels.whatsapp.model.common.Language;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Arrays;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class WhatsAppTemplateTest {
    @Test
    void testWhatsAppTemplateSerialization_withRequiredParameters() throws Exception {
        WhatsAppTemplate whatsAppTemplate = getWhatsAppTemplateWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppTemplate);
    }

    @Test
    void testWhatsAppTemplateSerialization_withAllParameters() throws Exception {
        WhatsAppTemplate whatsAppTemplate = getWhatsAppTemplateWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(whatsAppTemplate);
    }

    @Test
    void validateWhatsAppTemplate_withRequiredParameters() {
        Set<ConstraintViolation<WhatsAppTemplate>> constraintViolations =
                getValidator().validate(getWhatsAppTemplateWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateWhatsAppTemplate_withAllParameters() {
        Set<ConstraintViolation<WhatsAppTemplate>> constraintViolations =
                getValidator().validate(getWhatsAppTemplateWithAllParameters());
        assertEquals(1, constraintViolations.size());
    }

    public static WhatsAppTemplate getWhatsAppTemplateWithRequiredParameters() {
        return new WhatsAppTemplate("template_name", Language.EN_GB, Category.ACCOUNT_UPDATE,
                new Structure("body {{1}} content"));
    }

    public static WhatsAppTemplate getWhatsAppTemplateWithAllParameters() {
        return new WhatsAppTemplate("", Language.EN_GB, Category.ACCOUNT_UPDATE,
                new Structure("body {{1}} content").header(new TextHeader("Text header text"))
                        .footer("Footer")
                        .buttons(Arrays.asList(new PhoneNumberButton("Button text", "441134960001"),
                                new UrlButton("Button text", "https://www.infobip.com/{{1}}"))));
    }
}
