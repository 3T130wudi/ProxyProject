package biz.impl;

import biz.KeywordBiz;
import dao.KeywordDao;
import entity.keyword;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class KeywordBizImpl implements KeywordBiz {
    @Resource
    private KeywordDao keywordDao;

    public int insertKeyword(keyword keyword) {
        return keywordDao.insertKeyword(keyword);
    }

    public List<keyword> keywordList(String name) {
        return keywordDao.keywordList(name);
    }
}
