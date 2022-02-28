
package com.infobip.client.common;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public enum Serde {
    INSTANCE;

    private final ObjectMapper objectMapper = new ObjectMapper();

    private Serde() {
        objectMapper.setSerializationInclusion(Include.NON_NULL);
        objectMapper.setSerializationInclusion(Include.NON_EMPTY);
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
