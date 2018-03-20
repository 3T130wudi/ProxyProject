package biz.impl;

import biz.UsersBiz;
import dao.UsersDao;
import entity.Pager;
import entity.Users;
import org.apache.ibatis.annotations.Param;
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

    public Pager<Users> selectUser(@Param("name") String name, @Param("roleId") int roleId, @Param("type") String type, int pageSize, int offset) {
        Pager<Users> pager = new Pager<Users>();
        pager.setPageNo(offset);
        pager.setPageSize(pageSize);
        pager.setTotalRows(usersDao.queryRoleCount());
        pager.setTotalPage((pager.getTotalRows()+pageSize-1)/pageSize);
        pager.setDatas(usersDao.selectUser(name,roleId,type,(offset-1)*pageSize,pageSize));
        return pager;
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
