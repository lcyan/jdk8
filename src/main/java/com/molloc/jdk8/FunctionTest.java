package com.molloc.jdk8;

import java.util.function.Function;

/**
 * @author yanleichang
 * 理解 lambda表达式传递的是一种行为
 */
public class FunctionTest extends Test {

    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
        System.out.println(test.compute(1, value -> 2 * value));//传递的是行为
        printLine();

        System.out.println(test.compute(2, value -> 5 + value));
        printLine();

        System.out.println(test.compute(3, value -> value * value));
        printLine();

        System.out.println(test.convert(5, value -> String.valueOf(value + " hello world!")));
        printLine();

        Function<Integer, Integer> function = value -> value * 2;
        System.out.println(test.compute(4, function));
    }

    private int compute(int a, Function<Integer, Integer> function) {
        return function.apply(a);
    }

    private String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }
}
