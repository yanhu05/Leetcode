package math;

import main.math.Sqrt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrtTest {

    @Test
    void mySqrt() {
        assertEquals(2, new Sqrt().mySqrt(9));
    }
}