package com.lm.ssm.dao;

import java.util.List;

/**
 * 基本接口
 *
 * @author liming
 * @create 2017-08-01 18:37
 */

public interface BaseDao<T> {
    void save(T t);

    void delete(int id);

    void update(T t);

    T findOne(int id);

    List<T> findAll();
}
