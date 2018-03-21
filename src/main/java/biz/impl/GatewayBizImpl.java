package biz.impl;

import biz.GatewayBiz;
import dao.GatewayDao;
import entity.AgentCustomer;
import entity.Gateway;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GatewayBizImpl implements GatewayBiz {
    @Resource
    private GatewayDao gatewayDao;
    public List<AgentCustomer> AgentCustomerList(String name) {
        return gatewayDao.AgentCustomerList(name);
    }

    public AgentCustomer AgentCustomerById(int id) {
        return gatewayDao.AgentCustomerById(id);
    }

    public int GatewayInsert(Gateway gateway) {
        return gatewayDao.GatewayInsert(gateway);
    }



    public Gateway GatewaySelect(String phone) {
        return gatewayDao.GatewaySelect(phone);
    }

    public int updateGateway(Gateway gateway) {
        return gatewayDao.updateGateway(gateway);
    }

    public int updateGatewayGateway_remarks(Gateway gateway) {
        return gatewayDao.updateGatewayGateway_remarks(gateway);
    }
}
