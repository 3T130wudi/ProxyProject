package entity;

public class Discount {
    private int discount_id;
    private String discount_type;
    private int discount_numer;
    private int discount_actual;
    private int discount_enable;

    public Discount() {
    }

    public int getDiscount_id() {

        return discount_id;
    }

    public void setDiscount_id(int discount_id) {
        this.discount_id = discount_id;
    }

    public String getDiscount_type() {
        return discount_type;
    }

    public void setDiscount_type(String discount_type) {
        this.discount_type = discount_type;
    }

    public int getDiscount_numer() {
        return discount_numer;
    }

    public void setDiscount_numer(int discount_numer) {
        this.discount_numer = discount_numer;
    }

    public int getDiscount_actual() {
        return discount_actual;
    }

    public void setDiscount_actual(int discount_actual) {
        this.discount_actual = discount_actual;
    }

    public int getDiscount_enable() {
        return discount_enable;
    }

    public void setDiscount_enable(int discount_enable) {
        this.discount_enable = discount_enable;
    }



}
