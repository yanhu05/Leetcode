package dfs;

import main.dfs.NumberOfIslands;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfIslandsTest {

    @Test
    void numIslands() {
        char[][] grid = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};

        // assertEquals(1, new NumberOfIslands().numIslands(grid));

        char[][] grid1 = {{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};


        assertEquals(3, new NumberOfIslands().numIslands(grid1));
    }
}