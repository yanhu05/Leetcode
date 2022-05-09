package string;

import main.string.BuddyStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BuddyStringsTest {

    @Test
    void buddyStrings() {
        assertEquals(true, new BuddyStrings().buddyStrings("aaaaaaacb", "aaaaaaacb"));
    }
}