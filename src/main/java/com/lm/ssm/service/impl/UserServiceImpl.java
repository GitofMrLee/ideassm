package com.lm.ssm.service.impl;

import com.lm.ssm.dao.UserDao;
import com.lm.ssm.entity.User;
import com.lm.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liming
 * @create 2017-08-02 21:07
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public void save(User user) {
        userDao.save(user);
    }
}
