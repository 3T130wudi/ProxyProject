package biz;

import entity.Pager;
import entity.Rizhi;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RizhiBiz {
    Pager<Rizhi> selectRizhi(@Param("offset") int offset, @Param("pageSize") int pageSize);
    boolean addrizhi(String username,String shuomin);
}
