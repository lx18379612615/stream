package com.lx.stream;

import com.lx.stream.entity.Person;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream Collect 收集
 * @author lengxu32110
 * @date 2021/9/12
 */
public class StreamCollect {

    public static void main(String[] args) {

        //归集(toList/toSet/toMap)
//        List<Integer> list = Arrays.asList(1, 6, 3, 4, 6, 7, 9, 6, 20);
//
//        List<Integer> listNew = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println("toList: " + listNew);
//
//        Set<Integer> set = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
//        System.out.println("toSet: " + set);
//
//        List<Person> personList = new ArrayList<Person>();
//        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
//        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
//        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
//        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
//
//        Map<String, Integer> map = personList.stream().filter(person -> person.getSalary() > 8000).collect(Collectors.toMap(Person::getName, Person::getSalary));
//        System.out.println("toMap: " + map);

        // 统计(count/averaging)
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));

        // 求总数
//        System.out.println(personList.stream().collect(Collectors.counting()));

        // 求平均工资
//        System.out.println(personList.stream().collect(Collectors.averagingInt(Person::getSalary)));

        // 求最高工资
//        System.out.println(personList.stream().map(Person::getSalary).max(Integer::compareTo).get());

        // 求工资之和
//        System.out.println(personList.stream().collect(Collectors.summingInt(Person::getSalary)));

        // 一次性统计所有信息
        IntSummaryStatistics collect = personList.stream().collect(Collectors.summarizingInt(Person::getSalary));
        System.out.println(collect);
    }
}
