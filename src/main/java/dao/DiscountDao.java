package dao;

import entity.Discount;

import java.util.List;

public interface DiscountDao {
    List<Discount> selectDiscount();

    List<Discount> discountselect(Discount discount);

    Discount soutselect(Discount discount);

    int insertdicount(Discount discount);

    int updatedisount(Discount discount);

    int deletedisount(int discount_id);
}
