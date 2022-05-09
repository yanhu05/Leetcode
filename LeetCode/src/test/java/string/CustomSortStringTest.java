package string;

import main.string.CustomSortString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomSortStringTest {

    @Test
    void customSortString() {
        assertEquals("cbad", new CustomSortString().customSortString("cba", "abcd"));
    }
}