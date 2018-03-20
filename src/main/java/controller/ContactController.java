package controller;

import biz.ContactBiz;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;


@Controller("ContactController")
public class ContactController {

    @Resource
    private ContactBiz contactBiz;

    @RequestMapping("/ALLContact")
    public String ContactList(Model model, @RequestParam(value = "contact_name",required = false) String contact_name,
                              @RequestParam(value = "enterprise_name",required = false) String enterprise_name){
        model.addAttribute("ContactList",contactBiz.ContactList(contact_name,enterprise_name));
        return "ContactList";
    }
}
