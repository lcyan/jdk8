package com.molloc.jdk8.defaultmethod;

/**
 * @author yanleichang
 * @date 2018/1/21
 */
public interface MyInterface1 {
    default void myMethod() {
        System.out.println("MyInterface1");
    }
}
