
package io.github.infobip_community.client.channels.sms.model.message.outbound;

import jakarta.validation.Valid;
import java.util.List;

public final class BinaryMessage extends Message<BinaryMessage> {
    @Valid
    private Binary binary;

    /**
     * <p>
     * BinaryMessage.
     * </p>
     *
     * @param destinations An array of destination objects for where messages are
     *     being sent. A valid destination is required.
     */
    public BinaryMessage(List<Destination> destinations) {
        super(destinations);
    }

    /**
     * Binary.
     */
    public BinaryMessage binary(Binary binary) {
        this.binary = binary;
        return this;
    }

    public Binary getBinary() {
        return binary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((binary == null) ? 0 : binary.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof BinaryMessage)) {
            return false;
        }
        BinaryMessage other = (BinaryMessage) obj;
        if (binary == null) {
            if (other.binary != null) {
                return false;
            }
        } else if (!binary.equals(other.binary)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BinaryMessage [binary=" + binary + ", callbackData=" + callbackData
                + ", deliveryTimeWindow=" + deliveryTimeWindow + ", destinations=" + destinations
                + ", flash=" + flash + ", from=" + from + ", intermediateReport="
                + intermediateReport + ", notifyContentType=" + notifyContentType + ", notifyUrl="
                + notifyUrl + ", regional=" + regional + ", sendAt=" + sendAt + ", validityPeriod="
                + validityPeriod + "]";
    }
}
