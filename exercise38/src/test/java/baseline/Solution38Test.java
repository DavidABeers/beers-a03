/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    @Test
    void testInputToArray() {
        Solution38 s = new Solution38();
        int[] results = s.inputToArray("1 2 7 6 8 3");
        int[] expected = {1, 2, 7, 6, 8, 3};
        assertArrayEquals(expected, results);
    }

    @Test
    void testFilterEvenNumbers() {
        Solution38 s = new Solution38();
        int[] dummy = s.inputToArray("1 2 7 6 8 3");
        int[] results = s.filterEvenNumbers(dummy);
        int[] expected = {2, 6, 8};
        assertArrayEquals(expected, results);
    }
}