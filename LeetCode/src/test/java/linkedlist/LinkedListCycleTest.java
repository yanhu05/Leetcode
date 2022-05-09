package linkedlist;

import main.linkedlist.LinkedListCycle;
import main.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListCycleTest {

    @Test
    void detectCycle() {
        int[] nums = {1};
        assertEquals(null, new LinkedListCycle().detectCycle(ListNode.generateLinkedList(nums)));
    }
}