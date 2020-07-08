package com.psfd.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")//@TableName中的值对应表名
public class PopeInfoEntity {
    @TableId(type = IdType.AUTO)
    private Integer Id;//编号
    private String userName;//用户名
    private String password;//密码
    private String sex;//性别
    private String birthday;//出生日期
    private String createtime;//创建时间
    private String isadmin;//是否为管理员
    private String content;//人员简介

}
