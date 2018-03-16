package biz;

import entity.Service;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServiceBiz {
    //服务类型查询Dao
    List<Service> selectService();
    //服务类型新增
    boolean insertselect(Service service);

    Service serviceselect(Service service);

    List<Service> selectname(Service service);

    boolean updateservice(Service service);
}
