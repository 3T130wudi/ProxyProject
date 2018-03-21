package dao;

import entity.Enterprise;
import entity.Pager;
import entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EnterpriseDao {
    int insertEnterprise(Enterprise enterprise);
    Enterprise selectEnterprise(@Param("name") String name);
    int updateEnterprise(Enterprise enterprise);
    List<Enterprise> EnterpriseList(@Param("name") String name, @Param("offset") int offset, @Param("pageSize")int pageSize);

    /**
     * 查询总行数
     * @return
     */
    int queryEnterprise();

}
