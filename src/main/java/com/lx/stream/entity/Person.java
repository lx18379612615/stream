package com.lx.stream.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lengxu32110
 * @date 2021/9/11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    // 姓名
    private String name;
    // 薪资
    private int salary;
    // 年龄
    private int age;
    //性别
    private String sex;
    // 地区
    private String area;

}
