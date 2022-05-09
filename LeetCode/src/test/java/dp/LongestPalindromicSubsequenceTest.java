package dp;

import main.dp.LongestPalindromicSubsequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromicSubsequenceTest {

    @Test
    void longestPalindromeSubseq() {
        assertEquals(4, new LongestPalindromicSubsequence().longestPalindromeSubseq("bbbab"));
    }
}