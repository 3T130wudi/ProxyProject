package entity;
public class Enterprise {
    private int id;
    private String enterprise_name;
    private String enterprise_names;
    private String enterprise_type;
    private String enterprise_home;
    private String enterprise_state;
    private Gateway gateway_id;
    private keyword keyword_name;


    public String getEnterprise_names() {
        return enterprise_names;
    }

    public void setEnterprise_names(String enterprise_names) {
        this.enterprise_names = enterprise_names;
    }

    public keyword getKeyword_name() {
        return keyword_name;
    }

    public void setKeyword_name(keyword keyword_name) {
        this.keyword_name = keyword_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnterprise_name() {
        return enterprise_name;
    }

    public void setEnterprise_name(String enterprise_name) {
        this.enterprise_name = enterprise_name;
    }

    public String getEnterprise_type() {
        return enterprise_type;
    }

    public void setEnterprise_type(String enterprise_type) {
        this.enterprise_type = enterprise_type;
    }

    public String getEnterprise_home() {
        return enterprise_home;
    }

    public void setEnterprise_home(String enterprise_home) {
        this.enterprise_home = enterprise_home;
    }

    public String getEnterprise_state() {
        return enterprise_state;
    }

    public void setEnterprise_state(String enterprise_state) {
        this.enterprise_state = enterprise_state;
    }

    public Gateway getGateway_id() {
        return gateway_id;
    }

    public void setGateway_id(Gateway gateway_id) {
        this.gateway_id = gateway_id;
    }
}
