package dao;

import entity.FinancialStatements;
import org.apache.ibatis.annotations.Param;

import java.sql.Driver;

import java.util.List;

public interface FinancialStatementsDao {
    List<FinancialStatements> selectFinancialStatementsList(@Param("approach_id") Integer approach_id, @Param("apply_date") String apply_date,@Param("pass_date") String pass_date);
}
