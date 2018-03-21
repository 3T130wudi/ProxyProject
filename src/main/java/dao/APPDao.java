package dao;

import entity.APP;
import org.apache.ibatis.annotations.Param;

public interface APPDao {
    APP selectAPP(@Param("name") String name);
}
