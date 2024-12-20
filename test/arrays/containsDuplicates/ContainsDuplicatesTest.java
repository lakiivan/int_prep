package arrays.containsDuplicates;

import arrays.moveZeroes.MoveZeros;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesTest {

    @Test
    void containsDuplicates() {
        ContainsDuplicates cd = new ContainsDuplicates();
        int[] numbers = {5, 2, 0, 4, 2};
        boolean exp = true;
        boolean result = cd.containsDuplicates(numbers);
        assertEquals(exp, result, "Sadrzi najmanje jedan duplikat");
    }

    @Test
    void containsDuplicates2() {
        ContainsDuplicates cd = new ContainsDuplicates();
        int[] numbers = {5, 3, 4, 2};
        boolean exp = false;
        boolean result = cd.containsDuplicates(numbers);
        assertEquals(exp, result, "Ne sadrzi nijedan duplikat");
    }

    @Test
    void containsDuplicates3() {
        ContainsDuplicates cd = new ContainsDuplicates();
        int[] numbers = {5};
        boolean exp = false;
        boolean result = cd.containsDuplicates(numbers);
        assertEquals(exp, result, "Ne sadrzi nijedan duplikat");
    }
}