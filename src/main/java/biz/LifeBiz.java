package biz;

import entity.Life;

import java.util.List;

public interface LifeBiz {

    Life selectlife(Life life);

    boolean updatelife(Life life);

}
