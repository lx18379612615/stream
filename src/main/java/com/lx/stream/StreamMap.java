package com.lx.stream;

import com.lx.stream.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Stream map/flatmap
 * @author lengxu32110
 * @date 2021/9/12
 */
public class StreamMap {

    public static void main(String[] args) {

        // 英文字符串数组的元素全部改为大写。整数数组每个元素+3
//        String[] strArr = { "abcd", "bcdd", "defde", "fTr" };
//        Arrays.stream(strArr).map(String::toUpperCase).forEach(System.out::println);

//        List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9, 11);
//        intList.stream().map(x -> x + 3).forEach(System.out::println);

        // 将员工的薪资全部增加1000
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        // 不改变原来员工集合的方式
//        List<Person> newPersonList = personList.stream().map(person -> {
//            Person newPerson = new Person(person.getName(),
//                    person.getSalary() + 1000,
//                    person.getAge(),
//                    person.getSex(),
//                    person.getArea());
//            return newPerson;
//        }).collect(Collectors.toList());
//        personList.forEach(System.out::println);
//        newPersonList.forEach(System.out::println);

        // 改变原来员工集合的方式
        personList.stream().map(person -> person.getSalary() + 1000).forEach(System.out::println);
    }
}
