package com.molloc.jdk8.defaultmethod;

/**
 * @author yanleichang
 * @date 2018/1/21
 */
public class MyClass implements MyInterface1, MyInterface2 {

    @Override
    public void myMethod() {
        MyInterface2.super.myMethod();
        System.out.println("MyClass");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }
}
