package dao;

import entity.finance;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface financeDao {
    int insertfinance(finance finance);

    List<finance> financeselect();

    int updatafinance(finance finance);


    finance selectfnance(@Param("id")int id);


    int deletefinance(@Param("financeId")int financeId);


}
