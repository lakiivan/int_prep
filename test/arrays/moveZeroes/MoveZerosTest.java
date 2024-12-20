package arrays.moveZeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    @Test
    void moveZeroes() {
        MoveZeros mz = new MoveZeros();
        long[] numbers = {5, 2, 0, 4, 2};
        long[] movedZeros = mz.moveZeroes(numbers);
        long[] numbersWithZerosAtTheEnd = {5, 2, 4, 2, 0};
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(movedZeros[i], numbersWithZerosAtTheEnd[i], "Broj je isti");
        }
    }

    @Test
    void moveZeroes2() {
        MoveZeros mz = new MoveZeros();
        long[] numbers = {5, 2, 0, 4, 2, -3, 0, 1, 2, 3, 0, 9};
        long[] movedZeros = mz.moveZeroes(numbers);
        long[] numbersWithZerosAtTheEnd = {5, 2, 4, 2, -3, 1, 2, 3, 9, 0, 0, 0, 0};
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(movedZeros[i], numbersWithZerosAtTheEnd[i], "Broj je isti");
        }
    }

    @Test
    void moveZeroes3() {
        MoveZeros mz = new MoveZeros();
        long[] numbers = {0, 5, 2, 0, 4, 2, -3, 0, 1, 2, 3, 0, 9, 0};
        long[] movedZeros = mz.moveZeroes(numbers);
        long[] numbersWithZerosAtTheEnd = {5, 2, 4, 2, -3, 1, 2, 3, 9, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(movedZeros[i], numbersWithZerosAtTheEnd[i], "Broj je isti");
        }
    }

    @Test
    void moveZeroes4() {
        MoveZeros mz = new MoveZeros();
        long[] numbers = {0};
        long[] movedZeros = mz.moveZeroes(numbers);
        long[] numbersWithZerosAtTheEnd = {0};
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(movedZeros[i], numbersWithZerosAtTheEnd[i], "Broj je isti");
        }
    }
}