package biz;

import entity.Pager;
import entity.Service;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServiceBiz {
    //服务类型查询Dao
    Pager<Service> selectService(int pageNo, int pageSize);
    //服务类型新增
    boolean insertselect(Service service);

    Service serviceselect(Service service);

    List<Service> selectname(Service service);
    boolean updateservice(Service service);
}
