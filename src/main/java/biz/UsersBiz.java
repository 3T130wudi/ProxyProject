package biz;

import entity.Users;

public interface UsersBiz {
    Users login(Users users);
    Users selectList();
}
