package dp;

import main.dp.LongestPalindromicSubstring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromicSubstringTest {

    @Test
    void longestPalindrome() {
        assertEquals("a", new LongestPalindromicSubstring().longestPalindrome("abcda"));
    }
}