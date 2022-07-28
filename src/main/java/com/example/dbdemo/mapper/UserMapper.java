package com.example.dbdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dbdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}