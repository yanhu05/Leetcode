package string;

import main.string.ScoreOfParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ScoreOfParenthesesTest {

    @Test
    void scoreOfParentheses() {
        assertEquals(6, new ScoreOfParentheses().scoreOfParentheses("(()(()))"));
        assertEquals(1, new ScoreOfParentheses().scoreOfParentheses("()"));
        assertEquals(3, new ScoreOfParentheses().scoreOfParentheses("()()()"));
        assertEquals(8, new ScoreOfParentheses().scoreOfParentheses("(()()(()))"));
        assertEquals(2, new ScoreOfParentheses().scoreOfParentheses("(())"));
        assertEquals(3, new ScoreOfParentheses().scoreOfParentheses("(())()"));

    }
}