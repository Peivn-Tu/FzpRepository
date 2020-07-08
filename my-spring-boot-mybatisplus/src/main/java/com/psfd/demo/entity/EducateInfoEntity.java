package com.psfd.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("educate")//@TableName中的值对应表名
public class EducateInfoEntity {
    @TableId(type = IdType.AUTO)
    private Integer Id;
    private String edName;
    private String purpose;//培训目的
    private String begintime;//培训开始时间
    private String endtime;//结束时间
    private String datum;//培训材料
    private String teacher;//培训讲师
    private String student;//学生
    private String createtime;//创建时间
    private String educate;//培训是否完成
    private String effect;//培训效果
    private String summarize;//培训总结



}
