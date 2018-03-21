package biz;

import entity.UsersMimao;
import org.apache.ibatis.annotations.Param;

public interface UsersMimaoBiz {
    UsersMimao selectMb(@Param("userId") String userId);
    UsersMimao selectlist(UsersMimao usersMimao);
}
