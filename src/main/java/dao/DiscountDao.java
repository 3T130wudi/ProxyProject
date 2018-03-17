package dao;

import entity.Discount;

import java.util.List;

public interface DiscountDao {
    List<Discount> selectDiscount();
}
