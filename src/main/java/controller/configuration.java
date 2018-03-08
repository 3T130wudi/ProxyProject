package controller;

import biz.financeBiz;
import com.alibaba.fastjson.JSON;

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

@Controller("Configurations")
public class configuration {
    @Resource
    private financeBiz financeBiz;

    @RequestMapping("/Financeselect")
    public  String financeselect(Model m){
        m.addAttribute("finance",financeBiz.financeselect());
        return "configuration";
    }

    @RequestMapping("/insertfinance")
    public String insertfinance(Model m, finance finance, HttpServletRequest req){
        String finance_type= req.getParameter("finance_type");
        if(finance_type!=null&&finance_type!=""){
            financeBiz.insertfinance(finance);
        }
        return financeselect(m);
    }





    @RequestMapping("/deletefinance")
    public void deletefinance(@RequestParam("id") int id,HttpServletResponse resp) throws IOException {
        boolean config=financeBiz.deletefinance(id);
        if(config){
            resp.setContentType("text/html;charset=utf-8");
            resp.setCharacterEncoding("UTF-8");
            PrintWriter writer = resp.getWriter();
            String s = JSON.toJSONString(config);
            writer.print(s);
            writer.flush();
            writer.close();
        }
    }
}
