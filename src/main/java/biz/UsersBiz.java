package biz;

import entity.Users;

import java.util.List;

public interface UsersBiz {
    Users login(Users users);
    Users selectList();
    List<Users> selectUser(Users users);
}
