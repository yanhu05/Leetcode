package dp;

import main.dp.PalindromicSubstrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromicSubstringsTest {

    @Test
    void countSubstrings() {
        assertEquals(6, new PalindromicSubstrings().countSubstrings("aaa"));
        assertEquals(4, new PalindromicSubstrings().countSubstrings("aba"));
    }

}