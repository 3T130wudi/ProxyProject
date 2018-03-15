package biz.impl;

import biz.CustomerBiz;
import dao.CustomerDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Currency;
import java.util.List;
@Service
public class CustomerBizImpl implements CustomerBiz {
    @Resource
    private CustomerDao customerDao;

    public List<Currency> selectcurrency() {
        return customerDao.selectcurrency();
    }
}
