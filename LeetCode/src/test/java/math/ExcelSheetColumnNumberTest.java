package math;

import main.math.ExcelSheetColumnNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExcelSheetColumnNumberTest {

    @Test
    void titleToNumber() {
        assertEquals(701, new ExcelSheetColumnNumber().titleToNumber("ZY"));
    }
}