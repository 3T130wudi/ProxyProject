package biz.impl;

import biz.UsersBiz;
import dao.UsersDao;
import entity.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("usersBiz")
public class UsersBizImpl implements UsersBiz {

    @Resource
    private UsersDao usersDao;

    public Users login(Users users) {
        return usersDao.login(users);
    }

    public Users selectList() {
        return usersDao.selectList();
    }

}
