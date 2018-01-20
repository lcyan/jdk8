package com.molloc.jdk8;

/**
 * @author yanleichang
 * <p>
 * 理解FunctionalInterface文档中下面的这段话
 * <p>
 * If an interface declares an abstract method overriding one of the public methods of {@code java.lang.Object}, that
 * also does <em>not</em> count toward the interface's abstract method count since any implementation of the
 * interface will have an implementation from {@code java.lang.Object} or elsewhere.
 */
@FunctionalInterface
public interface MyInterface {
    void test();

    String toString();
}
