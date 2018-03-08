package entity;

import java.util.Date;

public class Gateway {
    private int id;
    private String gateway_representative;
    private String gateway_type;
    private int gateway_certificates;
    private int gateway_phone;
    private int gateway_fax;
    private Date gateway_date;
    private String gateway_country;
    private String gateway_region;
    private String gateway_city;
    private String gateway_area;
    private String gateway_address;
    private String gateway_remarks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGateway_representative() {
        return gateway_representative;
    }

    public void setGateway_representative(String gateway_representative) {
        this.gateway_representative = gateway_representative;
    }

    public String getGateway_type() {
        return gateway_type;
    }

    public void setGateway_type(String gateway_type) {
        this.gateway_type = gateway_type;
    }

    public int getGateway_certificates() {
        return gateway_certificates;
    }

    public void setGateway_certificates(int gateway_certificates) {
        this.gateway_certificates = gateway_certificates;
    }

    public int getGateway_phone() {
        return gateway_phone;
    }

    public void setGateway_phone(int gateway_phone) {
        this.gateway_phone = gateway_phone;
    }

    public int getGateway_fax() {
        return gateway_fax;
    }

    public void setGateway_fax(int gateway_fax) {
        this.gateway_fax = gateway_fax;
    }

    public Date getGateway_date() {
        return gateway_date;
    }

    public void setGateway_date(Date gateway_date) {
        this.gateway_date = gateway_date;
    }

    public String getGateway_country() {
        return gateway_country;
    }

    public void setGateway_country(String gateway_country) {
        this.gateway_country = gateway_country;
    }

    public String getGateway_region() {
        return gateway_region;
    }

    public void setGateway_region(String gateway_region) {
        this.gateway_region = gateway_region;
    }

    public String getGateway_city() {
        return gateway_city;
    }

    public void setGateway_city(String gateway_city) {
        this.gateway_city = gateway_city;
    }

    public String getGateway_area() {
        return gateway_area;
    }

    public void setGateway_area(String gateway_area) {
        this.gateway_area = gateway_area;
    }

    public String getGateway_address() {
        return gateway_address;
    }

    public void setGateway_address(String gateway_address) {
        this.gateway_address = gateway_address;
    }

    public String getGateway_remarks() {
        return gateway_remarks;
    }

    public void setGateway_remarks(String gateway_remarks) {
        this.gateway_remarks = gateway_remarks;
    }
}
