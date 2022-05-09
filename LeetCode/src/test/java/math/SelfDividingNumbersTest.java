package math;

import main.math.SelfDividingNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SelfDividingNumbersTest {

    @Test
    void selfDividingNumbers() {
        assertEquals(13, new SelfDividingNumbers().selfDividingNumbers(1, 22).size());
    }
}