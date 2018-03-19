package dao;

import entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDao {

    List<Role> selectList();

    int addRole(Role role);
    int updateRole(Role role);
    int deleteRole(Role role);
    /**
     * 查询当前页数据
     * @param offset
     * @param pageSize
     * @return
     */
    List<Role> queryProjectinfos(@Param("offset") int offset, @Param("pageSize")int pageSize);

    /**
     * 查询总行数
     * @return
     */
    int queryRoleCount();
}
