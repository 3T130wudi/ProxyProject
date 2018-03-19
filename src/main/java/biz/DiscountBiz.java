package biz;

import entity.Discount;

import java.util.List;

public interface DiscountBiz {
    List<Discount> selectDiscount();

    List<Discount> discountselect(Discount discount);

    Discount soutselect(Discount discount);

    boolean insertdicount(Discount discount);

    boolean updatedisount(Discount discount);

    boolean deletedisount(int discount_id);
}
