package controller;

import biz.RoleBiz;
import biz.AuthoritylistBiz;
import entity.AuthorityList;
import entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;

@Controller("SystemController")
public class SystemController {
    @Resource(name = "roleBiz")
    private RoleBiz roleBiz;

    @Resource(name = "authoritylistBiz")
    private AuthoritylistBiz authoritylistBiz;

    /**
     * 查询角色方法
     * @param m
     * @return
     */
    @RequestMapping("/selectList")
    public String selectList(Model m){
        m.addAttribute("roleList",roleBiz.selectList());
        return "roleList";
    }

    /**
     * 新增角色方法
     * @param m
     * @param role
     * @return
     */
    @RequestMapping("/addRole")
    public String addRole(Model m, Role role,HttpServletRequest request){
        if (roleBiz.addRole(role)){
            return this.selectList(m);
        }else {
            return this.selectList(m);
        }
    }

    /**
     * 修改角色方法
     * @param m
     * @param role
     * @return
     */
    @RequestMapping("/updateRole")
    public String updateRole(Model m, Role role){
        if (roleBiz.updateRole(role)){
            return this.selectList(m);
        }else {
            return this.selectList(m);
        }
    }

    /**
     * 删除角色方法
     * @param m
     * @param role
     * @return
     */
    @RequestMapping("/deleteRole")
    public String deleteRole(Model m, Role role){
        if (roleBiz.deleteRole(role)){
            return this.selectList(m);
        }else {
            return this.selectList(m);
        }
    }

    /**
     * 跳转权限配置
     * @return
     */
    @RequestMapping("/showSystem")
    public String showSystem(){
        return "/systemList";
    }

    /**
     * 系统管理员权限列表
     * @param m
     * @return
     */
    @RequestMapping("/showRoleone")
    public String showRoleone(Model m){
        m.addAttribute("authorityList",authoritylistBiz.selectList(1));
        return "/role-one";
    }

    /**
     * 代理商权限列表
     * @param m
     * @return
     */
    @RequestMapping("/showRoletwo")
    public String showRoletwo(Model m){
        m.addAttribute("authorityList",authoritylistBiz.selectList(2));
        return "/role-two";
    }

    /**
     * 财务权限列表
     * @param m
     * @return
     */
    @RequestMapping("/showRolethere")
    public String showRolethere(Model m){
        m.addAttribute("authorityList",authoritylistBiz.selectList(3));
        return "/role-there";
    }

    /**
     * 客服权限列表
     * @param m
     * @return
     */
    @RequestMapping("/showRolefour")
    public String showRolefour(Model m){
        m.addAttribute("authorityList",authoritylistBiz.selectList(4));
        return "/role-four";
    }

    /**
     * 市场权限列表
     * @param m
     * @return
     */
    @RequestMapping("/showRolefive")
    public String showRolefive(Model m){
        m.addAttribute("authorityList",authoritylistBiz.selectList(5));
        return "/role-five";
    }

    /**
     * 大区经理权限列表
     * @param m
     * @return
     */
    @RequestMapping("/showRolesix")
    public String showRolesix(Model m){
        m.addAttribute("authorityList",authoritylistBiz.selectList(6));
        return "/role-six";
    }

    /**
     * 渠道经理
     * @param m
     * @return
     */
    @RequestMapping("/showRoleseven")
    public String showRoleseven(Model m){
        m.addAttribute("authorityList",authoritylistBiz.selectList(7));
        return "/role-seven";
    }

    @RequestMapping("/updateAList")
    public String updateAList(AuthorityList authorityList){
        if (authoritylistBiz.updateList(authorityList)){
            return this.showSystem();
        }else {
            return  this.showSystem();
        }
    }
}
