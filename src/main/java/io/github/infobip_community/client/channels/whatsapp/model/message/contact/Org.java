
package io.github.infobip_community.client.channels.whatsapp.model.message.contact;

public final class Org {
    private String company;
    private String department;
    private String title;

    /**
     * <p>
     * Org.
     * </p>
     */
    public Org() {}

    /**
     * Company name.
     */
    public Org company(String company) {
        this.company = company;
        return this;
    }

    /**
     * Department name.
     */
    public Org department(String department) {
        this.department = department;
        return this;
    }

    /**
     * Title value.
     */
    public Org title(String title) {
        this.title = title;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((company == null) ? 0 : company.hashCode());
        result = prime * result + ((department == null) ? 0 : department.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Org)) {
            return false;
        }
        Org other = (Org) obj;
        if (company == null) {
            if (other.company != null) {
                return false;
            }
        } else if (!company.equals(other.company)) {
            return false;
        }
        if (department == null) {
            if (other.department != null) {
                return false;
            }
        } else if (!department.equals(other.department)) {
            return false;
        }
        if (title == null) {
            if (other.title != null) {
                return false;
            }
        } else if (!title.equals(other.title)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Org [company=" + company + ", department=" + department + ", title=" + title + "]";
    }
}
