package com.molloc.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * @author yanleichang
 */
public class Test1 extends Test {

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

        list.forEach(item -> System.out.println(item));
    }
}
