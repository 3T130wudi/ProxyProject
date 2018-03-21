package biz;

import entity.Enterprise;
import entity.Pager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EnterpriseBiz {
    int insertEnterprise(Enterprise enterprise);
    Enterprise selectEnterprise(String name);
    int updateEnterprise(Enterprise enterprise);


    Pager<Enterprise> EnterpriseList(String name, int offset, int pageSize);


}
