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
    private UsersBiz usersBiz;

    @Resource
    private APPBiz appBiz;
    @RequestMapping("/selectName")
    public void selectName(@RequestParam(value = "name",required = false) String name, HttpServletResponse resp) throws IOException {
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
}
