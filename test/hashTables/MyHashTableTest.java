package hashTables;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashTableTest {

    @Test
    void getData() {
        MyHashTable mht = new MyHashTable(20);
        int expected = 10000;
        mht.setData("grapes", 10000);
        int actual = mht.getData("grapes");
        assertEquals(expected, actual, "0 Indexi su tacni");
    }

    @Test
    void getData2() {
        MyHashTable mht = new MyHashTable(20);
        int expected = 10000;
        mht.setData("grapes", 10000);
        int actual = mht.getData("grapes");

        int expected2 = 999;
        mht.setData("apples", 999);
        int actual2 = mht.getData("apples");

        assertEquals(expected, actual, "0 Indexi su tacni");
        assertEquals(expected2, actual2, "0 Indexi su tacni");
    }
}