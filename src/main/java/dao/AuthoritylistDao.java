package dao;

import entity.AuthorityList;
import org.apache.ibatis.annotations.Param;

public interface AuthoritylistDao {
    AuthorityList selectList(@Param("id") int id);
    int updateList(AuthorityList authorityList);
}
