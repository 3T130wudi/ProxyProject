package biz;

import entity.Enterprise;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseBiz {
    int insertEnterprise(Enterprise enterprise);
    Enterprise selectEnterprise(String name);
    int updateEnterprise(Enterprise enterprise);
}
