package biz.impl;

import biz.EnterpriseBiz;
import dao.EnterpriseDao;
import entity.Enterprise;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EnterpriseBizImpl implements EnterpriseBiz {
    @Resource
    private EnterpriseDao enterpriseDao;
    public int insertEnterprise(Enterprise enterprise) {
        return enterpriseDao.insertEnterprise(enterprise);
    }

    public Enterprise selectEnterprise(String name) {
        return enterpriseDao.selectEnterprise(name);
    }

    public int updateEnterprise(Enterprise enterprise) {
        return enterpriseDao.updateEnterprise(enterprise);
    }
}
