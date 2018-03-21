package dao;

import entity.Rizhi;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RizhiDao {
    List<Rizhi> selectRizhi(@Param("offset") int offset, @Param("pageSize")int pageSize);
    /**
     * 查询总行数
     * @return
     */
    int queryRoleCount();
    int addrizhi(@Param("username") String username, @Param("shuomin")String shuomin);
}
