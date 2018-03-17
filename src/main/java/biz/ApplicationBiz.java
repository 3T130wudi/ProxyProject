package biz;

import entity.Application;

import java.util.List;

public interface ApplicationBiz {

    Application selectapplication(Application application);
    boolean updateappcation(Application application);


}
