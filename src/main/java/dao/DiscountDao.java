package dao;

import entity.Discount;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiscountDao {

    /**
     * 查询当前页数据
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Discount> selectDiscount(@Param("pageNo") int pageNo, @Param("pageSize")int pageSize);

    /**
     * 查询总行数
     * @return
     */
    int countdiscountcurre();


    List<Discount> discountselect(Discount discount);

    Discount soutselect(Discount discount);

    int insertdicount(Discount discount);

    int updatedisount(Discount discount);

    int deletedisount(int discount_id);
}
