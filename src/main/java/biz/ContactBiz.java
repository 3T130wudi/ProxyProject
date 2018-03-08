package biz;

import entity.Contact;
import org.apache.ibatis.annotations.Param;

public interface ContactBiz {
    int insertContact(Contact contact);
    Contact selectContact(String name);
    int updateContact(Contact contact);
}
