package biz;

import entity.AuthorityList;
import org.apache.ibatis.annotations.Param;

public interface AuthoritylistBiz {
    AuthorityList selectList(int id);
    boolean updateList(AuthorityList authorityList);
}
