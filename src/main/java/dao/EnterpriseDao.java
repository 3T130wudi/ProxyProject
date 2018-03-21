package dao;

import entity.Enterprise;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EnterpriseDao {
    int insertEnterprise(Enterprise enterprise);
    Enterprise selectEnterprise(@Param("name") String name);
    int updateEnterprise(Enterprise enterprise);
    List<Enterprise> EnterpriseList(@Param("name") String name);
}//
