package com.hyn.universalexcelexport.entity;

import com.hyn.universalexcelexport.aop.JcExcelName;
import lombok.Data;

/**
 * @author hyn
 * @version 1.0.0
 * @description
 * @date 2023/3/6
 */
@Data
public class Student {
    @JcExcelName(name = "姓名")
    private String name;
    @JcExcelName(name = "年龄")
    private Integer age;
    @JcExcelName(name = "等级")
    private Integer grade;
    @JcExcelName(name = "信息")
    private String msg;
    @JcExcelName(name = "背景")
    private String background;
}
