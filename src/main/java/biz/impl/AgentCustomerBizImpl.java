package biz.impl;

import biz.AgentCustomerBiz;
import dao.AgentCustomerDao;
import entity.AgentCustomer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AgentCustomerBizImpl implements AgentCustomerBiz{
    @Resource
    private AgentCustomerDao agentCustomerDao;
    public int AgentCustomerInsert(AgentCustomer agentCustomer) {
        return agentCustomerDao.AgentCustomerInsert(agentCustomer);
    }
}
