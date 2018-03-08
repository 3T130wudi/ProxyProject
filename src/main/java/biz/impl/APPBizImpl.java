package biz.impl;

import biz.APPBiz;
import dao.APPDao;
import entity.APP;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class APPBizImpl implements APPBiz {
    @Resource
    private APPDao appDao;
    public APP selectAPP(String name) {
        return appDao.selectAPP(name);
    }
}
