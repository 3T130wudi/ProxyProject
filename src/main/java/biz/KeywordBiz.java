package biz;

import entity.keyword;

import java.util.List;

public interface KeywordBiz {
    int insertKeyword(keyword keyword);
    List<keyword> keywordList(String name);
}
