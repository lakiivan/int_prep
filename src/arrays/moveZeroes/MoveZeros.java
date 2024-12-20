package arrays.moveZeroes;

public class MoveZeros {

    public long[] moveZeroes(long[] numbers) {
        int lastZeroIndex = numbers.length - 1;

        for (int i = 0; i < lastZeroIndex; i++) {
            if (numbers[i] == 0) {
                for (int j = i; j < lastZeroIndex; j++) {
                    long temp = numbers[j + 1];
                    numbers[j] = temp;
                }
                    numbers[lastZeroIndex] = 0;
                    lastZeroIndex--;
            }
        }

        return numbers;
    }


    private boolean isArrayValid(long[] numbers) {
        boolean arrLengthValid = numbers.length >= 1 && numbers.length <= Math.pow(10, 4);
        boolean numValid = true;
        for (long number : numbers) {
            if (!isNumValid(number)) {
                numValid = false;
                break;
            }
        }
        return arrLengthValid && numValid;
    }

    private boolean isNumValid(long num) {
        return num >= -Math.pow(2, 31) && num <= Math.pow(2, 31) - 1;
    }
}