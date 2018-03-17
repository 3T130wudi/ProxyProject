package controller;

import biz.*;
import com.alibaba.fastjson.JSON;

import entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.Currency;
import java.util.List;

@Controller("Configuration")
public class configuration {
    @Resource
    private financeBiz financeBiz;
    @Resource
    private ServiceBiz serviceBiz;
    @Resource
    private LifeBiz lifeBiz;
    @Resource
    private ApplicationBiz applicationBiz;
    @Resource
    private CustomerBiz customerBiz;
    @Resource
    private CertificatesBiz certificatesBiz;
    @Resource
    private DiscountBiz discountBiz;

    //财务类型集合查询
    @RequestMapping("/Financeselect")
    public  String financeselect(Model m){
        m.addAttribute("finance",financeBiz.financeselect());
        return "configuration";
    }

    //财务类型判断重复增加
    @RequestMapping("/insertjudgment")
    private void  insertjudgment(Model m,finance finance,@RequestParam("finance_type") String finance_type, HttpServletResponse resp,HttpServletRequest req ) throws IOException {
        //URLDecoder urlDecoder=new URLDecoder();
        //urlDecoder.decode(finance_type,"utf-8");
        //new String(finance_type.getBytes("iso-8859-1"),"utf-8");
       finance.setFinance_type(finance_type);
        List<finance> fian=financeBiz.insertjuct(finance);
        for (finance f:fian) {
            if(f!=null) {
                req.setCharacterEncoding("UTF-8");
                resp.setContentType("text/html;charset=utf-8");
                resp.setCharacterEncoding("utf-8");
                PrintWriter writer = resp.getWriter();
                String s = JSON.toJSONString(f.getFinance_type().equals(finance_type));
                writer.print(s);
                writer.flush();
                writer.close();
            }
        }


    }

    //财务类型增加
    @RequestMapping("/insertfinance")
    public String insertfinance(Model m,HttpServletRequest req, HttpServletResponse resp){
        String finance_type= req.getParameter("finance_type");
        finance finance=new finance();
        finance.setFinance_type(finance_type);
        List<finance> fian=financeBiz.insertjuct(finance);
        if (finance_type != null && finance_type != "") {
            for (finance f:fian) {
                if(f.getFinance_type().equals(finance_type)){
                       return financeselect(m);
                }

            }

        }
        financeBiz.insertfinance(finance);
        return financeselect(m);
    }



    //财务类型删除
    @RequestMapping("/deletefinance")
    public String deletefinance(Model m,@RequestParam("configId") int configId,HttpServletResponse resp) throws IOException {
        boolean config=financeBiz.deletefinance(configId);
        PrintWriter out = resp.getWriter();
        if(config){

        }
        return financeselect(m);

    }
    //财务类型ajax查看
    @RequestMapping("/selectfnance")
    public void selectfnance(@RequestParam("finance_id") int finance_id,HttpServletResponse resp,HttpServletRequest req) throws IOException {

        finance finance=new finance();
        finance.setFinance_id(finance_id);
        finance finid= financeBiz.fanceselect(finance);
        if(finid!=null){
            req.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html;charset=utf-8");
            resp.setCharacterEncoding("UTF-8");
            PrintWriter writer = resp.getWriter();
            String s = JSON.toJSONString(finid);
            writer.print(s);
            writer.flush();
            writer.close();
        }
    }

    //财务类型修改
    @RequestMapping("/updatafinance")
    public String updatafinance(Model m,@RequestParam("finance_id") int finance_id ,finance finance,HttpServletRequest req,HttpServletResponse resp) throws IOException {
        finance.setFinance_id(finance_id);
        int fnan= financeBiz.updatafinance(finance);
        if(fnan>0) {
           return financeselect(m);
        }
        return financeselect(m);
        }


    //服务类型集合查询
    @RequestMapping("/selectService")
    private String selectService(Model m){
        m.addAttribute("service",serviceBiz.selectService());
        return "configuration-service";
    }
    //服务类型ajax比较重复的值
    @RequestMapping("/selectname")
    private void selectname(Model m,HttpServletResponse resp,HttpServletRequest req,@RequestParam("service_type") String service_type) throws IOException {
        Service service=new Service();
        service.setService_type(service_type);
        List<Service> ser=serviceBiz.selectname(service);
        for (Service x:ser) {
            if(x!=null)  {
                resp.setContentType("text/html;charset=utf-8");
                resp.setCharacterEncoding("UTF-8");
                PrintWriter writer = resp.getWriter();
                String s = JSON.toJSONString(x.getService_type().equals(service_type));
                writer.print(s);
                writer.flush();
                writer.close();
            }
        }
    }


    //服务类型增加
    @RequestMapping("/insertselect")
    private  String insertselect(Model m, Service service,HttpServletRequest req){
        String servicetype =req.getParameter("service_type");
        List<Service> ser=serviceBiz.selectname(service);
        for (Service x:ser) {
            if(x.getService_type().equals(servicetype)){
                return selectService(m);
            }

        }
        serviceBiz.insertselect(service);
        return selectService(m);
    }
    //服务类型ajax修改查看
    @RequestMapping("/serviceselect")
    private  void serviceselect(Model m,@RequestParam("uid") int uid,HttpServletResponse resp) throws IOException {
       Service service=new Service();
       service.setService_id(uid);
       Service ser= serviceBiz.serviceselect(service);
       if(ser!=null) {
           resp.setContentType("text/html;charset=utf-8");
           resp.setCharacterEncoding("UTF-8");
           PrintWriter writer = resp.getWriter();
           String s = JSON.toJSONString(ser);
           writer.print(s);
           writer.flush();
           writer.close();
       }

    }
    //服务类型ajax修改
    @RequestMapping("/updateservice")
    private  String updateservice(Model m,@RequestParam("service_id") int service_id,Service service, HttpServletResponse resp,HttpServletRequest req) throws IOException {

        service.setService_id(service_id);
        if(serviceBiz.updateservice(service)){
            return selectService(m);
        }
        return selectService(m);
    }


    //服务年限集合查询
    @RequestMapping("/selectlife")
    private  String selectlife(Model m, Life life){
        m.addAttribute("life",lifeBiz.selectlife(life)) ;
        return "configuration-life";
    }
    //服务年限修改
    @RequestMapping("/updatelife")
    private  String updatelife(Model m,Life life,@RequestParam("life_id") int life_id){
        life.setLife_id(life_id);
        if(lifeBiz.updatelife(life)){

        }

          return selectlife(m,life);
    }
    //APP地址集合查询
    @RequestMapping("/selectapplication")
    private  String selectapplication(Model m, Application application){
        m.addAttribute("application",applicationBiz.selectapplication(application));
        return "configuration-application";
    }
    //APP地址修改
    @RequestMapping("updateappcation")
    private String updateappcation(Model m,Application application,@RequestParam("application_id")int application_id ){

        application.setApplication_id(application_id);
        if(applicationBiz.updateappcation(application)){

        }
       return selectapplication(m,application);
    }

    //客户类型集合查询
    @RequestMapping("/selectcurrency")
    private String selectcurrency(Model m){

        m.addAttribute("currency",customerBiz.selectcurrency());
        return "configuration-customer";

    }
    //客户类型增加判断重复值
    @RequestMapping("/currencyselect")
    private  void currencyselect(Model m, Customer customer, HttpServletResponse resp, @RequestParam("customer_type") String customer_type) throws IOException {
        customer.setCustomer_type(customer_type);
       List<Customer> cust =customerBiz.currencyselect(customer);
        for (Customer c:cust) {
            if(c!=null) {
                resp.setContentType("text/html;charset=utf-8");
                resp.setCharacterEncoding("UTF-8");
                PrintWriter writer = resp.getWriter();
                String s = JSON.toJSONString(c.getCustomer_type().equals(customer_type));
                writer.print(s);
                writer.flush();
                writer.close();
            }
        }

    }



    //证件类型集合查询
    @RequestMapping("/selectcertificates")
    private  String selectcertificates(Model m){
        m.addAttribute("certificates",certificatesBiz.selectcertificates());
        return "configuration-certificates";

    }

    //优惠类型集合查看
    @RequestMapping("/selectDiscount")
    private String selectDiscount(Model m){
        m.addAttribute("discount",discountBiz.selectDiscount());
        return "configuration-discount";

    }
    }

