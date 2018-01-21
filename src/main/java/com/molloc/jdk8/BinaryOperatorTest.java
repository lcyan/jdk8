package com.molloc.jdk8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author yanleichang
 * @date 2018/1/21
 */
public class BinaryOperatorTest extends AbstractTest {

    public static void main(String[] args) {
        BinaryOperatorTest test = new BinaryOperatorTest();
        System.out.println(test.compute(2, 3, (a, b) -> a + b));
        printLine();

        System.out.println(test.compute(2, 3, (a, b) -> a - b));
        printLine();

        System.out.println(test.minBy("xiaobai", "xiaohei", String::compareTo));
    }

    private Integer compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    private String minBy(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }
}
