package entity;

import java.util.Date;

public class Role {
    private int id;
    private String name;
    private AuthorityList authorityList;
    private String type;
    private Date fristDate;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getFristDate() {
        return fristDate;
    }

    public void setFristDate(Date fristDate) {
        this.fristDate = fristDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AuthorityList getAuthorityList() {
        return authorityList;
    }

    public void setAuthorityList(AuthorityList authorityList) {
        this.authorityList = authorityList;
    }
}
