package array;

import main.array.PeakIndexMountain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PeakIndexMountainTest {

    @Test
    void peakIndexInMountainArray() {
        int[] nums = {0, 2, 1, 0};
        assertEquals(1, new PeakIndexMountain().peakIndexInMountainArray(nums));

        int[] nums1 = {0, 1, 2, 3, 4};
        assertEquals(4, new PeakIndexMountain().peakIndexInMountainArray(nums1));
    }
}