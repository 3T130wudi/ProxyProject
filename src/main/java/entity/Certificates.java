package entity;

public class Certificates {
    private  int certificates_id;
    private  String certificates_type;
    private  int certificates_enable;

    public Certificates() {
    }

    public int getCertificates_id() {
        return certificates_id;
    }

    public void setCertificates_id(int certificates_id) {
        this.certificates_id = certificates_id;
    }

    public String getCertificates_type() {
        return certificates_type;
    }

    public void setCertificates_type(String certificates_type) {
        this.certificates_type = certificates_type;
    }

    public int getCertificates_enable() {
        return certificates_enable;
    }

    public void setCertificates_enable(int certificates_enable) {
        this.certificates_enable = certificates_enable;
    }
}
