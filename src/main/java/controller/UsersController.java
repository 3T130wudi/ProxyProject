package controller;

import biz.RizhiBiz;
import biz.RoleBiz;
import biz.UsersBiz;
import biz.UsersMimaoBiz;
import com.alibaba.fastjson.JSON;
import entity.Pager;
import entity.Rizhi;
import entity.Users;
import entity.UsersMimao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import util.MD5;

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

    @Resource(name = "usersMimaoBiz")
    private UsersMimaoBiz usersMimaoBiz;

    @Resource(name = "rizhiBiz")
    private RizhiBiz rizhiBiz;


    /**
     * 显示初始页面
     * @return
     */
    @RequestMapping("/showLogin")
    public String showLogin(Model m){
        return "login";
    }

    @RequestMapping("/login")
    public String login(Model m,Users users,HttpServletRequest request){
        MD5 md5=new MD5();
        String password=md5.toMD5(users.getPassword()) ;
        System.out.println(password);
        users.setPassword(password);
        Users u=usersBiz.login(users);
        if (u!=null){
            HttpSession session = request.getSession(true);
            session.setAttribute("user",u);
            rizhiBiz.addrizhi(u.getName(),"登陆");
            return "index";
        }

        return this.showLogin(m);
    }

    @RequestMapping("/showUserList")
    public String showUserList(Model m,@RequestParam(required = false,defaultValue = "1") int pageNo,Users users){
        if (pageNo<=0){
            pageNo=1;
        }

        m.addAttribute("roleList",roleBiz.selectList());
        m.addAttribute("userList",usersBiz.selectUser(users.getName(),users.getRoleId(),users.getType(),3,pageNo));
        return "userList";
    }

    @RequestMapping("/addUser")
    public String addUser(Model m, Users users,HttpServletRequest request) {
        MD5 md5=new MD5();
        String password=md5.toMD5(users.getPassword()) ;
        users.setPassword(password);
        if (usersBiz.addUser(users)){
            HttpSession session = request.getSession(true);
            Users u= (Users) session.getAttribute("user");
            rizhiBiz.addrizhi(u.getName(),"新增一个用户");
           return this.showUserList(m,1,users);
        }else {
           return this.showUserList(m,1,new Users());
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
    public String updateUser(Model m,Users users,HttpServletRequest request){
        if (usersBiz.updateUser(users)){
            HttpSession session = request.getSession(true);
            Users u= (Users) session.getAttribute("user");
            rizhiBiz.addrizhi(u.getName(),"修改一个用户");
            return this.showUserList(m,1,users);
        }else {
            return this.showUserList(m,1,new Users());
        }
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(Model m,Users users,HttpServletRequest request){
        if (usersBiz.deleteUser(users)){
            HttpSession session = request.getSession(true);
            Users u= (Users) session.getAttribute("user");
            rizhiBiz.addrizhi(u.getName(),"删除一个用户");
            return this.showUserList(m,1,new Users());
        }else {
            return this.showUserList(m,1,new Users());
        }
    }

    @RequestMapping("/romoveSession")
    public  String romoveSession(HttpSession session,HttpServletRequest request){
        Users u= (Users) session.getAttribute("user");
        rizhiBiz.addrizhi(u.getName(),"注销用户");
       session.removeAttribute("user");
       session.getAttribute("user");
       return "login";
    }

    @RequestMapping("/showpass")
    public String showpass(){
        return "mima";
    }

    @RequestMapping("/selectpass")
    public String selectpass( @RequestParam("uid") String uid,Model m) {
        UsersMimao usersMimao=usersMimaoBiz.selectMb(uid);
        if (usersMimao!=null){
            m.addAttribute("mimao",usersMimao);
                return "mima1";
        }else {
              return "mima";
        }
    }

    @RequestMapping("/rpassword")
    public String rpassword(Model m,@RequestParam("wenti") int wenti,@RequestParam("daan") String daan,@RequestParam("uid") String uid) {
      UsersMimao usersMimao=new UsersMimao();
      if (wenti==1){
          usersMimao.setDaAn_one(daan);
      }else if (wenti==2){
          usersMimao.setDaAn_two(daan);
      }else if (wenti==3){
          usersMimao.setDaAn_there(daan);
      }
    usersMimao.setUserId(uid);
    if (usersMimaoBiz.selectlist(usersMimao)!=null){
        m.addAttribute("um",usersMimao);
        return "mima2";
    }else {
        return "mima1";
    }
    }

    @RequestMapping("/spassword")
    public String spassword(Users users){
        if (users.getPassword()==""){return "mima2";}else {
            MD5 md5 = new MD5();
            String password = md5.toMD5(users.getPassword());
            users.setPassword(password);
            if (usersBiz.updatePassword(users)) {
                rizhiBiz.addrizhi(users.getName(),"找回了密码");
                return "login";
            } else {
                return "mima2";
            }
        }
    }

    @RequestMapping("/showRizhi")
    public String showRizhi(Model m,@RequestParam(required = false,defaultValue = "1") int pageNo){
        if (pageNo<=0){
            pageNo=1;
        }
        Pager<Rizhi> pagerizhi= rizhiBiz.selectRizhi(pageNo,5);
        m.addAttribute("pagerizhi",pagerizhi);
        return "rizhiList";
    }
}
