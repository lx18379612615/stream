package com.lx.stream;

import com.lx.stream.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Stream reducing
 * @author lengxu32110
 * @date 2021/9/12
 */
public class StreamReducing {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));

        System.out.println(personList.stream().map(Person::getSalary).reduce(0, (i, j) -> i + j - 5000));
    }
}
