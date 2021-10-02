package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution26Test {

    @Test
    void testRoundToNextCent() {
        Solution26 sol = new Solution26();
        double num = sol.roundToNextCent(50.095);
        assertEquals(50.1, num, .00024);
    }

    @Test
    void testMonthCalculator(){
        PaymentCalculator pay = new PaymentCalculator();
        short months = pay.calculateMonthsUntilPaidOff(5000, .12, 100);
        assertEquals(70, months);
    }
}