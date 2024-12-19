import arrays.twoSum.TwoSum;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world, Ivane e Ivane radi li ovo?");

        TwoSum twoSum = new TwoSum();

        int[] arrayNums = {2, 7, 11, 15};
        int target = 9;

        int[] arrayNums2 = {3, 2, 4};
        int target2 = 6;

        int[] arrayNums3 = {3, 3};
        int target3 = 6;

        int[] arrayNums4 = {3, 3, 1, 2, 7, 5, 5};
        int target4 = 10;

        int[] ind = twoSum.findInd(arrayNums, target);
        System.out.println("1. RESENJE JE: " + ind[0]  + ", " + ind[1]);

        int[] ind2 = twoSum.findInd(arrayNums2, target2);
        System.out.println("2. RESENJE JE: " + ind2[0]  + ", " + ind2[1]);

        int[] ind3 = twoSum.findInd(arrayNums3, target3);
        System.out.println("3. RESENJE JE: " + ind3[0]  + ", " + ind3[1]);

        int[] ind4 = twoSum.findInd(arrayNums4, target4);
        System.out.println("3. RESENJE JE: " + ind4[0]  + ", " + ind4[1]);
    }
}