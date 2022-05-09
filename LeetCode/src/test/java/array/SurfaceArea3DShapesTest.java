package array;

import main.array.SurfaceArea3DShapes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SurfaceArea3DShapesTest {

    @Test
    void surfaceArea() {
        int[][] grid = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        assertEquals(46, new SurfaceArea3DShapes().surfaceArea(grid));

        int[][] grid1 = {{1, 0}, {0, 2}};

        assertEquals(16, new SurfaceArea3DShapes().surfaceArea(grid1));
    }
}