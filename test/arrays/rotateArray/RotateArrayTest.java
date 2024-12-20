package arrays.rotateArray;

import arrays.moveZeroes.MoveZeros;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @Test
    void rotateArray() {
        RotateArray ra = new RotateArray();
        long[] numbers = {3, 4, 5, 1, 2};
        int k = 2;
        long[] actual = ra.rotateArray(numbers, k);
        long[] expected = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(actual[i], expected[i], "Broj je isti");
        }
    }

    @Test
    void rotateArray2() {
        RotateArray ra = new RotateArray();
        long[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        long[] actual = ra.rotateArray(numbers, k);
        long[] expected = {5, 6, 7, 1, 2, 3, 4};
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(actual[i], expected[i], "Broj je isti");
        }
    }

    @Test
    void rotateArray3() {
        RotateArray ra = new RotateArray();
        long[] numbers = {-1, -100, 3, 99};
        int k = 2;
        long[] actual = ra.rotateArray(numbers, k);
        long[] expected = {3, 99, -1, -100};
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(actual[i], expected[i], "Broj je isti");
        }
    }
}