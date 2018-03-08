package biz.impl;

import biz.CapitalSourceBiz;
import dao.CapitalSourceDao;
import entity.CapitalSource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CapitalSourceBizImpl implements CapitalSourceBiz {
    @Resource
    private CapitalSourceDao capitalSourceDao;
    public List<CapitalSource> selectCapitalSourceList() {
        return capitalSourceDao.selectCapitalSourceList();
    }
}
