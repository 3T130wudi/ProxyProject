package biz.impl;

import biz.ApplicationBiz;
import dao.ApplicationDao;
import entity.Application;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ApplicationDaoImpl implements ApplicationBiz {

    @Resource
    private ApplicationDao applicationDao;
    public Application selectapplication(Application application) {

        return applicationDao.selectapplication(application);
    }
}
