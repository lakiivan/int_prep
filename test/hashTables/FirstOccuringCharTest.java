package hashTables;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstOccuringCharTest {

    @Test
    void firstOccInt() {
        FirstOccuringChar foc = new FirstOccuringChar();
        int[] numbers = new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4};
        int expected = 2;
        int actual = foc.firstOccInt(numbers);
        assertEquals(expected, actual, "0 Indexi su tacni");
    }

    @Test
    void firstOccInt2() {
        FirstOccuringChar foc = new FirstOccuringChar();
        int[] numbers = new int[]{2, 1, 1, 2, 3, 5, 1, 2, 4};
        int expected = 1;
        int actual = foc.firstOccInt(numbers);
        assertEquals(expected, actual, "0 Indexi su tacni");
    }

    // Test for array length being less than 1
    @Test
    void testFirstOccRunTimeError() {
        FirstOccuringChar foc = new FirstOccuringChar();
        int[] numbers = new int[]{2, 3, 4, 5};

        RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
            foc.firstOccInt(numbers);
        });
        assertEquals("Svi brojevi su unikatni", thrown.getMessage());
    }
}