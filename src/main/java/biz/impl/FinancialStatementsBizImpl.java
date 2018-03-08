package biz.impl;

import biz.FinancialStatementsBiz;
import dao.FinancialStatementsDao;
import entity.FinancialStatements;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class FinancialStatementsBizImpl implements FinancialStatementsBiz {
    @Resource
    private FinancialStatementsDao financialStatementsDao;
    public List<FinancialStatements> selectFinancialStatementsList(Integer approach_id, String apply_date, String pass_date) {
        return financialStatementsDao.selectFinancialStatementsList(approach_id,apply_date,pass_date);
    }
}
