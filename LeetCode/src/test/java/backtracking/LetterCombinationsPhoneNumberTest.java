package backtracking;

import main.backtracking.LetterCombinationsPhoneNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterCombinationsPhoneNumberTest {

    @Test
    void letterCombinations() {
        assertEquals(9, new LetterCombinationsPhoneNumber().letterCombinations("23").size());
    }
}