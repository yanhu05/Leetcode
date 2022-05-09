package math;

import main.math.PowerOfThree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerOfThreeTest {

    @Test
    void isPowerOfThree() {
        assertEquals(true, new PowerOfThree().isPowerOfThree(45));
    }
}