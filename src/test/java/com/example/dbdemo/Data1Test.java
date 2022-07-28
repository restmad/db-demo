package com.example.dbdemo;

import com.alibaba.fastjson.JSON;
import com.example.dbdemo.entity.Data1;
import com.example.dbdemo.entity.User;
import com.example.dbdemo.mapper.Data1Mapper;
import com.example.dbdemo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
public class Data1Test {
    @Resource
    private Data1Mapper data1Mapper;

    @Resource
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        for (int i = 0; i < 10; i++) {
            Data1 data = new Data1();
            data1Mapper.insert(data);
        }
    }

    @Test
    public void testInsertSingle() {
        User user = userMapper.selectById(1L);
        User user2 = userMapper.selectById(2L);
        Data1 data = new Data1();
        data.setData1(JSON.toJSONString(user));
        data.setData2(user2);
        data1Mapper.insert(data);
    }

    @Test
    public void testQuery() {
        Data1 data1 = data1Mapper.selectById(1552695535981400065L);
        log.info("data1: {}", data1);
    }
}
