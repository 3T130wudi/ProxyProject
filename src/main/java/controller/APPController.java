package controller;

import biz.APPBiz;
import biz.KeywordBiz;
import biz.UsersBiz;
import com.alibaba.fastjson.JSON;
import entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Controller("APPController")
public class APPController {

    @Resource
    private KeywordBiz keywordBiz;

    @Resource
    private UsersBiz usersBiz;

    @Resource
    private APPBiz appBiz;
    @RequestMapping("/selectName")
    public void selectName(@RequestParam("name") String name, HttpServletResponse resp) throws IOException {
        APP app = appBiz.selectAPP(name);
        if(app !=null){
            resp.setContentType("text/html;charset=utf-8");
            resp.setCharacterEncoding("UTF-8");
            PrintWriter writer = resp.getWriter();
            String s = JSON.toJSONString(app);
            writer.print(s);
            writer.flush();
            writer.close();
        }
    }
    @RequestMapping("/insertKeyword")
    public String insertKeyword(@RequestParam("keyword") String keyword, @RequestParam("service_Type_id") int service_Type_id,
                                @RequestParam("keywordDate") int keywordDate, @RequestParam("price") float price,
                                @RequestParam("id") int user_id, Model model, HttpServletRequest request){
        keyword k=new keyword();
        k.setKeyword(keyword);
        Users users=new Users();
        users.setId(user_id);
        k.setUser_id(users);
        k.setService_Type_id(service_Type_id);
        k.setPrice(price);
        k.setVerifier(0);
        k.setUser_mode(1);
        k.setApplication(0);
        AgentCustomer agent=new AgentCustomer();
        agent.setId(user_id);
        k.setAgent_id(agent);
        k.setKeywordDate(new Date());
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, keywordDate);
        k.setKeywordsOverdue(c.getTime());
        k.setAgeLimit(keywordDate);
        APP app=new APP();
        app.setId(-1);
        k.setAPP_id(app);
        UsersController usersController=new UsersController();
        if(keywordBiz.insertKeyword(k)>0){
            return this.keywordList(model,request,null);
        }
        return usersController.keyword(model,request);
    }
    @RequestMapping("keywordList")
    public String keywordList(Model model,HttpServletRequest request,@RequestParam(value = "keyword",required = false) String name){
        HttpSession session = request.getSession();
        Users users=(Users) session.getAttribute("user");
        model.addAttribute("keyword",keywordBiz.keywordList(name));
        return "keywordList";
    }
}
