package com.htdata.firstboot.dao;

import com.htdata.firstboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USER WHERE AGE=#{age}")
    public List<User> getUser(int age);
}
