package array;

import main.array.ThreeSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumTest {

    @Test
    void threeSum() {
        int[] nums = {-1, 0, 1, 2, -1, -4, -1, -1, -1, 2};
        assertEquals(3, new ThreeSum().threeSum(nums).size());

        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        assertEquals(2, new ThreeSum().threeSum(nums1).size());
    }
}