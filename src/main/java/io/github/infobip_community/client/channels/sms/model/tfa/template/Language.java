
package io.github.infobip_community.client.channels.sms.model.tfa.template;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Language {
    //@formatter:off
    EN("en"), ES("es"), CA("ca"), DA("da"), NL("nl"), FR("fr"), DE("de"), IT("it"),
    JA("ja"), KO("ko"), NO("no"), PL("pl"), RU("ru"), SV("sv"), FI("fi"), HR("hr"),
    SL("sl"), PT_PT("pt-pt"), PT_BR("pt-br"), ZH_CN("zh-cn"), ZH_TW("zh-tw");
    //@formatter:on

    private final String value;

    private Language(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
