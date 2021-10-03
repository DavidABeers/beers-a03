/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {

    @Test
    void stdTest() {
        Solution36 s = new Solution36();
        ArrayList<String> data = new ArrayList<>();
        data.add("3");
        data.add("4");
        data.add("5");
        double result = s.std(data);
        assertEquals(1.0, result);
    }

    @Test
    void minTest() {
        Solution36 s = new Solution36();
        ArrayList<String> data = new ArrayList<>();
        data.add("3");
        data.add("4");
        data.add("5");
        double result = s.min(data);
        assertEquals(3.0, result);
    }
    @Test
    void maxTest() {
        Solution36 s = new Solution36();
        ArrayList<String> data = new ArrayList<>();
        data.add("3");
        data.add("4");
        data.add("5");
        double result = s.max(data);
        assertEquals(5.0, result);
    }
    @Test
    void avgTest() {
        Solution36 s = new Solution36();
        ArrayList<String> data = new ArrayList<>();
        data.add("3");
        data.add("4");
        data.add("5");
        double result = s.average(data);
        assertEquals(4.0, result);
    }
}