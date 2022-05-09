package hashmap;

import main.hashmap.NextGreaterElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NextGreaterElementTest {

    @Test
    void nextGreaterElement() {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        assertEquals(0, new NextGreaterElement().nextGreaterElement(nums1, nums2));
    }
}