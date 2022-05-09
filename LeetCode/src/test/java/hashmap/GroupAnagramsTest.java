package hashmap;

import main.hashmap.GroupAnagrams;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupAnagramsTest {

    @Test
    void groupAnagrams() {
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        assertEquals(3, new GroupAnagrams().groupAnagrams(s));
    }
}