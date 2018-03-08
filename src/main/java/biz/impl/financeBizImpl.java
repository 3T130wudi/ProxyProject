package biz.impl;

import biz.financeBiz;
import dao.financeDao;
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



    public boolean deletefinance(int financeId) {
        return financeDao.deletefinance(financeId)>0;
    }

    public finance selectfnance(int id) {
        return financeDao.selectfnance(id);
    }


}
