/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void testCalcTimeToDoubleInvestment() {
        Solution29 sol = new Solution29();
        short years = sol.calcTimeToDoubleInvestment(4);
        assertEquals(18, years);
    }
}