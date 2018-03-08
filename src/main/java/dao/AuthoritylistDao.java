package dao;

import entity.AuthorityList;
import org.apache.ibatis.annotations.Param;

public interface AuthoritylistDao {
    AuthorityList selectList(@Param("roleId") int roleId);
}
