package biz;

import entity.Customer;

import java.util.Currency;
import java.util.List;

public interface CustomerBiz {

    List<Customer> selectcurrency();
    boolean insertcurrrency(Customer customer);
    List<Customer> currencyselect(Customer customer);
    boolean deletecustomer(int customer_id);
    Customer customerselect(Customer customer);
    boolean updatecustomer(Customer customer);

}
