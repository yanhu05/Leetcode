package array;

import main.array.BinaryGap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryGapTest {

    @Test
    void binaryGap() {
        assertEquals(2, new BinaryGap().binaryGap(22));
        assertEquals(2, new BinaryGap().binaryGap(13));
    }
}