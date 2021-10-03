/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {
// this is entirely pointless, but I couldn't think of something else to test for this one
    @Test
    void testGenerateArray() {
        int[][] array = new int[12][12];
        for(int i = 0;i<12;i++){
            for(int j = 0;j<12;j++){
                array[i][j] = (i+1) * (j+1);
            }
        }
        Solution30 s = new Solution30();
        int[][] result = s.generateArray();
        assertEquals(array[6][11], result[6][11]);
    }
}