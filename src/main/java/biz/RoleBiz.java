package biz;

import entity.Pager;
import entity.Role;

import java.util.List;

public interface RoleBiz {
    Pager<Role> queryProjectinfos(int offset, int pageSize);
    List<Role> selectList();
    boolean addRole(Role role);
    boolean updateRole(Role role);
    boolean deleteRole(Role role);
}
