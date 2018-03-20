package biz;

import entity.Pager;
import entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersBiz {
    Users login(Users users);
    Users selectList();
    Pager<Users> selectUser(@Param("name") String name,@Param("roleId") int roleId,@Param("type") String type
            ,int offset,int pageSize);
    boolean addUser(Users users);
    boolean deleteUser(Users users);
    boolean updateUser(Users users);
    Users selectOne(Users users);
}
