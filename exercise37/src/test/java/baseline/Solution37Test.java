/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {

    @Test
    void testGetEmptyIndex() {
        Solution37 s = new Solution37();
        ArrayList<Integer> stuff = new ArrayList<>();
        int result = s.getEmptyIndex(stuff, (short)8);
        assertEquals(4, result, 4);
    }

    @Test
    void testGeneratePassword() {
    }
}