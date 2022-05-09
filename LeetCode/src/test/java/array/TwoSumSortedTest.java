package array;

import main.array.TwoSumSorted;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumSortedTest {

    @Test
    void twoSum() {
        int[] nums = {2, 7, 11, 15};
        assertEquals(2, new TwoSumSorted().twoSum(nums, 9)[1]);
    }
}