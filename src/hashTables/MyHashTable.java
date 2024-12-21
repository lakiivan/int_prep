package hashTables;

public class MyHashTable {
    private int[] data;

    public MyHashTable(int size) {
        this.data = new int[size];
    }

    private int hashFunction (String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.data.length;
        }
        return hash;
    }

    public void setData(String key, int value) {
        this.data[hashFunction(key)] = value;
    }

    public int getData(String key) {
        return this.data[hashFunction(key)];
    }
}
