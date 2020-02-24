package com.htdata.firstboot.service;

import com.htdata.firstboot.pojo.User;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

public interface UserService {
    public List<User> getUser(int age);
}
