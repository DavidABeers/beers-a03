package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void testIsWordLengthIdentical() {
        Solution24 sol = new Solution24();
        String word1 = "notes";
        String word2 = "tones";

        boolean actualResult = sol.isWordLengthIdentical(word1, word2);
        boolean expectedResult = true;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void testIsAnagram() {
        Solution24 sol = new Solution24();
        String word1 = "notes";
        String word2 = "tones";

        boolean actualResult = sol.isAnagram(word1, word2);
        boolean expectedResult = true;
        assertEquals(actualResult, expectedResult);
    }
}