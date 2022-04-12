
package io.github.infobip_community.client.common;

import java.lang.reflect.Field;

public final class QueryStringBuilder {
    private QueryStringBuilder() {}

    public static String buildQueryString(Object queryString) throws ApiException {
        String out = "?";
        try {
            for (Field field : queryString.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                out = out.concat(
                        field.getName() + "=" + String.valueOf(field.get(queryString)) + "&");
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        return out.substring(0, out.length() - 1);
    }
}
