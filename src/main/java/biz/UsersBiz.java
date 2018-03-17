package biz;

import entity.Users;

import java.util.List;

public interface UsersBiz {
    Users login(Users users);
    Users selectList();
    List<Users> selectUser(Users users);
    boolean addUser(Users users);
    boolean deleteUser(Users users);
    boolean updateUser(Users users);
    Users selectOne(Users users);
}
