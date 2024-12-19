package arrays.twoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TwoSumTest {

    @Test
    void validateArray() {
        TwoSum ts = new TwoSum();

    }

    @Test
    void validateTarget() {
    }

    @Test
    void validateData() {
    }

    @Test
    void findInd() {

        TwoSum ts = new TwoSum();
        int[] arrayNums = {2, 7, 11, 15};
        int target = 9;
        int[] resultE = {0, 1};
        int[] resultC = ts.findInd(arrayNums, target);
        assertEquals(resultE[0], resultC[0], "0 Indexi su tacni");
        assertEquals(resultE[1], resultC[1], "1 Indexi su tacni");

    }

    @Test
    void findInd2() {

        TwoSum ts = new TwoSum();
        int[] arrayNums2 = {3, 2, 4};
        int target2 = 6;
        int[] resultE = {1, 2};
        int[] resultC = ts.findInd(arrayNums2, target2);
        assertEquals(resultE[0], resultC[0], "0 Indexi su tacni");
        assertEquals(resultE[1], resultC[1], "1 Indexi su tacni");

    }

    @Test
    void findInd3() {

        TwoSum ts = new TwoSum();
        int[] arrayNums3 = {3, 3};
        int target3= 6;
        int[] resultE = {0, 1};
        int[] resultC = ts.findInd(arrayNums3, target3);
        assertEquals(resultE[0], resultC[0], "0 Indexi su tacni");
        assertEquals(resultE[1], resultC[1], "1 Indexi su tacni");

    }

    @Test
    void findInd4() {

        TwoSum ts = new TwoSum();
        int[] arrayNums3 = {3};
        int target3= 6;
        int resultE = 0;
        int resultC = ts.findInd(arrayNums3, target3).length;
        assertEquals(resultE, resultC, "Vracen je prazan niz");

    }
}