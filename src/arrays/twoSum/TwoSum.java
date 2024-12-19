package arrays.twoSum;

public class TwoSum {


    boolean validateArray (int[] arrayNums) {
        if (arrayNums.length >= 2 && arrayNums.length < 1000) {
            for (int i = 0; i < arrayNums.length; i++) {
                if (arrayNums[i] < - 1000000000 || arrayNums[i] > 1000000000) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    boolean validateTarget(int target) {
        return (target > -1000000000 && target < 1000000000);
    }

    boolean validateData(int[] arrayNums, int target) {
        return validateArray(arrayNums) && validateTarget(target);
    }

    public int[] findInd( int[] arrayNums, int target) {
        //System.out.println(arrayNums[0] + ", " + arrayNums[1]);
        if (validateData(arrayNums, target)) {
            for (int i = 0; i < arrayNums.length - 1; i++) {
                //System.out.println("Prvi broj: " + arrayNums[i]);
                for(int j = i + 1; j <arrayNums.length; j++) {
                    //System.out.println("Drugi broj: " + arrayNums[j]);
                    //System.out.println(arrayNums[i] + " + " + arrayNums[j] + " = " + (arrayNums[i] + arrayNums[j]));
                    if (arrayNums[i] + arrayNums[j] == target) {
                        //System.out.println("i: " + i + ", j: " + j );
                        return new int[] {i, j};
                    }
                }
            }
        }
        return new int[]{};
    }



}
