package biz;

import entity.finance;

import java.util.List;

public interface financeBiz {


    int insertfinance(finance finance);
    List<finance> financeselect();

    boolean updatafinance(finance finance);

    boolean deletefinance(int financeId);
    finance selectfnance(int id);



}
