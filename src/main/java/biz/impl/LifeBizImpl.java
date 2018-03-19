package biz.impl;

import biz.LifeBiz;
import dao.LifeDao;
import entity.Life;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LifeBizImpl implements LifeBiz {

    @Resource
    private LifeDao lifeDao;
    public Life selectlife(Life life) {
        return lifeDao.selectlife(life);

    }

    public boolean updatelife(Life life) {
        return lifeDao.updatelife(life)>0;

    }
}

