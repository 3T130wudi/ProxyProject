package biz;

import entity.FinancialStatements;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface FinancialStatementsBiz {
    List<FinancialStatements> selectFinancialStatementsList(Integer approach_id,String apply_date,String pass_date);
}
