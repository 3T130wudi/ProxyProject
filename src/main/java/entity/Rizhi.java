package entity;

import java.util.Date;

public class Rizhi {
   private int id;
    private String username;
    private String shuomin;
    private Date datetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getShuomin() {
        return shuomin;
    }

    public void setShuomin(String shuomin) {
        this.shuomin = shuomin;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}
