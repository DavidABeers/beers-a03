/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {

    @Test
    void testMakeMapList() {
        Solution39 s = new Solution39();
        List<Map<Integer, Employee>> result = s.makeMapList();

        assertEquals(false, result.isEmpty());
    }

    @Test
    void testSortMapList() {
        List<Map<Integer, Employee>> expected = new ArrayList<>();
        Map<Integer, Employee> employ1  = new HashMap<>();
        Map<Integer, Employee> employ2  = new HashMap<>();
        Map<Integer, Employee> employ3  = new HashMap<>();
        Map<Integer, Employee> employ4  = new HashMap<>();
        Map<Integer, Employee> employ5  = new HashMap<>();
        Map<Integer, Employee> employ6  = new HashMap<>();
        Employee employee1 = new Employee("John", "Johnson", "Manager", "2016-12-31");
        Employee employee6 = new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Employee employee4 = new Employee("Micheala", "Michaelson", "District Manager", "2-15-12-19");
        Employee employee3 = new Employee("Jake", "Jacobson","Programmer", "");
        Employee employee2 = new Employee("Jacquelyn", "Jackson","DBA", "");
        Employee employee5 = new Employee("Sally", "Webber","Web Developer", "2015-12-18");
        employ1.put(0, employee1);
        employ2.put(1, employee2);
        employ3.put(2, employee3);
        employ4.put(3, employee4);
        employ5.put(4, employee5);
        employ6.put(5, employee6);
        expected.add(employ1);
        expected.add(employ2);
        expected.add(employ3);
        expected.add(employ4);
        expected.add(employ5);
        expected.add(employ6);

        Solution39 s = new Solution39();
        List<Map<Integer, Employee>> result = s.makeMapList();
        result = s.sortMapList(result);
        assertEquals(expected.get(4).get(4).getLastName(), result.get(4).get(4).getLastName());
    }
}