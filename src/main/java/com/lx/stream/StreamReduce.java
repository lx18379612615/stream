package com.lx.stream;

import com.lx.stream.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Stream reduce 归约
 * @author lengxu32110
 * @date 2021/9/12
 */
public class StreamReduce {

    public static void main(String[] args) {

        // 求Integer集合的元素之和、乘积和最大值
//        List<Integer> list = Arrays.asList(1, 3, 2, 8, 11, 4);
        // 求和方式1
//        System.out.println(list.stream().reduce((x, y) -> x + y).get());

        // 求和方式2
//        System.out.println(list.stream().reduce(Integer::sum).get());

        // 求和方式3
//        System.out.println(list.stream().reduce(0, Integer::sum));

        // 求乘积
//        System.out.println(list.stream().reduce((x, y) -> x * y).get());

        // 求最大值方法1
//        System.out.println(list.stream().reduce((x, y) -> x > y ? x : y).get());

        // 求最大值方法2
//        System.out.println(list.stream().reduce(Integer::max).get());

        // 求所有员工的工资之和和最高工资
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        // 求工资之和方式1
        System.out.println(personList.stream().map(Person::getSalary).reduce((x, y) -> x + y).get());

        // 求工资之和方式2
        System.out.println(personList.stream().map(Person::getSalary).reduce(Integer::sum).get());

        // 求工资之和方式3
        System.out.println(personList.stream().reduce(0, (sum, p) -> sum += p.getSalary(), (x, y) -> x + y));

        //求工资之和方式4
        System.out.println(personList.stream().reduce(0, (sum, p) -> sum += p.getSalary(), Integer::sum));
    }
}
