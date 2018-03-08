package dao;

import entity.Contact;
import org.apache.ibatis.annotations.Param;

public interface ContactDao {
    int insertContact(Contact contact);
    Contact selectContact(@Param("name") String name);
    int updateContact(Contact contact);
}
