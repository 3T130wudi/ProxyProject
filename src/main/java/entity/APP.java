package entity;

import java.util.Date;

public class APP {
   private int id;
   private String app_name;
   private String app_id;
   private String app_pwd;
   private float app_price;
   private Users user_id;
   private Date appDate;
   private String app_service_type;
   private int application;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getApp_pwd() {
        return app_pwd;
    }

    public void setApp_pwd(String app_pwd) {
        this.app_pwd = app_pwd;
    }

    public float getApp_price() {
        return app_price;
    }

    public void setApp_price(float app_price) {
        this.app_price = app_price;
    }

    public Users getUser_id() {
        return user_id;
    }

    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }

    public Date getAppDate() {
        return appDate;
    }

    public void setAppDate(Date appDate) {
        this.appDate = appDate;
    }

    public String getApp_service_type() {
        return app_service_type;
    }

    public void setApp_service_type(String app_service_type) {
        this.app_service_type = app_service_type;
    }

    public int getApplication() {
        return application;
    }

    public void setApplication(int application) {
        this.application = application;
    }
}
