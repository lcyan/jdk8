package com.molloc.jdk8.defaultmethod;

/**
 * @author yanleichang
 * @date 2018/1/21
 * 实现类的优先级高于接口的优先级
 */
public class MyClass2 extends MyInterface1Impl implements MyInterface2 {

    public static void main(String[] args) {
        MyClass2 myClass2 = new MyClass2();
        myClass2.myMethod();
    }
}
