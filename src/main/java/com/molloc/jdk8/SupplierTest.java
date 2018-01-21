package com.molloc.jdk8;

import java.util.function.Supplier;

/**
 * @author yanleichang
 * @date 2018/1/21
 */
public class SupplierTest extends AbstractTest{

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello world";
        System.out.println(supplier.get());
    }
}
