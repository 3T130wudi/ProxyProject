package dao;

import entity.Service;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServiceDao {

    List<Service> selectService();

    int insertselect(Service service);


    List<Service> selectname(Service service);
}
