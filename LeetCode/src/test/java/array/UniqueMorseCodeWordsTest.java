package array;

import main.array.UniqueMorseCodeWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueMorseCodeWordsTest {

    @Test
    void uniqueMorseRepresentations() {
        String[] words = {"gin", "zen", "gig", "msg"};
        assertEquals(2, new UniqueMorseCodeWords().uniqueMorseRepresentations(words));
    }
}