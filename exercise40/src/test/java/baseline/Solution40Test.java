/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test {

    @Test
    void testCreateMapsList() {
        Solution40 s = new Solution40();
        List<Map<Integer, Employee>> result = s.createMapsList();

        assertEquals(false, result.isEmpty());
    }
}