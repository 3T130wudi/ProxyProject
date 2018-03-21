package biz.impl;

import biz.UsersMimaoBiz;
import dao.UsersMimaoDao;
import entity.UsersMimao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("usersMimaoBiz")
public class UsersMimaoBizImpl implements UsersMimaoBiz {

    @Resource
    private UsersMimaoDao usersMimaoDao;
    public UsersMimao selectMb(String userId) {
        return usersMimaoDao.selectMb(userId);
    }

    public UsersMimao selectlist(UsersMimao usersMimao) {
        return usersMimaoDao.selectlist(usersMimao);
    }
}
