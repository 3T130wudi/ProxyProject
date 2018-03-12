package entity;

public class Service {
    private int service_id;
    private int service_tow;
    private String service_type;
    private int service_enable;

    public Service() {
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public int getService_tow() {
        return service_tow;
    }

    public void setService_tow(int service_tow) {
        this.service_tow = service_tow;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public int getService_enable() {
        return service_enable;
    }

    public void setService_enable(int service_enable) {
        this.service_enable = service_enable;
    }
}
