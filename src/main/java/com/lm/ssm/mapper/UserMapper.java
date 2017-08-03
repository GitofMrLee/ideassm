package com.lm.ssm.mapper;

import com.lm.ssm.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * usermapper
 *
 * @author liming
 * @create 2017-08-01 23:22
 */

public interface UserMapper {
     void save(User user);
     void update(User user);
     void delete(int id);
     List<User> getAllUsers();
     User load(int id);
     User getUserByUsername(String username);
     User getUserByUsernameAndPassword(@Param("username")String username, @Param("pass")String password);
     List<User> getAllUsersByOrder(@Param("where")String where,@Param("order")String order);
     User getUserByMap(Map<String, Object> map);
     Map<String, Object> getUserForMap(int id);
}
