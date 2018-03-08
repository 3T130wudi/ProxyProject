package dao;

import entity.Users;

public interface UsersDao {
    Users login(Users users);
    Users selectList();
}
