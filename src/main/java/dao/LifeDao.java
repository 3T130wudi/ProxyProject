package dao;

import entity.Life;

import java.util.List;

public interface LifeDao {

   Life selectlife(Life life);

   int updatelife(Life life);


}
