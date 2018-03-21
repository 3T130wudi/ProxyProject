package biz.impl;

import biz.financeBiz;
import dao.financeDao;
import entity.Pager;
import entity.finance;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class financeBizImpl implements financeBiz {
    @Resource
    private financeDao financeDao;

    public int insertfinance(finance finance) {
        return financeDao.insertfinance(finance);
    }

    public List<finance> financeselect() {
        return financeDao.financeselect();
    }

    public int updatafinance(finance finance) {
        return financeDao.updatafinance(finance);
    }

    public finance fanceselect(finance finance) {
        return financeDao.fanceselect(finance);
    }

    public List<finance> insertjuct(finance finance) {
        return financeDao.insertjuct(finance);

    }
//

    public boolean deletefinance(int financeId) {
        return financeDao.deletefinance(financeId)>0;
    }

    public finance selectfnance(int id) {
        return financeDao.selectfnance(id);
    }

    public Pager<finance> queryfinance(int pageNo, int pageSize) {

        Pager<finance> financePager=new Pager<finance>();
        financePager.setPageNo(pageNo);
        financePager.setPageSize(pageSize);
        financePager.setTotalRows(financeDao.queryfinanceCount());
        financePager.setTotalPage((financePager.getTotalRows()+pageSize-1)/pageSize);
        financePager.setDatas(financeDao.queryfinance((pageNo-1)*pageSize,pageSize));

        return financePager;
    }



}
