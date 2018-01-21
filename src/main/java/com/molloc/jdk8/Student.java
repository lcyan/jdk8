package com.molloc.jdk8;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author yanleichang
 * @date 2018/1/21
 */
public class Student {

    private String name = "zhangshan";
    private int age = 20;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
