package biz;

import entity.Pager;
import entity.finance;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface financeBiz {


    int insertfinance(finance finance);
    List<finance> financeselect();

    int updatafinance(finance finance);

    finance fanceselect(finance finance);
    List<finance> insertjuct(finance finance);

    boolean deletefinance(int financeId);
    finance selectfnance(int id);

    Pager<finance> queryfinance(int pageNo, int pageSize);






}
