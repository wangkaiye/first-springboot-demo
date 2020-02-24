package com.htdata.firstboot.controller;


import com.htdata.firstboot.pojo.User;
import com.htdata.firstboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class IndexController {
    @Autowired
    UserService userService;
    @GetMapping("/show")
    public List<User> getUser(int age) {
        return userService.getUser(age);
    }

    @GetMapping("/index")
    public Map<String,String> index(){
        Map map=new HashMap<String,String>();
        map.put("敬龙儿","是一个码农");
        map.put("刘德华","是一个歌星");
        map.put("战狼2","是一个爱国片");
        map.put("范冰冰","是个大美女");
        return map;
    }
    }

