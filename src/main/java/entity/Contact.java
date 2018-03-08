package entity;

public class Contact {
    private int id;
    private String contact_name;
    private String contact_phone;
    private String contact_fax;
    private String contact_mobile;
    private String contact_email;
    private String contact_post;
    private Enterprise enterprise_id;

    public Enterprise getEnterprise_id() {
        return enterprise_id;
    }

    public void setEnterprise_id(Enterprise enterprise_id) {
        this.enterprise_id = enterprise_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getContact_fax() {
        return contact_fax;
    }

    public void setContact_fax(String contact_fax) {
        this.contact_fax = contact_fax;
    }

    public String getContact_mobile() {
        return contact_mobile;
    }

    public void setContact_mobile(String contact_mobile) {
        this.contact_mobile = contact_mobile;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_post() {
        return contact_post;
    }

    public void setContact_post(String contact_post) {
        this.contact_post = contact_post;
    }
}
