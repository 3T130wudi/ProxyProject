package dao;

import entity.keyword;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KeywordDao {
    int insertKeyword(keyword keyword);
    List<keyword> keywordList(@Param("name") String name);
    List<keyword> selectKeyword(@Param("id") int id);
}
