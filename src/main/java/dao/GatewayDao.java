package dao;

import entity.AgentCustomer;
import entity.Gateway;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GatewayDao {
    List<AgentCustomer> AgentCustomerList(@Param("name") String name);
    AgentCustomer AgentCustomerById(@Param("id") int id);
    int GatewayInsert(Gateway gateway);
    Gateway GatewaySelect(@Param("phone") String phone);
    int updateGateway(Gateway gateway);
    int updateGatewayGateway_remarks(Gateway gateway);
}
