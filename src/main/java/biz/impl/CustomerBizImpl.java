package biz.impl;

import biz.CustomerBiz;
import dao.CustomerDao;
import entity.Customer;
import entity.Pager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Currency;
import java.util.List;
@Service
public class CustomerBizImpl implements CustomerBiz{
    @Resource
    private CustomerDao customerDao;

    public Pager<Customer> selectcurrency(int pageNo, int pageSize) {
        Pager<Customer> pager=new Pager<Customer>();
        pager.setPageNo(pageNo);
        pager.setPageSize(pageSize);
        pager.setTotalRows(customerDao.countselectcurre());
         pager.setTotalPage((pager.getTotalRows()+pageSize-1)/pageSize);
        pager.setDatas(customerDao.selectcurrency((pageNo-1)*pageSize,pageSize));
        return pager;
    }

    public boolean insertcurrrency(Customer customer) {
        return customerDao.insertcurrrency(customer)>0;
    }

    public List<Customer> currencyselect(Customer customer) {
        return customerDao.currencyselect(customer);

    }

    public boolean deletecustomer(int customer_id) {
        return customerDao.deletecustomer(customer_id)>0;
    }

    public Customer customerselect(Customer customer) {
        return customerDao.customerselect(customer);
    }

    public boolean updatecustomer(Customer customer) {
        return customerDao.updatecustomer(customer)>0;
    }
}
