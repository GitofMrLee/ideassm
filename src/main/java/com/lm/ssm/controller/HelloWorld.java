package com.lm.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lm.ssm.entity.User;
import com.lm.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * hello world
 *
 * @author liming
 * @create 2017-08-01 18:34
 */
@Controller

public class HelloWorld {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public Object hello(String name, String pass) {
        User user = new User(name, pass);
        JSONObject userjson = (JSONObject) JSON.toJSON(user);
        return userjson;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(String username, String password) {
        User user = new User(username, password);
        userService.save(user);
        return "ok ";
    }
}
