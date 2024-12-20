package arrays.containsDuplicates;

public class ContainsDuplicates {

    public boolean containsDuplicates(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                System.out.println("i: " + i + ", j: " + j);
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
