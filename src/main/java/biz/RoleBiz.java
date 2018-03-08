package biz;

import entity.Role;

import java.util.List;

public interface RoleBiz {
    List<Role> selectList();

    boolean addRole(Role role);
    boolean updateRole(Role role);
    boolean deleteRole(Role role);
}
