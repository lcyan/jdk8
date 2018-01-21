package com.molloc.jdk8;

import java.util.List;

/**
 * @author yanleichang
 * @date 2018/1/21
 */
public class Company {

    private String name;

    private List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
