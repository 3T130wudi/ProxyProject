package dao;

import entity.Service;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServiceDao {

    List<Service> selectService();

    int insertselect(Service service);

    int updateservice(Service service);

    Service serviceselect(Service service);

    List<Service> selectname(Service service);

}
