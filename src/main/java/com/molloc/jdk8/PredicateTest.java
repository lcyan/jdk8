package com.molloc.jdk8;

import java.util.function.Predicate;

import org.apache.commons.lang3.StringUtils;

/**
 * @author yanleichang
 * @date 2018/1/20
 */
public class PredicateTest {

    public static void main(String[] args) {
        Predicate<String> predicate = StringUtils::isNotBlank;
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("hello"));
    }
}
