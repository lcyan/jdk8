package com.molloc.jdk8;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author yanleichang
 * @date 2018/1/20
 * 理解 Function#compose, Function#andThen
 */
public class FunctionTest2 extends Test {

    public static void main(String[] args) {
        FunctionTest2 test = new FunctionTest2();
        System.out.println(test.compute(2, value -> value * 3, value -> value * value));
        System.out.println(test.compute2(2, value -> value * 3, value -> value * value));
        printLine();

        System.out.println(test.compute3(1, 2, (a, b) -> a + b));
        System.out.println(test.compute3(1, 2, (a, b) -> a - b));
        System.out.println(test.compute3(1, 2, (a, b) -> a * b));
        System.out.println(test.compute3(1, 2, (a, b) -> a / b));
        printLine();

        //BiFunction#andThen
        System.out.println(test.compute4(1, 2, (a, b) -> a + b, value -> value * value));
    }

    private int compute(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    private int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(a);
    }

    private int compute3(int a, int b, BiFunction<Integer, Integer, Integer> function) {
        return function.apply(a, b);
    }

    private int compute4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer>
            function) {
        return biFunction.andThen(function).apply(a, b);
    }
}
