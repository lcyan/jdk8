package com.molloc.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.google.common.collect.Lists;

/**
 * @author yanleichang
 * @date 2018/1/21
 */
public class OptionalTest2 extends AbstractTest {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("zhangshan");

        Employee employee2 = new Employee();
        employee2.setName("lisi");

        Company company = new Company();
        company.setName("company1");

        List<Employee> employees = Lists.newArrayList(employee, employee2);
        company.setEmployees(employees);

        Optional<Company> optional = Optional.of(company);
        System.out.println(optional.map(Company::getEmployees).orElseGet(ArrayList::new));
    }

}
