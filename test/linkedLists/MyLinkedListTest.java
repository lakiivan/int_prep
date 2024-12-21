package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void getLength() {
        MyNode myNode = new MyNode(null, null, 10);
        System.out.println(myNode);
        MyLinkedList mll = new MyLinkedList(myNode);
        System.out.println(mll);
    }
}