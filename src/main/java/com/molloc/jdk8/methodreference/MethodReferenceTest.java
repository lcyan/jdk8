package com.molloc.jdk8.methodreference;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import com.google.common.collect.Lists;
import com.molloc.jdk8.AbstractTest;

/**
 * @author yanleichang
 * @date 2018/1/21
 */
public class MethodReferenceTest extends AbstractTest {

    public static void main(String[] args) {
        Student student1 = new Student("zhangshan", 10);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 50);
        Student student4 = new Student("zhaoliu", 40);

        List<Student> students = Lists.newArrayList(student1, student2, student3, student4);
        //类名::静态方法名
        //students.sort((studentParam1, studentParam2) -> Student.compareStudentByScore(studentParam1, studentParam2));
        students.sort(Student::compareStudentByScore);
        students.forEach(System.out::println);
        printLine();

        //students.sort((studentParam1, studentParam2) -> Student.compareStudentByName(studentParam1, studentParam2));
        students.sort(Student::compareStudentByName);
        students.forEach(System.out::println);
        printLine();

        //引用名::方法名
        StudentComparator studentComparator = new StudentComparator();
//        students.sort((studentParam1, studentParam2) -> studentComparator.comparaStudentByScore(studentParam1,
//                studentParam2));
        students.sort(studentComparator::comparaStudentByScore);
        students.forEach(System.out::println);
        printLine();

//        students.sort((studentParam1, studentParam2) -> studentComparator.comparaStudentByName(studentParam1,
//                studentParam2));
        students.sort(studentComparator::comparaStudentByName);
        students.forEach(System.out::println);
        printLine();

        //类名::实例方法名
        students.sort(Student::compareByScore);
        students.forEach(System.out::println);
        printLine();

        List<String> cities = Lists.newArrayList("qingdao", "chongqing", "tianjin", "beijing");
        cities.sort(String::compareToIgnoreCase);
        cities.forEach(System.out::println);
        printLine();

        //构造方法引用 类名::new
        MethodReferenceTest test = new MethodReferenceTest();
        System.out.println(test.getString(String::new));

        System.out.println(test.getString2("hello", String::new));
    }

    public String getString(Supplier<String> supplier) {
        return supplier.get() + "test";
    }

    public String getString2(String str, Function<String, String> function) {
        return function.apply(str);
    }
}
