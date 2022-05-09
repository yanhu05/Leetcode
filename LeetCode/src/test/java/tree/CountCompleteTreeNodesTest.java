package tree;


import main.tree.CountCompleteTreeNodes;
import main.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CountCompleteTreeNodesTest {

    @Test
    void countNodes() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        assertEquals(3, new CountCompleteTreeNodes().countNodes(root));

    }
}