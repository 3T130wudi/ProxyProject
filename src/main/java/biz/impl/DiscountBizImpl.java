package biz.impl;

import biz.DiscountBiz;
import dao.DiscountDao;
import entity.Discount;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiscountBizImpl implements DiscountBiz{
    @Resource
    private DiscountDao discountDao;
    public List<Discount> selectDiscount() {
        return discountDao.selectDiscount();


    }

    public List<Discount> discountselect(Discount discount) {
        return discountDao.discountselect(discount);
    }

    public Discount soutselect(Discount discount) {
        return discountDao.soutselect(discount);
    }

    public boolean insertdicount(Discount discount) {
        return discountDao.insertdicount(discount)>0;
    }

    public boolean updatedisount(Discount discount) {
        return discountDao.updatedisount(discount)>0;
    }

    public boolean deletedisount(int discount_id) {
        return discountDao.deletedisount(discount_id)>0;
    }
}
