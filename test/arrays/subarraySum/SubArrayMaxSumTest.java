package arrays.subarraySum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubArrayMaxSumTest {

    private final SubArrayMaxSum maxSum = new SubArrayMaxSum();

    // Test for array length being less than 1
    @Test
    void testArrayLengthTooShort() {
        int[] numbers = {}; // Empty array
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            maxSum.maxSum(numbers);
        });
        assertEquals("Niz nije dobar.", thrown.getMessage());
    }

    // Test for array length being greater than 10^5
    @Test
    void testArrayLengthTooLong() {
        int[] numbers = new int[(int) Math.pow(10, 5) + 1]; // Array of size 100001
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            maxSum.maxSum(numbers);
        });
        assertEquals("Niz nije dobar.", thrown.getMessage());
    }

    // Test for a number being less than -10^4
    @Test
    void testNumberTooSmall() {
        int[] numbers = {-10001}; // Single number that is out of range
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            maxSum.maxSum(numbers);
        });
        assertEquals("Niz nije dobar.", thrown.getMessage());
    }

    // Test for a number being greater than 10^4
    @Test
    void testNumberTooLarge() {
        int[] numbers = {10001}; // Single number that is out of range
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            maxSum.maxSum(numbers);
        });
        assertEquals("Niz nije dobar.", thrown.getMessage());
    }

    // Test for a number being both out of range and the array being too long
    @Test
    void testArrayTooLongAndNumberOutOfRange() {
        int[] numbers = new int[(int) Math.pow(10, 5) + 1]; // Array length > 10^5
        numbers[0] = 10001; // Out of range number
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            maxSum.maxSum(numbers);
        });
        assertEquals("Niz nije dobar.", thrown.getMessage());
    }

    @Test
    void maxSumNumValid() {
        SubArrayMaxSum sams = new SubArrayMaxSum();
        int[] numbers = {5, 2, 4, 2};
        int sum = sams.maxSum(numbers);
        int expSum = 13;
        assertEquals(expSum, sum, "Tacna suma izracunata");
    }

    @Test
    void maxSumNumValid2() {
        SubArrayMaxSum sams = new SubArrayMaxSum();
        int[] numbers = {5, -2, 4, 2};
        int sum = sams.maxSum(numbers);
        int expSum = 11;
        assertEquals(expSum, sum, "Tacna suma izracunata");
    }

    @Test
    void maxSumNumValid3() {
        SubArrayMaxSum sams = new SubArrayMaxSum();
        int[] numbers = {5};
        int sum = sams.maxSum(numbers);
        int expSum = 5;
        assertEquals(expSum, sum, "Tacna suma izracunata");
    }

    @Test
    void maxSumNumValid4() {
        SubArrayMaxSum sams = new SubArrayMaxSum();
        int[] numbers = { -2, -4, -1};
        int sum = sams.maxSum(numbers);
        int expSum = -1;
        assertEquals(expSum, sum, "Tacna suma izracunata");
    }


}