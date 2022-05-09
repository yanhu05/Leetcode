package string;

import main.string.JudgeRouteCircle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JudgeRouteCircleTest {

    @Test
    void judgeCircle() {
        assertEquals(true, new JudgeRouteCircle().judgeCircle("LLRRUUDD"));
    }
}