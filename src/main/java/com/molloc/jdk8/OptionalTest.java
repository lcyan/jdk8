package com.molloc.jdk8;

import java.util.Date;
import java.util.Optional;

/**
 * @author yanleichang
 * @date 2018/1/21
 */
public class OptionalTest extends AbstractTest {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");

        //不推荐使用的方式
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
        printLine();
        //推荐使用的方式
        optional.ifPresent(System.out::println);
        printLine();
        System.out.println(Optional.empty().orElse("world"));
        printLine();
        System.out.println(Optional.empty().orElseGet(Date::new));
    }
}
