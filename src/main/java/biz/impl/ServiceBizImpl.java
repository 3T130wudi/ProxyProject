package biz.impl;

import biz.ServiceBiz;
import dao.ServiceDao;
import entity.Service;

import javax.annotation.Resource;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceBizImpl implements ServiceBiz{
    @Resource
    private ServiceDao serviceDao;

    public List<Service> selectService() {
        return serviceDao.selectService();
    }

    public boolean insertselect(Service service) {
        return serviceDao.insertselect(service)>0;
    }

    public Service serviceselect(Service service) {
        return serviceDao.serviceselect(service);
    }

    public List<Service> selectname(Service service) {
        return serviceDao.selectname(service);
    }

    public boolean updateservice(Service service) {
        return serviceDao.updateservice(service)>0;
    }


}
