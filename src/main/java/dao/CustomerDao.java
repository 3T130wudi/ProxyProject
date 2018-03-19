package dao;

import entity.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> selectcurrency();
    int insertcurrrency(Customer customer);

    int deletecustomer(int customer_id);

    Customer customerselect(Customer customer);

    int updatecustomer(Customer customer);

    List<Customer> currencyselect(Customer customer);

}
