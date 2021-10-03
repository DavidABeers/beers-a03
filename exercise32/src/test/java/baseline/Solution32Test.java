/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void testGetNumberWithDifficulty() {
        Solution32 s = new Solution32();
        short result = s.getNumberWithDifficulty((short)1);
        assertEquals(5, result, 5);
    }

    @Test
    void testPlayAgain() {
        Solution32 s = new Solution32();
        short result = s.playAgain("y");
        assertEquals(1, result);
    }
}