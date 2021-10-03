/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {
    @Test
    public void testGiverRandResponse(){
        Solution33 s = new Solution33();
        short i = s.giveRandResponse();
        assertEquals(1.5, i, 1.5);
    }

}