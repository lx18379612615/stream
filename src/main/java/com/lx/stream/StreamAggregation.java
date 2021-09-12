package com.lx.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Stream aggregation 聚合
 * @author lengxu32110
 * @date 2021/9/12
 */
public class StreamAggregation {

    public static void main(String[] args) {

        //获取String集合中最长的元素
//        List<String> list = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");
//        Optional<String> max = list.stream().max(Comparator.comparing(String::length));
//        System.out.println(max.get());

        //获取Integer集合中的最大值
//        List<Integer> list = Arrays.asList(7, 6, 9, 4, 11, 6);
//
//        //自然排序
//        Optional<Integer> max = list.stream().max(Integer::compareTo);
//        System.out.println(max.get());
//
//        //自定义排序
//        Optional<Integer> max1 = list.stream().max(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        System.out.println(max1.get());

        //获取员工工资最高的人
//        List<Person> personList = new ArrayList<Person>();
//        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
//        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
//        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
//        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
//        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
//        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));
//
//        Optional<Person> maxSalary = personList.stream().max(Comparator.comparingInt(Person::getSalary));
//        System.out.println(maxSalary.get());

        //计算Integer集合中大于6的元素的个数
        List<Integer> list = Arrays.asList(7, 6, 4, 8, 2, 11, 9);
        System.out.println(list.stream().filter(x -> x > 6).count());
    }
}
