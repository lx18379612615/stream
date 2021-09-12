package com.lx.stream;

import com.lx.stream.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Stream groupBy partitionBy
 * @author lengxu32110
 * @date 2021/9/12
 */
public class StreamGroupByPartitionBy {

    public static void main(String[] args) {

        // 将员工按薪资是否高于8000分为两部分；将员工按性别和地区分组
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Tom", 8900, 12, "male", "New York"));
        personList.add(new Person("Jack", 7000, 12, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 12, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 12, "female", "New York"));
        personList.add(new Person("Owen", 9500, 12, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 12, "female", "New York"));

        // 将员工按薪资是否高于8000分组
//        Map<Boolean, List<Person>> part = personList.stream().collect(Collectors.partitioningBy(person -> person.getSalary() > 8000));
//        System.out.println("part.get(true) = " + part.get(true));
//        System.out.println("part.get(false) = " + part.get(false));

        // 将员工按性别分组
//        Map<String, List<Person>> sexMap = personList.stream().collect(Collectors.groupingBy(Person::getSex));
//        System.out.println("sexMap = " + sexMap);

        // 将员工先按性别分组，再按地区分组
        Map<String, Map<String, List<Person>>> map = personList.stream().collect(Collectors.groupingBy(Person::getSex, Collectors.groupingBy(Person::getArea)));
        System.out.println("map = " + map);


    }
}
