
package com.infobip.client.channels.whatsapp.model;

public final class Org {
    private String company;
    private String department;
    private String title;

    public Org() {}

    public Org company(String company) {
        this.company = company;
        return this;
    }

    public Org department(String department) {
        this.department = department;
        return this;
    }

    public Org title(String title) {
        this.title = title;
        return this;
    }
}
