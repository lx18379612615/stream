package com.lx.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream 提取/组合
 * @author lengxu32110
 * @date 2021/9/12
 */
public class StreamCombine {
    public static void main(String[] args) {
        String[] arr1 = { "a", "b", "c", "d" };
        String[] arr2 = { "d", "e", "f", "g" };

        Stream<String> stream1 = Stream.of(arr1);
        Stream<String> stream2 = Stream.of(arr2);

        // concat:合并两个流 distinct：去重
//        List<String> newList = Stream.concat(stream1, stream2).distinct().collect(Collectors.toList());
//        System.out.println("newList = " + newList);

        // limit：限制从流中获得前n个数据
//        List<Integer> collect = Stream.iterate(1, x -> x + 2).limit(10).collect(Collectors.toList());
//        System.out.println("collect = " + collect);

        // skip：跳过前n个数据
//        List<Integer> collect2 = Stream.iterate(1, x -> x + 2).skip(1).limit(5).collect(Collectors.toList());
//        System.out.println("collect2 = " + collect2);

        System.out.println(stream1.skip(2).collect(Collectors.toList()));
    }
}
