package dao;

import entity.Role;

import java.util.List;

public interface RoleDao {
    List<Role> selectList();

    int addRole(Role role);
    int updateRole(Role role);
    int deleteRole(Role role);
}
