package com.lx.stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootTest
class StreamApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void collectionStream(){
        List<String> list = Arrays.asList("a", "b", "c");

        Stream<String> stream = list.stream();
        Stream<String> parallelStream = list.parallelStream();

    }

    void arrayStream(){
        int [] arrays = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(arrays);
    }

}
