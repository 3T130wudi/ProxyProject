package dao;

import entity.UsersMimao;
import org.apache.ibatis.annotations.Param;

public interface UsersMimaoDao {
    UsersMimao selectMb(@Param("userId") String userId);
    UsersMimao selectlist(UsersMimao usersMimao);
}
