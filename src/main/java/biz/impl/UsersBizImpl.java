package biz.impl;

import biz.UsersBiz;
import dao.UsersDao;
import entity.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    public List<Users> selectUser(Users users) {
        return usersDao.selectUser(users);
    }

    public boolean addUser(Users users) {
        return usersDao.addUser(users)>0;
    }

    public boolean deleteUser(Users users) {
        return usersDao.deleteUser(users)>0;
    }

    public boolean updateUser(Users users) {
        return usersDao.updateUser(users)>0;
    }

    public Users selectOne(Users users) {
        return usersDao.selectOne(users);
    }

}
