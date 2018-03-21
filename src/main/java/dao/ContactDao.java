package dao;

import entity.Contact;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContactDao {
    int insertContact(Contact contact);
    Contact selectContact(@Param("name") String name);
    int updateContact(Contact contact);
    List<Contact> ContactList(@Param("contact_name")String contact_name,@Param("enterprise_name") String enterprise_name);
    Contact Contact(@Param("id") int id);
}
