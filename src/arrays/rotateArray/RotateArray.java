package arrays.rotateArray;

import java.sql.Array;

public class RotateArray {

    public long[] rotateArray(long[] numbers, int k) {
        long[] rotated = new long[numbers.length];
        int index = 0;
        for (int i = 0; i < k; i++) {
            rotated[i] = numbers[numbers.length - k + i];
        }
        for (int i = k; i < numbers.length; i++) {
            rotated[i] = numbers[index];
            index++;
        }
        return rotated;
    }
}
