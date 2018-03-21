package dao;

import entity.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerDao {

    /**
     * 查询当前页数据
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Customer> selectcurrency(@Param("pageNo") int pageNo, @Param("pageSize")int pageSize);

    /**
     * 查询总行数
     * @return
     */
    int countselectcurre();

    int insertcurrrency(Customer customer);


    int deletecustomer(int customer_id);

    Customer customerselect(Customer customer);

    int updatecustomer(Customer customer);

    List<Customer> currencyselect(Customer customer);

}
