package biz.impl;

import biz.EnterpriseBiz;
import dao.EnterpriseDao;
import entity.Enterprise;
import entity.Pager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    public Pager<Enterprise> EnterpriseList(String name, int offset, int pageSize) {
        Pager<Enterprise> pager = new Pager<Enterprise>();
        pager.setPageNo(offset);
        pager.setPageSize(pageSize);
        pager.setTotalRows(enterpriseDao.queryEnterprise());
        pager.setTotalPage((pager.getTotalRows()+pageSize-1)/pageSize);
        pager.setDatas(enterpriseDao.EnterpriseList(name,(offset-1)*pageSize,pageSize));
        return pager;
    }

}
