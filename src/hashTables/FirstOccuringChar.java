package hashTables;

import java.util.HashSet;

public class FirstOccuringChar {

    HashSet<Integer> hashSet;

    public FirstOccuringChar() {
        this.hashSet = new HashSet<>();
    }

    public int firstOccInt(int[] numbers) {
        for(int num: numbers) {
            if(hashSet.contains(num)) {
                return num;
            } else {
                hashSet.add(num);
            }
        }
        throw new RuntimeException("Svi brojevi su unikatni");
    }
}
