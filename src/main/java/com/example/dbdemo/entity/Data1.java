package com.example.dbdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.Data;

@Data
@TableName(value = "data1", autoResultMap = true)
public class Data1 {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String data1;
    @TableField(typeHandler = JacksonTypeHandler.class)
    private User data2;
}