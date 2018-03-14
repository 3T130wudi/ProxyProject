package controller;

import biz.RoleBiz;
import biz.UsersBiz;
import entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    @RequestMapping("/keyword")
    public String keyword(Model model, HttpServletRequest request){
        HttpSession session = request.getSession();
        Users users=(Users) session.getAttribute("user");
        return "keyword";
    }
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
        return "userList";
    }


}
