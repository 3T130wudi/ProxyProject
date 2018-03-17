package biz.impl;

import biz.CustomerBiz;
import dao.CustomerDao;
import entity.Customer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Currency;
import java.util.List;
@Service
public class CustomerBizImpl implements CustomerBiz {
    @Resource
    private CustomerDao customerDao;

    public List<Customer> selectcurrency() {
        return customerDao.selectcurrency();
    }

    public boolean insertcurrrency(Customer customer) {
        return customerDao.insertcurrrency(customer)>0;
    }

    public List<Customer> currencyselect(Customer customer) {
        return customerDao.currencyselect(customer);

    }
}
