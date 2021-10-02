package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void testValidateInput() {
        Solution27 sol = new Solution27();
        ArrayList<String> results = sol.validateInput("f", "", "32g04", "FD7782");
        assertEquals(4, results.size());
    }
}