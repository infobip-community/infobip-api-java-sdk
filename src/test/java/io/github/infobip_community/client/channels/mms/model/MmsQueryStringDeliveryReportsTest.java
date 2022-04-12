
package io.github.infobip_community.client.channels.mms.model;

import static io.github.infobip_community.client.common.RequestValidator.getValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.infobip_community.client.common.Serde;
import jakarta.validation.ConstraintViolation;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class MmsQueryStringDeliveryReportsTest {
    @Test
    void testMmsQueryStringDeliveryReportsSerialization_withRequiredParameters() throws Exception {
        MmsQueryStringDeliveryReports mmsQueryStringDeliveryReports =
                getMmsQueryStringDeliveryReportsWithRequiredParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(mmsQueryStringDeliveryReports);
    }

    @Test
    void testMmsQueryStringDeliveryReportsSerialization_withAllParameters() throws Exception {
        MmsQueryStringDeliveryReports mmsQueryStringDeliveryReports =
                getMmsQueryStringDeliveryReportsWithAllParameters();
        Serde.INSTANCE.getObjectMapper().writeValueAsString(mmsQueryStringDeliveryReports);
    }

    @Test
    void validateMmsQueryStringDeliveryReports_withRequiredParameters() {
        Set<ConstraintViolation<MmsQueryStringDeliveryReports>> constraintViolations =
                getValidator().validate(getMmsQueryStringDeliveryReportsWithRequiredParameters());
        assertEquals(0, constraintViolations.size());
    }

    @Test
    void validateMmsQueryStringDeliveryReports_withAllParameters() {
        Set<ConstraintViolation<MmsQueryStringDeliveryReports>> constraintViolations =
                getValidator().validate(getMmsQueryStringDeliveryReportsWithAllParameters());
        assertEquals(0, constraintViolations.size());
    }

    public static MmsQueryStringDeliveryReports
            getMmsQueryStringDeliveryReportsWithRequiredParameters() {
        return new MmsQueryStringDeliveryReports();
    }

    public static MmsQueryStringDeliveryReports
            getMmsQueryStringDeliveryReportsWithAllParameters() {
        return new MmsQueryStringDeliveryReports().bulkId("MESSAGE-ID-123-xyz")
                .messageId("MESSAGE-ID-123-xyz")
                .limit(2);
    }
}
