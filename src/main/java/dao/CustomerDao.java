package dao;

import entity.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> selectcurrency();
    int insertcurrrency(Customer customer);

    List<Customer> currencyselect(Customer customer);

}
