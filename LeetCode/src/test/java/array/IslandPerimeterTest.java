package array;

import main.array.IslandPerimeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IslandPerimeterTest {

    @Test
    void islandPerimeter() {
        int[][] grid = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};

        assertEquals(16, new IslandPerimeter().islandPerimeter(grid));


        int[][] grid1 = {{1}};

        assertEquals(4, new IslandPerimeter().islandPerimeter(grid1));

    }
}