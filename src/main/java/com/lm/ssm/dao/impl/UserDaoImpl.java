package com.lm.ssm.dao.impl;

import com.lm.ssm.dao.UserDao;
import com.lm.ssm.entity.User;
import com.lm.ssm.mapper.UserMapper;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author liming
 * @create 2017-08-02 21:06
 */
@Repository
public class UserDaoImpl implements UserDao {

    private static Logger logger = Logger.getLogger(UserDao.class);
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;


    public void save(User user) {
        logger.info("save the user "+ user.getUsername());
        UserMapper mapper =sqlSessionTemplate.getMapper(UserMapper.class);
        mapper.save(user);
    }
}
