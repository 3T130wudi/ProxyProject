package controller;

import biz.ContactBiz;
import biz.EnterpriseBiz;
import biz.GatewayBiz;
import entity.Contact;
import entity.Enterprise;
import entity.Gateway;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Date;


@Controller("ContactController")
public class ContactController {

    @Resource
    private ContactBiz contactBiz;

    @Resource
    private EnterpriseBiz enterpriseBiz;

    @Resource
    private GatewayBiz gatewayBiz;

    @RequestMapping("/ALLContact")
    public String ContactList(Model model, @RequestParam(value = "contact_name",required = false) String contact_name,
                              @RequestParam(value = "enterprise_name",required = false) String enterprise_name){
        model.addAttribute("ContactList",contactBiz.ContactList(contact_name,enterprise_name));
        return "ContactList";
    }

    @RequestMapping("/ContactById")
    public String ContactById(@RequestParam("id") String id,Model m){
        m.addAttribute("c",contactBiz.Contact(Integer.parseInt(id)));
        return "Contact";
    }
    @RequestMapping("/updateContact")
    public String updateContact(Model model,@RequestParam("cegid") int cegid,@RequestParam("gateway_remarks") String gateway_remarks){
        Gateway gateway=new Gateway();
        gateway.setGateway_remarks(gateway_remarks);
        gateway.setId(cegid);
        gatewayBiz.updateGatewayGateway_remarks(gateway);
        return this.ContactList(model,null,null);
    }
}
