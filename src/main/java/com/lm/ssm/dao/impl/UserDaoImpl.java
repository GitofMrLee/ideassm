package com.lm.ssm.dao.impl;

import com.lm.ssm.dao.UserDao;
import com.lm.ssm.entity.User;
import com.lm.ssm.mapper.UserMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author liming
 * @create 2017-08-02 21:06
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;


    public void save(User user) {
        UserMapper mapper =sqlSessionTemplate.getMapper(UserMapper.class);
        mapper.save(user);
    }
}
