package com.lx.stream;

import com.lx.stream.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream filter
 * @author lengxu32110
 * @date 2021/9/12
 */
public class StreamFilter {

    public static void main(String[] args) {

        //筛选出Integer集合中大于7的元素，并打印出来
//        List<Integer> list = Arrays.asList(6, 7, 3, 8, 1, 2, 9);
//        list.stream().filter(x -> x > 7).forEach(System.out::print);

        //筛选员工中工资高于8000的人，并形成新的集合。形成新集合依赖collect（收集）
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("lx", 10500, 23, "male", "hangzhou"));
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        List<String> collect = personList.stream().filter(p -> p.getSalary() > 8000).map(Person::getName).collect(Collectors.toList());
        System.out.println(collect);
    }
}
