package dao;

import entity.Application;

import java.util.List;

public interface ApplicationDao {

    Application selectapplication(Application application);

    int updateappcation(Application application);


}
