package array;

import main.array.MinIncrementToMakeArrayUnique;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MinIncrementToMakeArrayUniqueTest {

    @Test
    void minIncrementForUnique() {
        int[] nums = {7, 2, 7, 2, 1, 4, 3, 1, 4, 8};

        assertEquals(16, new MinIncrementToMakeArrayUnique().minIncrementForUnique(nums));

    }
}