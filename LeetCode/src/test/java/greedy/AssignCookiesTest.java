package greedy;

import main.greedy.AssignCookies;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AssignCookiesTest {

    @Test
    void findContentChildren() {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        assertEquals(1, new AssignCookies().findContentChildren(g, s));

        int[] g1 = {1, 2};
        int[] s1 = {1, 2, 3};
        assertEquals(2, new AssignCookies().findContentChildren(g1, s1));
    }
}