package controller;

import biz.ContactBiz;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.annotation.Resources;

@Service("ContactController")
public class ContactController {

    @Resource
    private ContactBiz contactBiz;

    @RequestMapping("ContactList")
    public String ContactList(Model model){
        model.addAttribute("ContactList",contactBiz.ContactList());
        return "ContactList";
    }
}
