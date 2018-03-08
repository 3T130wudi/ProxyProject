package biz.impl;

import biz.RoleBiz;
import dao.RoleDao;
import entity.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("roleBiz")
public class RoleBizImpl implements RoleBiz {

    @Resource
    private RoleDao roleDao;
    public List<Role> selectList() {
        return roleDao.selectList();
    }


    public boolean addRole(Role role) {
        return roleDao.addRole(role)>0;
    }

    public boolean updateRole(Role role) {
        return roleDao.updateRole(role)>0;
    }

    public boolean deleteRole(Role role) {
        return roleDao.deleteRole(role)>0;
    }
}
