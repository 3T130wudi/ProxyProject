package biz.impl;

import biz.DiscountBiz;
import dao.DiscountDao;
import entity.Discount;
import entity.Pager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiscountBizImpl implements DiscountBiz{
    @Resource
    private DiscountDao discountDao;
    public Pager<Discount> selectDiscount(int pageNo, int pageSize) {
        Pager<Discount> pager=new Pager<Discount>();
        pager.setPageNo(pageNo);
        pager.setPageSize(pageSize);
        pager.setTotalRows(discountDao.countdiscountcurre());
        pager.setTotalPage((pager.getTotalRows()+pageSize-1)/pageSize);
        pager.setDatas(discountDao.selectDiscount((pageNo-1)*pageSize,pageSize));
        return pager;


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
