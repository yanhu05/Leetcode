package array;

import main.array.FourSum2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FourSum2Test {

    @Test
    void fourSumCount() {
        int[] a = {1, 2};
        int[] b = {-2, -1};
        int[] c = {-1, 2};
        int[] d = {0, 2};
        assertEquals(2, new FourSum2().fourSumCount(a, b, c, d));
    }
}