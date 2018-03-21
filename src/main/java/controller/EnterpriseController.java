package controller;


import biz.EnterpriseBiz;
import biz.GatewayBiz;
import entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller("enterprise")
public class EnterpriseController {


    @Resource
    private EnterpriseBiz enterpriseBiz;

    @Resource
    private GatewayBiz gatewayBiz;


//    @RequestMapping("/enterpriseMenList")
//    public  String enterpriseMenList(){
//        return "enterpriseMen";
//    }
////



    @RequestMapping("enterpriseMenList")
    public String enterpriseMenList(org.springframework.ui.Model model, @RequestParam(value = "name", required = false) String name, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Users users=(Users) session.getAttribute("user");
        model.addAttribute("enterpris", enterpriseBiz.EnterpriseList(name));
        return "enterpriseMen";
    }
}
