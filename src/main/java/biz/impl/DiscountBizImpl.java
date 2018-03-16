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
}
