package entity;

import java.util.Date;

public class keyword {
    private int id;
    private String keyword;
    private Users user_id;
    private int service_Type_id;
    private float price;
    private int verifier;
    private int user_mode;
    private int Application;
    private AgentCustomer agent_id;
    private Date keywordDate;
    private Date keywordsOverdue;
    private int ageLimit;
    private APP APP_id;

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public Date getKeywordsOverdue() {
        return keywordsOverdue;
    }

    public void setKeywordsOverdue(Date keywordsOverdue) {
        this.keywordsOverdue = keywordsOverdue;
    }

    public APP getAPP_id() {
        return APP_id;
    }

    public void setAPP_id(APP APP_id) {
        this.APP_id = APP_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Users getUser_id() {
        return user_id;
    }

    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }

    public int getService_Type_id() {
        return service_Type_id;
    }

    public void setService_Type_id(int service_Type_id) {
        this.service_Type_id = service_Type_id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getVerifier() {
        return verifier;
    }

    public void setVerifier(int verifier) {
        this.verifier = verifier;
    }

    public int getUser_mode() {
        return user_mode;
    }

    public void setUser_mode(int user_mode) {
        this.user_mode = user_mode;
    }

    public int getApplication() {
        return Application;
    }

    public void setApplication(int application) {
        Application = application;
    }

    public AgentCustomer getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(AgentCustomer agent_id) {
        this.agent_id = agent_id;
    }

    public Date getKeywordDate() {
        return keywordDate;
    }

    public void setKeywordDate(Date keywordDate) {
        this.keywordDate = keywordDate;
    }
}
