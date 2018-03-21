package biz.impl;

import biz.RizhiBiz;
import dao.RizhiDao;
import dao.RoleDao;
import entity.Pager;
import entity.Rizhi;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("rizhiBiz")
public class RizhiBizImpl implements RizhiBiz {

    @Resource
    private RizhiDao rizhiDao;

    public Pager<Rizhi> selectRizhi(int offset, int pageSize) {
        Pager<Rizhi> pager = new Pager<Rizhi>();
        pager.setPageNo(offset);
        pager.setPageSize(pageSize);
        pager.setTotalRows(rizhiDao.queryRoleCount());
        pager.setTotalPage((pager.getTotalRows()+pageSize-1)/pageSize);
        pager.setDatas(rizhiDao.selectRizhi((offset-1)*pageSize,pageSize));
        return pager;
    }

    public boolean addrizhi(String username,String shuomin) {
        return rizhiDao.addrizhi(username,shuomin)>0;
    }
}
