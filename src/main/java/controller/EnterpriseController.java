package controller;


import biz.EnterpriseBiz;
import biz.GatewayBiz;

import entity.Enterprise;
import entity.Pager;
import entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String enterpriseMenList(Model model, @RequestParam(value = "name", required = false) String name,@RequestParam(required = false,defaultValue = "1") int pageNo, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Users users=(Users) session.getAttribute("user");
        if (pageNo<=0){
            pageNo=1;
        }
        Pager<Enterprise> ente= enterpriseBiz.EnterpriseList(name,3,pageNo);
        model.addAttribute("enterpris",ente);

        return "enterpriseMen";
    }
}
