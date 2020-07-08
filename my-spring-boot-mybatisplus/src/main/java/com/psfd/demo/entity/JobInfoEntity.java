package com.psfd.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("job")//@TableName中的值对应表名
public class JobInfoEntity {
    @TableId(type = IdType.AUTO)
    private Integer Id;
    private String jobName;
    private String sex;
    private Integer age;
    private String job;//应聘人员职位
    private String specialty;//所学专业
    private String experience;//工作经历
    private String studyeffort;//学历
    private String school;//毕业学校
    private String tel;//电话号码
    private String email;//Email地址
    private String createtime;//创建时间
    private String content;//详细经历
    private String isstock;//是否入库

}
