/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void testFindTargetHR() {
        Solution31 s = new Solution31();
        short hr = s.findTargetHR((short)22, (short)65, (short)55);
        assertEquals(138, hr);
    }
}