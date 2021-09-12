package com.lx.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Stream find
 * @author lengxu32110
 * @date 2021/9/11
 */
public class StreamFind {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 6, 9, 3, 8, 2, 1);

        // 遍历输出大于6的元素
//        list.stream().filter(x -> x > 6).forEach(System.out::println);

        // 找出大于6的第一个元素
//        Optional<Integer> first = list.stream().filter(x -> x > 6).findFirst();
//        first.ifPresent(System.out::println);

        // 找出任一一个大于6的元素，使用并行流
//        Optional<Integer> findAny = list.parallelStream().filter(x -> x > 6).findAny();
//        findAny.ifPresent(System.out::println);

        // 是否包含符合特定条件的元素
        boolean anyMatch = list.stream().parallel().anyMatch(x -> x > 6);
        System.out.println(anyMatch);
    }
}
