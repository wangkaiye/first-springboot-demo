package com.htdata.firstboot.service;

import com.htdata.firstboot.dao.UserMapper;
import com.htdata.firstboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements  UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> getUser(int age) {
        return userMapper.getUser(age);
    }
}
