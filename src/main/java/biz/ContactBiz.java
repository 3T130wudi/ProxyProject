package biz;

import entity.Contact;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContactBiz {
    int insertContact(Contact contact);
    Contact selectContact(String name);
    int updateContact(Contact contact);
    List<Contact> ContactList();
}
