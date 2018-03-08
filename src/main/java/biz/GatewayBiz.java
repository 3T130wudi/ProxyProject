package biz;

import entity.AgentCustomer;
import entity.Gateway;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GatewayBiz {
    List<AgentCustomer> AgentCustomerList(String name);
    AgentCustomer AgentCustomerById(int id);
    int GatewayInsert(Gateway gateway);
    Gateway GatewaySelect(String phone);
    int updateGateway(Gateway gateway);
}
