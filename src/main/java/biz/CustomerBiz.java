package biz;

import entity.Customer;
import entity.Pager;
import org.apache.ibatis.annotations.Param;

import java.util.Currency;
import java.util.List;

public interface CustomerBiz {

    Pager<Customer> selectcurrency(int pageNo, int pageSize);
    boolean insertcurrrency(Customer customer);
    List<Customer> currencyselect(Customer customer);
    boolean deletecustomer(int customer_id);
    Customer customerselect(Customer customer);
    boolean updatecustomer(Customer customer);

}
