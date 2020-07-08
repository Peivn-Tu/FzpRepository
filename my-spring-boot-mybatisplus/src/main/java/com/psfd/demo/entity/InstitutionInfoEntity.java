package com.psfd.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("institution")
public class InstitutionInfoEntity {

    private  Integer Id;
    private  String inName;
    private  String reason;//奖惩原因
    private  String explains;//奖惩说明
    private  String createtime;

}
