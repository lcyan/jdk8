package com.molloc.jdk8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * @author yanleichang
 */
public class StringComparator extends Test {

    public static void main(String[] args) {
        //对集合中的名字进行倒序排序
        //1、
        List<String> names = Lists.newArrayList("zhangshan", "lisi", "wangwu", "zhaoliu");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2.compareTo(o1));
            }
        });
        System.out.println(names);
        printLine();

        //2、
        List<String> names1 = Lists.newArrayList("zhangshan", "lisi", "wangwu", "zhaoliu");
        Collections.sort(names1, (o1, o2) -> o2.compareTo(o1));
        System.out.println(names1);
    }
}
