package twopinters;

import main.twopinters.FindDuplicateNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindDuplicateNumberTest {

    @Test
    void findDuplicate() {
        int[] nums = {3, 1, 3, 4, 2};
        assertEquals(3, new FindDuplicateNumber().findDuplicate(nums));


        int[] nums1 = {1, 3, 4, 2, 2};
        // assertEquals(2, new FindDuplicateNumber().findDuplicate(nums1));
    }
}