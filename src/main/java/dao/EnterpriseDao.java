package dao;

import entity.Enterprise;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseDao {
    int insertEnterprise(Enterprise enterprise);
    Enterprise selectEnterprise(@Param("name") String name);
    int updateEnterprise(Enterprise enterprise);
}
