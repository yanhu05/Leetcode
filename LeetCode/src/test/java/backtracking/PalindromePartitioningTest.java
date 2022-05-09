package backtracking;

import main.backtracking.PalindromePartitioning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromePartitioningTest {

    @Test
    void partition() {
        assertEquals(2, new PalindromePartitioning().partition("aab").size());
    }
}