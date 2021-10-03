/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void testRemoveEmployee() {
        Solution34 s = new Solution34();

        ArrayList<String> results = s.giveEmployees();
        s.removeEmployee(results, "Jackie Jackson");
        assertEquals(4, results.size());
    }
}