package dp;

import main.dp.ArithmeticSlices;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticSlicesTest {

    @Test
    void numberOfArithmeticSlices() {
        int[] inputs = new int[]{0, 1, 2, 3, 4, 5};
        assertEquals(10, new ArithmeticSlices().numberOfArithmeticSlices(inputs));
    }

}