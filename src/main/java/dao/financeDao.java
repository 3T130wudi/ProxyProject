package dao;

import entity.finance;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface financeDao {
    int insertfinance(finance finance);

    List<finance> financeselect();

    List<finance> insertjuct(finance finance);

    int updatafinance(finance finance);
    finance fanceselect(finance finance);

    finance selectfnance(int id);


    int deletefinance(@Param("financeId")int financeId);


}
