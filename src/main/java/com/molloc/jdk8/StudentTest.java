package com.molloc.jdk8;

import java.util.function.Supplier;

/**
 * @author yanleichang
 * @date 2018/1/21
 */
public class StudentTest extends AbstractTest {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = Student::new;
        System.out.println(studentSupplier.get());
        printLine();
    }
}
