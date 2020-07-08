package com.psfd.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("stipend")
public class StipendInfoEntity {
    @TableId(type = IdType.AUTO)
    private Integer Id;
    private String spName;
    private String basic;//基本薪金
    private Float eat;//饭补
    private Float house;//房补
    private String granttime;//工资发放时间
    private Float scot;//全勤奖
    private Float duty;//赋税
    private Float punishment;//罚款
    private Float other;//额外补助
    private Float totalize;//总计薪金

}
