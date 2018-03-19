package controller;

import biz.RoleBiz;
import biz.UsersBiz;
import com.alibaba.fastjson.JSON;
import entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller("UsersController")
public class UsersController {

    @Resource(name = "usersBiz")
    private UsersBiz usersBiz;

    @Resource(name = "roleBiz")
    private RoleBiz roleBiz;

    /**
     * 显示初始页面
     * @return
     */
    @RequestMapping("/showLogin")
    public String showLogin(){
        return "login";
    }

    /*@RequestMapping("/keyword")
    public String keyword(Model model, HttpServletRequest request){
        HttpSession session = request.getSession();
        Users users=(Users) session.getAttribute("user");
        return "keyword";
    }*/
    @RequestMapping("/login")
    public String login(Model m,Users users,HttpServletRequest request){
        Users u=usersBiz.login(users);
        if (u!=null){
            HttpSession session = request.getSession(true);
            session.setAttribute("user",u);
            return "index";
        }
        return this.showLogin();
    }

    @RequestMapping("/showUserList")
    public String showUserList(Model m,Users users){
        m.addAttribute("roleList",roleBiz.selectList());
        m.addAttribute("userList",usersBiz.selectUser(users));
        m.addAttribute("user1",usersBiz.selectUser(users));
        return "userList";
    }

    @RequestMapping("/addUser")
    public String addUser(Model m,Users users){
        if (usersBiz.addUser(users)){
           return this.showUserList(m,users);
        }else {
           return this.showUserList(m,new Users());
        }
    }

    @RequestMapping("/selectOne")
    @ResponseBody
    public void selectOne(Users users, @RequestParam("fid") int fid,HttpServletResponse resp) throws IOException {
        users.setId(fid);
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        String s = JSON.toJSONString(usersBiz.selectOne(users));
        writer.print(s);
        writer.flush();
        writer.close();
    }

    @RequestMapping("/updateUser")
    public String updateUser(Model m,Users users){
        if (usersBiz.updateUser(users)){
            return this.showUserList(m,users);
        }else {
            return this.showUserList(m,new Users());
        }
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(Model m,Users users){
        if (usersBiz.deleteUser(users)){
            return this.showUserList(m,new Users());
        }else {
            return this.showUserList(m,new Users());
        }
    }

}
