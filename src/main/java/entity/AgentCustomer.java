package entity;

import java.util.Date;

public class AgentCustomer {
    private int id;
    private Users user_id;
    private Contact contact_id;
    private Date date;
    private String type;
    private int state;

    @Override
    public String toString() {
        return "AgentCustomer{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", contact_id=" + contact_id +
                ", date=" + date +
                ", type='" + type + '\'' +
                ", state=" + state +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUser_id() {
        return user_id;
    }



    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }

    public Contact getContact_id() {
        return contact_id;
    }

    public void setContact_id(Contact contact_id) {
        this.contact_id = contact_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
