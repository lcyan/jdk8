package com.molloc.jdk8;

import java.util.List;
import java.util.function.Function;

import com.google.common.collect.Lists;

/**
 * @author yanleichang
 * lambda表达式到底是什么类型，一定是由上下文信息才能断定的
 */
public class AbstractTest3 extends AbstractTest {

    public static void main(String[] args) {
        TheInterface i1 = () -> {
        };
        System.out.println(i1.getClass().getInterfaces()[0]);

        TheInterface2 i2 = () -> {
        };
        System.out.println(i2.getClass().getInterfaces()[0]);
        printLine();

        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
        printLine();

        List<String> list = Lists.newArrayList("hello", "world", "hello world");
        list.forEach(s -> System.out.println(s.toUpperCase()));
        printLine();

        //1、把转换后的结果放到另一个集合中并打印出来
        List<String> targetList = Lists.newArrayList();
        list.forEach(s -> targetList.add(s.toUpperCase()));
        targetList.forEach(System.out::println);
        printLine();

        //2、把转换后的结果放到另一个集合中并打印出来
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        printLine();

        Function<String, String> function = String::toUpperCase;
        System.out.println(function.getClass().getInterfaces()[0]);

    }
}

@FunctionalInterface
interface TheInterface {
    void myMethod();
}

@FunctionalInterface
interface TheInterface2 {
    void myMethod2();
}