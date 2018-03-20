package dao;

import entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersDao {
    Users login(Users users);
    Users selectList();
    List<Users> selectUser(@Param("name") String name,@Param("roleId") int roleId,@Param("type") String type,
                           @Param("offset") int offset, @Param("pageSize")int pageSize);
    int addUser(Users users);
    int deleteUser(Users users);
    int updateUser(Users users);
    Users selectOne(Users users);

    /**
     * 查询总行数
     * @return
     */
    int queryRoleCount();
}
