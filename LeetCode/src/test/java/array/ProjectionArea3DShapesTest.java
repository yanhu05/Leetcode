package array;

import main.array.ProjectionArea3DShapes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProjectionArea3DShapesTest {

    @Test
    void projectionArea() {
        int[][] grid = {{2}};

        assertEquals(5, new ProjectionArea3DShapes().projectionArea(grid));

    }
}