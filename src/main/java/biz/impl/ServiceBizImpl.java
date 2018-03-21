package biz.impl;

import biz.ServiceBiz;
import dao.ServiceDao;
import entity.Pager;
import entity.Service;

import javax.annotation.Resource;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceBizImpl implements ServiceBiz{
    @Resource
    private ServiceDao serviceDao;

    public Pager<Service> selectService(int pageNo, int pageSize) {
        Pager<Service> pager=new Pager<Service>();
        pager.setPageNo(pageNo);
        pager.setPageSize(pageSize);
        pager.setTotalRows(serviceDao.queryServiceCount());
        pager.setTotalPage(((pager.getTotalRows())+pageSize-1)/pageSize);
        pager.setDatas(serviceDao.selectService((pageNo-1)*pageSize,pageSize));
        return pager;
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
