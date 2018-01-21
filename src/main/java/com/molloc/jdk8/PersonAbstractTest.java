package com.molloc.jdk8;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;

/**
 * @author yanleichang
 * @date 2018/1/20
 */
public class PersonAbstractTest extends AbstractTest {

    public static void main(String[] args) {
        Person person1 = new Person("zhangshan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> persons = Lists.newArrayList(person1, person2, person3);
        PersonAbstractTest test = new PersonAbstractTest();
        List<Person> personResult = test.getPersonsByUsername("zhangshan", persons);
        personResult.forEach(System.out::println);
        printLine();

        personResult = test.getPersonsByAge(25, persons);
        personResult.forEach(System.out::println);
        printLine();

        personResult = test.getPersonsByAge2(25,
                persons,
                (ageOfPerson, personList) -> personList.stream()
                        .filter(person -> person.getAge() > ageOfPerson)
                        .collect(Collectors.toList()));
        personResult.forEach(System.out::println);
    }

    private List<Person> getPersonsByUsername(String username, List<Person> persons) {
        return persons.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }

    private List<Person> getPersonsByAge(int age, List<Person> persons) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, personList) -> personList.stream()
                .filter(person -> person.getAge() > age)
                .collect(Collectors.toList());
        return biFunction.apply(age, persons);
    }

    private List<Person> getPersonsByAge2(int age, List<Person> persons, BiFunction<Integer, List<Person>,
            List<Person>> biFunction) {
        return biFunction.apply(age, persons);
    }
}
