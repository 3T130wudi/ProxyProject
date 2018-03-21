package dao;

import entity.Service;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServiceDao {


    /**
     * 查询当前页数据
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Service> selectService(@Param("pageNo") int pageNo, @Param("pageSize")int pageSize);

    /**
     * 查询总行数
     * @return
     */
    int queryServiceCount();


    int insertselect(Service service);

    int updateservice(Service service);
    Service serviceselect(Service service);

    List<Service> selectname(Service service);

}
