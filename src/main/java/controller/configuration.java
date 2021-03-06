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
import javax.servlet.http.HttpSession;
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
    @Resource
    private RizhiBiz  rizhiBiz;

    //财务类型集合查询


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
                       return queryfinance(m,1);
                }

            }
            HttpSession session = req.getSession(true);
            Users u= (Users) session.getAttribute("user");
            rizhiBiz.addrizhi(u.getName(),"新增一个财务类型");
            financeBiz.insertfinance(finance);
        }

        return queryfinance(m,1);
    }



    //财务类型删除
    @RequestMapping("/deletefinance")
    public String deletefinance(Model m,@RequestParam("configId") int configId,HttpServletResponse resp,HttpServletRequest req) throws IOException {
        boolean config=financeBiz.deletefinance(configId);
        HttpSession session = req.getSession(true);
        Users u= (Users) session.getAttribute("user");
        rizhiBiz.addrizhi(u.getName(),"删除了一个财务类型");

        PrintWriter out = resp.getWriter();
        if(config){

        }
        return queryfinance(m,1);

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
            HttpSession session = req.getSession(true);
            Users u= (Users) session.getAttribute("user");
            rizhiBiz.addrizhi(u.getName(),"修改了一个财务类型");
           return queryfinance(m,1);
        }
        return queryfinance(m,1);
        }
    //财务类型分页
    @RequestMapping("/queryfinance")
    private  String queryfinance(Model m,@RequestParam(required = false,defaultValue = "1") int pageNo){

        if(pageNo<=0){
            pageNo=1;
        }
       Pager<finance> Pager= financeBiz.queryfinance(pageNo,5);
        m.addAttribute("pager",Pager);
        m.addAttribute("finance",financeBiz.financeselect());
        return "configuration";

    }


    //服务类型集合查询
    @RequestMapping("/selectService")
    private String selectService(Model m,@RequestParam(required = false,defaultValue = "1") int pageNo){
        if(pageNo<=0){
            pageNo=1;
        }
        Pager<Service> pager=serviceBiz.selectService(pageNo,5);
        m.addAttribute("pager",pager);
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
                return selectService(m,1);
            }

        }
        serviceBiz.insertselect(service);
        return selectService(m,1);
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
            return selectService(m,1);
        }
        return selectService(m,1);
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

    //客户类型集合查询带分页
    @RequestMapping("/selectcurrency")
    private String selectcurrency(Model m,@RequestParam(required = false,defaultValue = "1") int pageNo){
        if(pageNo<=0){
            pageNo=1;
        }
        Pager<Customer> pager=customerBiz.selectcurrency(pageNo,5);
        m.addAttribute("pager",pager);
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
    //客户类型增
    @RequestMapping("/insertcurrrency")
    private  String insertcurrrency(Model m,Customer customer,@RequestParam("customer_type") String customer_type){
        customer.setCustomer_type(customer_type);
        List<Customer> cust =customerBiz.currencyselect(customer);
        if(customer_type!=null&&customer_type!="") {
            for (Customer c : cust) {

                if (c.getCustomer_type().equals(customer_type)) {
                    return selectcurrency(m,1);
                }
            }
            customerBiz.insertcurrrency(customer);
        }
        return selectcurrency(m,1);

    }
    //客户类型删除
    @RequestMapping("/deletecustomer")
    private  String deletecustomer(Model m,@RequestParam("customer_id") int customer_id){
        if(customerBiz.deletecustomer(customer_id)){

        }
        return selectcurrency(m,1);
    }
    //客户类型修改查看
    @RequestMapping("/customerselect")
    private  void customerselect(Model m,Customer customer,@RequestParam("customer_id") int customer_id,HttpServletResponse resp) throws IOException {
        customer.setCustomer_id(customer_id);
      Customer com=  customerBiz.customerselect(customer);
      if(com!=null) {
          resp.setContentType("text/html;charset=utf-8");
          resp.setCharacterEncoding("UTF-8");
          PrintWriter writer = resp.getWriter();
          String s = JSON.toJSONString(com);
          writer.print(s);
          writer.flush();
          writer.close();
      }

    }
    //客户类型修改
    @RequestMapping("/updatecustomer")
    private String updatecustomer(Model m,Customer customer,@RequestParam("customer_id") int customer_id){
        customer.setCustomer_id(customer_id);
        if(customerBiz.updatecustomer(customer)){

        }
       return selectcurrency(m,1);
    }



    //证件类型集合查询
    @RequestMapping("/selectcertificates")
    private  String selectcertificates(Model m){
        m.addAttribute("certificates",certificatesBiz.selectcertificates());
        return "configuration-certificates";

    }
    //证件类型增加判断重复的值
    @RequestMapping("/certificatesselect")
    private void certificatesselect(Model m,Certificates certificates,@RequestParam("certificates_type") String certificates_type,HttpServletResponse resp) throws IOException {
       certificates.setCertificates_type(certificates_type);
       List<Certificates> cer= certificatesBiz.certificatesselect(certificates);
        for (Certificates c:cer) {
            if(c!=null) {
                resp.setContentType("text/html;charset=utf-8");
                resp.setCharacterEncoding("UTF-8");
                PrintWriter writer = resp.getWriter();
                String s = JSON.toJSONString(c.getCertificates_type().equals(certificates_type));
                writer.print(s);
                writer.flush();
                writer.close();
            }
        }

    }
    //证件类型增加判断重复的值
    @RequestMapping("/insertcertificates")
    private  String insertcertificates(Model m,Certificates certificates,@RequestParam("certificates_type") String certificates_type){
        List<Certificates> cer= certificatesBiz.certificatesselect(certificates);
        if (certificates_type!=null&&certificates_type!="") {
            for (Certificates c:cer) {
               if(c.getCertificates_type().equals(certificates_type)){
                   return selectcertificates(m);
               }
            }
            certificatesBiz.insertcertificates(certificates);
        }

        return selectcertificates(m);

    }
    //证件类型删除
    @RequestMapping("/deletecertificates")
    private  String deletecertificates(Model m,@RequestParam("certificates_id") int certificates_id){
        if(certificatesBiz.deletecertificates(certificates_id)){

        }
        return selectcertificates(m);
    }
    //证件类型修改查看
    @RequestMapping("/selectficates")
    private  void  selectficates(Model m,Certificates certificates,@RequestParam("certificates_id") int certificates_id,HttpServletResponse resp) throws IOException {

        certificates.setCertificates_id(certificates_id);
        Certificates c= certificatesBiz.selectficates(certificates);
        if(c!=null) {
            resp.setContentType("text/html;charset=utf-8");
            resp.setCharacterEncoding("UTF-8");
            PrintWriter writer = resp.getWriter();
            String s = JSON.toJSONString(c);
            writer.print(s);
            writer.flush();
            writer.close();
        }
    }

    //证件类型修改
    @RequestMapping("/updatecertificates")
    private String updatecertificates(Model m,Certificates certificates,@RequestParam("certificates_id") int certificates_id ){
        certificates.setCertificates_id(certificates_id);
        if(certificatesBiz.updatecertificates(certificates)){

        }
        return selectcertificates(m);
    }




    //优惠类型集合查看带分页
    @RequestMapping("/selectDiscount")
    private String selectDiscount(Model m,@RequestParam(required = false,defaultValue = "1") int pageNo){
        if(pageNo<=0){
            pageNo=1;
        }
        Pager<Discount> pager=discountBiz.selectDiscount(pageNo,5);
        m.addAttribute("pager",pager);
        return "configuration-discount";

    }
    //优惠类型增加重复的值
    @RequestMapping("/discountselect")
    private  void  discountselect(Model m,Discount discount,@RequestParam("discount_type") String discount_type,HttpServletResponse resp) throws IOException {

        discount.setDiscount_type(discount_type);
        List<Discount> discountselect = discountBiz.discountselect(discount);
        for (Discount d: discountselect) {
            if(d!=null) {
                resp.setContentType("text/html;charset=utf-8");
                resp.setCharacterEncoding("UTF-8");
                PrintWriter writer = resp.getWriter();
                String s = JSON.toJSONString(d.getDiscount_type().equals(discount_type));
                writer.print(s);
                writer.flush();
                writer.close();
            }
        }
    }
    //优惠类型增加
    @RequestMapping("/insertdicount")
    private  String insertdicount(Model m,Discount discount,HttpServletRequest req){
        String discount_type = req.getParameter("discount_type");
        discount.setDiscount_type(discount_type);
        List<Discount> discountselect = discountBiz.discountselect(discount);
            for (Discount d: discountselect) {
                if(d.getDiscount_type().equals(discount_type)){
                    return selectDiscount(m,1);
                }
            }
        if(discountBiz.insertdicount(discount)){
        }

        return selectDiscount(m,1);
    }
    //优惠类型删除
    @RequestMapping("/deletedisount")
    private  String deletedisount(Model m,@RequestParam("discount_id") int discount_id){
        discountBiz.deletedisount(discount_id);
        return selectDiscount(m,1);

    }

    //优惠类型修改查看
    @RequestMapping("/soutselect")
    private void  soutselect(Model m,Discount discount,@RequestParam("discount_id") int discount_id,HttpServletResponse resp) throws IOException {
        discount.setDiscount_id(discount_id);
        Discount sout = discountBiz.soutselect(discount);
        if(sout!=null) {
            resp.setContentType("text/html;charset=utf-8");
            resp.setCharacterEncoding("UTF-8");
            PrintWriter writer = resp.getWriter();
            String s = JSON.toJSONString(sout);
            writer.print(s);
            writer.flush();
            writer.close();
        }
    }
    //优惠类型修改
    @RequestMapping("/updatedisount")
    private String updatedisount(Model m,Discount discount,@RequestParam("discount_id") int discount_id){
        discount.setDiscount_id(discount_id);
        discountBiz.updatedisount(discount);
        return selectDiscount(m,1);
    }



}

