package arrays.subarraySum;

public class SubArrayMaxSum {

    public int maxSum(int[] numbers) throws IllegalArgumentException {
        if(!isArrayValid(numbers)) {
            throw new IllegalArgumentException("Niz nije dobar.");
        }
        int sum = 0;
        boolean onlyNegatives = true;
        int smallestNegative = (int)-Math.pow(10,4);
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > smallestNegative) {
                smallestNegative = numbers[i];
            }
            if(numbers[i] >= 0) {
                onlyNegatives = false;
                sum += numbers[i];
            }
        }
        if (onlyNegatives) {
            sum = smallestNegative;
        }
        return sum;
    }

    private boolean isArrayValid (int[] numbers) {
        boolean arrLengthValid =  numbers.length >=1 && numbers.length <= Math.pow(10, 5);
        boolean numValid = true;
        for (int number : numbers) {
            if (!isNumValid(number)) {
                numValid = false;
                break;
            }
        }
        return arrLengthValid && numValid;
    }

    private boolean isNumValid (int num) {
        return num >= -Math.pow(10, 4) &&  num <= Math.pow(10, 4);
    }

}
