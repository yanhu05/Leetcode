package array;

import main.array.MinimumMovesEqualArrayElements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumMovesEqualArrayElementsTest {

    @Test
    void minMoves2() {
        int[] nums = {1, 2, 3};
        assertEquals(2, new MinimumMovesEqualArrayElements().minMoves2(nums));

        int[] nums1 = {-1, -2, 15, 16};

        assertEquals(34, new MinimumMovesEqualArrayElements().minMoves2(nums1));
    }
}