package biz.impl;

import biz.ContactBiz;
import dao.ContactDao;
import entity.Contact;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContactBizImpl implements ContactBiz {
    @Resource
    private ContactDao contactDao;
    public int insertContact(Contact contact) {
        return contactDao.insertContact(contact);
    }

    public Contact selectContact(String name) {
        return contactDao.selectContact(name);
    }

    public int updateContact(Contact contact) {
        return contactDao.updateContact(contact);
    }

    public List<Contact> ContactList(String contact_name,String enterprise_name) {
        return contactDao.ContactList(contact_name,enterprise_name);
    }

    public Contact Contact(int id) {
        return contactDao.Contact(id);
    }
}
