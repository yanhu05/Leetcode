package math;

import main.math.SumofSquareNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumofSquareNumbersTest {

    @Test
    void judgeSquareSum() {
        assertEquals(true, new SumofSquareNumbers().judgeSquareSum(100000));
    }
}