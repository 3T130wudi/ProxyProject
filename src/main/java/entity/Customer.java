package entity;

public class Customer {
    private int customer_id;
    private String customer_type;
    private int customer_enable;
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }

    public int getCustomer_enable() {
        return customer_enable;
    }

    public void setCustomer_enable(int customer_enable) {
        this.customer_enable = customer_enable;
    }


}
