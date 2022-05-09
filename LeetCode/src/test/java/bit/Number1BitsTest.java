package bit;

import main.bit.Number1Bits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Number1BitsTest {

    @Test
    void hammingWeight() {
        assertEquals(3, new Number1Bits().hammingWeight(11));

        assertEquals(1, new Number1Bits().hammingWeight(128));
    }
}