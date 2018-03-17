package dao;

import entity.Users;

import java.util.List;

public interface UsersDao {
    Users login(Users users);
    Users selectList();
    List<Users> selectUser(Users users);
    int addUser(Users users);
    int deleteUser(Users users);
    int updateUser(Users users);
    Users selectOne(Users users);
}
