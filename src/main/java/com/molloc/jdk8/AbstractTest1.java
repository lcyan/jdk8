package com.molloc.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author yanleichang
 */
public class AbstractTest1 extends AbstractTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        for (int i = 0, j = list.size(); i < j; i++) {
            System.out.println(list.get(i));
        }
        printLine();

        for (Integer i : list) {
            System.out.println(i);
        }
        printLine();

        //方式一
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer input) {
                System.out.println(input);
            }
        });
        printLine();

        //方式二, 通过lambda表达式
        list.forEach(input -> System.out.println(input));
        printLine();

        //方式三， 通过方法引用
        list.forEach(System.out::println);
    }
}
