package com.example.dbdemo;

import com.example.dbdemo.entity.User;
import com.example.dbdemo.mapper.UserMapper;
import com.example.dbdemo.service.DBService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class DbDemoApplicationTests {

    @Autowired
    private DBService dbService;

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        log.info("info: {}", dbService.info());
    }

    @Test
    public void testQuery() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

}
