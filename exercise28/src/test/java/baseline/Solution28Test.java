package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void testComputeTotal() {
        Solution28 sol = new Solution28();
        int total = sol.computeTotal();
        assertEquals(15, total);
    }
    // so apparently tests won't ask for user input, but it does work so whatever
}