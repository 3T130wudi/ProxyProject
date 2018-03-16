package controller;

import biz.*;
import com.alibaba.fastjson.JSON;

import entity.Application;
import entity.Life;
import entity.Service;
import entity.finance;
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

    //财务类型增加
    @RequestMapping("/insertfinance")
    public String insertfinance(Model m, finance finance, HttpServletRequest req){
        String finance_type= req.getParameter("finance_type");
        if(finance_type!=null&&finance_type!=""){
            financeBiz.insertfinance(finance);


        }
        return financeselect(m);
    }



    //财务类型删除
    @RequestMapping("/deletefinance")
    public String deletefinance(Model m,@RequestParam("configId") int configId,HttpServletResponse resp) throws IOException {
        boolean config=financeBiz.deletefinance(configId);
        PrintWriter out = resp.getWriter();
        if(config){
            out.print("<script>alert('删除成功！')</script>");
        }else {
            out.print("<script>alert('删除失败！')</script>");
        }
        return financeselect(m);

    }
    //财务类型ajax查看
    @RequestMapping("/selectfnance")
    public void selectfnance(@RequestParam("fid") int fid,HttpServletResponse resp) throws IOException {
        finance finid= financeBiz.selectfnance(fid);
        if(finid!=null){
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
    public void updatafinance(Model m,@RequestParam("finance_id") int finance_id ,HttpServletRequest req,HttpServletResponse resp) throws IOException {

        finance finance=new finance();

        finance.setFinance_id(finance_id);
        int fnan= financeBiz.updatafinance(finance);

            resp.setContentType("text/html;charset=utf-8");
            resp.setCharacterEncoding("UTF-8");
            PrintWriter writer = resp.getWriter();
            String s = JSON.toJSONString(fnan);
            writer.print(s);
            writer.flush();
            writer.close();
        }


    //服务类型集合查询
    @RequestMapping("/selectService")
    private String selectService(Model m){
        m.addAttribute("service",serviceBiz.selectService());
        return "configuration-service";
    }

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

    @RequestMapping("/updateservice")
    private  String updateservice(Model m,@RequestParam("service_id") int service_id,Service service, HttpServletResponse resp,HttpServletRequest req) throws IOException {

        service.setService_id(service_id);
        if(serviceBiz.updateservice(service)){
            return selectService(m);
        }
        return selectService(m);
    }


    @RequestMapping("/selectlife")
    private  String selectlife(Model m, Life life){
        m.addAttribute("life",lifeBiz.selectlife(life)) ;
        return "configuration-life";
    }
    @RequestMapping("/selectapplication")
    private  String selectapplication(Model m, Application application){
        m.addAttribute("application",applicationBiz.selectapplication(application));
        return "configuration-application";
    }

    @RequestMapping("/selectcurrency")
    private String selectcurrency(Model m){

        m.addAttribute("currency",customerBiz.selectcurrency());
        return "configuration-customer";

    }
    @RequestMapping("/selectcertificates")
    private  String selectcertificates(Model m){
        m.addAttribute("certificates",certificatesBiz.selectcertificates());
        return "configuration-certificates";

    }

    @RequestMapping("/selectDiscount")
    private String selectDiscount(Model m){
        m.addAttribute("discount",discountBiz.selectDiscount());
        return "configuration-discount";

    }
    }

