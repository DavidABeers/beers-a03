/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void testPasswordValidator() {
        Solution25 sol = new Solution25();
        short strength = sol.passwordValidator("terr1blen3w$");
        assertEquals(3, strength);
    }
}