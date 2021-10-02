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