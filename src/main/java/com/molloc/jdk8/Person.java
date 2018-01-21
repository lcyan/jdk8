package com.molloc.jdk8;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author yanleichang
 * @date 2018/1/20
 */
public class Person {

    private String username;
    private int age;

    public Person() {
    }

    public Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
