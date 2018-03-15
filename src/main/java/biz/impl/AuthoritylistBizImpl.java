package biz.impl;

import biz.AuthoritylistBiz;
import dao.AuthoritylistDao;
import entity.AuthorityList;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("authoritylistBiz")
public class AuthoritylistBizImpl implements AuthoritylistBiz {

    @Resource
    private AuthoritylistDao authoritylistDao;

    public AuthorityList selectList(int id) {
        return authoritylistDao.selectList(id);
    }

    public boolean updateList(AuthorityList authorityList) {
        return authoritylistDao.updateList(authorityList)>0;
    }
}
