package array;

import main.array.ProductArrayExceptSelf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductArrayExceptSelfTest {

    @Test
    void productExceptSelf() {
        int[] nums = {1, 2, 3, 4};
        assertEquals(6, new ProductArrayExceptSelf().productExceptSelf(nums)[3]);
    }
}