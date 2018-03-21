package biz;

import entity.Discount;
import entity.Pager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiscountBiz {

    Pager<Discount> selectDiscount(int pageNo, int pageSize);

    List<Discount> discountselect(Discount discount);

    Discount soutselect(Discount discount);

    boolean insertdicount(Discount discount);

    boolean updatedisount(Discount discount);

    boolean deletedisount(int discount_id);
}
