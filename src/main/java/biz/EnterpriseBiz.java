package biz;

import entity.Enterprise;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EnterpriseBiz {
    int insertEnterprise(Enterprise enterprise);
    Enterprise selectEnterprise(String name);
    int updateEnterprise(Enterprise enterprise);
    List<Enterprise> EnterpriseList(@Param("name") String name);


}
