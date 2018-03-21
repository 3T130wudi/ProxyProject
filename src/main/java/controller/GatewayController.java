package controller;

import biz.*;
import entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class GatewayController {

    @Resource
    private UsersBiz usersBiz;
    @Resource
    private GatewayBiz gatewayBiz;
    @Resource
    private ContactBiz contactBiz;
    @Resource
    private EnterpriseBiz enterpriseBiz;
    @Resource
    private AgentCustomerBiz agentCustomerBiz;

    @RequestMapping("GatewayList")
    public String GatewayList(Model model, @RequestParam(value = "name", required = false) String name, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Users users = (Users) session.getAttribute("user");
        model.addAttribute("gateway", gatewayBiz.AgentCustomerList(name));
        return "gatewayList";
    }

    @RequestMapping("GatewayObject")
    public String GatewayObject(HttpServletRequest request, @RequestParam(value = "id", required = false) String id, @RequestParam(value = "model", required = false) String model, Model m) {
        if (model.equals("0")) {
            HttpSession session = request.getSession();
            Users users = (Users) session.getAttribute("user");
            m.addAttribute("gateway", gatewayBiz.AgentCustomerById(Integer.parseInt(id)));
            return "gateway";
        }
        HttpSession session = request.getSession();
        Users users = (Users) session.getAttribute("user");
        return "gateway";
    }

    //2018-3-21新增 查看门户
    @RequestMapping("enterList")
    public String enterList(HttpServletRequest request, @RequestParam(value = "id", required = false) String id, @RequestParam(value = "model", required = false) String model, Model m) {
        if (model.equals("0")) {
            HttpSession session = request.getSession();
            Users users=(Users) session.getAttribute("user");
            m.addAttribute("gateway", gatewayBiz.AgentCustomerById(Integer.parseInt(id)));
            return "enterpriseMenList";
        }
        HttpSession session = request.getSession();
        Users users=(Users) session.getAttribute("user");
        return "enterpriseMenList";
    }
    //2018-3-21新增 修改门户
    @RequestMapping("enterList2")
    public String enterList2(HttpServletRequest request, @RequestParam(value = "id", required = false) String id, @RequestParam(value = "model", required = false) String model, Model m) {
        if (model.equals("0")) {
            HttpSession session = request.getSession();
            Users users=(Users) session.getAttribute("user");
            m.addAttribute("gateway", gatewayBiz.AgentCustomerById(Integer.parseInt(id)));
            return "enterpriseMenList2";
        }
        HttpSession session = request.getSession();
        Users users=(Users) session.getAttribute("user");
        return "enterpriseMenList2";
    }





    @RequestMapping("insertAgentCustomer")
    public String insertKeyword(HttpServletRequest request, Model model, @RequestBody Contact contact,
                                @RequestBody Gateway gateway, @RequestBody Enterprise enterprise, @RequestBody AgentCustomer agentCustomer) {
        if (gateway.getId() > 0) {
            contactBiz.updateContact(contact);
            enterpriseBiz.updateEnterprise(enterprise);
            gatewayBiz.updateGateway(gateway);
            return this.GatewayList(model, null, request);
        } else {
            gateway.setGateway_representative(gateway.getGateway_representative());
            gateway.setGateway_address(gateway.getGateway_address());
            gateway.setGateway_area(gateway.getGateway_area());
            gateway.setGateway_certificates(gateway.getGateway_certificates());
            gateway.setGateway_city(gateway.getGateway_city());
            gateway.setGateway_country(gateway.getGateway_country());
            gateway.setGateway_date(new Date());
            gateway.setGateway_fax(gateway.getGateway_fax());
            gateway.setGateway_phone(gateway.getGateway_phone());
            gateway.setGateway_region(gateway.getGateway_region());
            gateway.setGateway_remarks(gateway.getGateway_remarks());
            gateway.setGateway_type(gateway.getGateway_type());
            gatewayBiz.GatewayInsert(gateway);
            Gateway gateway1 = gatewayBiz.GatewaySelect(gateway.getGateway_phone() + "");
            enterprise.setEnterprise_home(enterprise.getEnterprise_home());
            enterprise.setEnterprise_name(enterprise.getEnterprise_name());
            enterprise.setEnterprise_type(enterprise.getEnterprise_type());
            enterprise.setEnterprise_state(enterprise.getEnterprise_state());
            enterprise.setGateway_id(gateway1);
            enterpriseBiz.insertEnterprise(enterprise);
            Enterprise enterprise1 = enterpriseBiz.selectEnterprise(enterprise.getEnterprise_name());
            contact.setContact_name(contact.getContact_name());
            contact.setContact_email(contact.getContact_email());
            contact.setContact_fax(contact.getContact_fax());
            contact.setContact_mobile(contact.getContact_mobile());
            contact.setContact_phone(contact.getContact_phone());
            contact.setContact_post(contact.getContact_post());
            contact.setEnterprise_id(enterprise1);
            contactBiz.insertContact(contact);
            Contact contact1 = contactBiz.selectContact(contact.getContact_name());
            agentCustomer.setDate(new Date());
            agentCustomer.setState(0);
            agentCustomer.setType(agentCustomer.getType());
            HttpSession session = request.getSession();
            Users users = (Users) session.getAttribute("user");
            agentCustomer.setUser_id(users);
            agentCustomer.setContact_id(contact1);
            agentCustomerBiz.AgentCustomerInsert(agentCustomer);
            return this.GatewayList(model, null, request);
        }
    }
}
