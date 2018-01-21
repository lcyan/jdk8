package com.molloc.jdk8;

import java.util.List;
import java.util.function.Predicate;

import com.google.common.collect.Lists;

/**
 * @author yanleichang
 * @date 2018/1/21
 */
public class PredicateAbstractTest2 extends AbstractTest {

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        PredicateAbstractTest2 test = new PredicateAbstractTest2();
        //找到集合当中所有的奇数
        test.conditionFilter(item -> item % 2 != 0, list);
        printLine();
        //找到集合当中所有的偶数
        test.conditionFilter(item -> item % 2 == 0, list);
        printLine();
        //找到集合当中所有大于5的数字
        test.conditionFilter(item -> item > 5, list);
        printLine();
        //找到集合当中所有小于3的数字
        test.conditionFilter(item -> item < 3, list);
        printLine();
        //找到集合中所有的元素
        test.conditionFilter(item -> true, list);
        printLine();
        //找出集合中大于5并且是偶数的元素
        test.conditionFilter2(list, item -> item > 5, item -> item % 2 == 0, Logic.AND);
        printLine();
        test.conditionFilter2(list, item -> item > 5, item -> item % 2 == 0, Logic.OR);
        printLine();
        //理解Predicate#isEqual
        System.out.println(test.isEqual("test").test("test"));
    }

    private void conditionFilter(Predicate<Integer> predicate, List<Integer> list) {
        //list.stream().filter(predicate).collect(Collectors.toList()).forEach(System.out::println);
        for (Integer item : list) {
            if (predicate.test(item)) {
                System.out.println(item);
            }
        }
    }

    private void conditionFilter2(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2,
                                  Logic logic) {
        Predicate<Integer> composePredicate = predicate1.and(predicate2);
        switch (logic) {
            case OR:
                composePredicate = predicate1.or(predicate2);
                break;
            case AND:
                composePredicate = predicate1.and(predicate2);
                break;
            default:
                break;
        }
        for (Integer item : list) {
            if (composePredicate.test(item)) {
                System.out.println(item);
            }
        }

    }

    private Predicate<String> isEqual(Object object) {
        return Predicate.isEqual(object);
    }

    //对比，conditionFilter，函数式编程到底给我们带来了什么？
    private void findAllEvens(List<Integer> list) {
        for (Integer item : list) {
            if (item % 2 == 0) {
                System.out.println(item);
            }
        }
    }

    public enum Logic {
        OR, AND
    }
}
