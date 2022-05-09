package backtracking;

import main.backtracking.Permutations2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Permutations2Test {

    @Test
    void permuteUnique() {
        int[] nums = {1, 1, 2};
        assertEquals(3, new Permutations2().permuteUnique(nums).size());
        int[] nums1 = {1, 1, 1};
        assertEquals(1, new Permutations2().permuteUnique(nums1).size());
    }
}