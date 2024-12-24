package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void getLength() {
        MyNode myNode = new MyNode(10);
        System.out.println(myNode);
        MyLinkedList mll = new MyLinkedList(myNode);
        System.out.println(mll);
        int expected = 1;
        int actual = mll.getLength();
        assertEquals(expected, actual, "Duzina je netacna");
    }

    @Test
    void getLength2() {
        MyNode myNode = new MyNode(10);
        MyNode myNode2 = new MyNode(11);
        MyLinkedList mll = new MyLinkedList(myNode);
        mll.addHead(myNode2);
        System.out.println(mll);
        int expected = 2;
        int actual = mll.getLength();
        assertEquals(expected, actual, "Duzina je netacna");
    }

    @Test
    void getLength3() {
        MyNode myNode = new MyNode(14);
        MyNode myNode2 = new MyNode(13);
        MyNode myNode3 = new MyNode(12);
        MyNode myNode4 = new MyNode(11);
        MyNode myNode5 = new MyNode(10);
        MyLinkedList mll = new MyLinkedList(myNode);
        mll.addHead(myNode2);
        mll.addHead(myNode3);
        mll.addHead(myNode4);
        mll.addHead(myNode5);
        System.out.println(mll);
        int expected = 5;
        int actual = mll.getLength();
        assertEquals(expected, actual, "Duzina je netacna");
    }

   @Test
   void testAddTail() {
       MyNode myNode = new MyNode(10);
       MyNode myNode2 = new MyNode(11);
       MyNode myNode3 = new MyNode(12);
       MyLinkedList mll = new MyLinkedList(myNode);
       mll.addTail(myNode2);
       mll.addTail(myNode3);
       System.out.println(mll);
       int expected = 3;
       int actual = mll.getLength();
       assertEquals(expected, actual, "Duzina je netacna");
   }

    @Test
    void testAddTail2() {
        MyNode myNode = new MyNode(14);
        MyNode myNode2 = new MyNode(13);
        MyNode myNode3 = new MyNode(12);
        MyNode myNode4 = new MyNode(11);
        MyNode myNode5 = new MyNode(10);
        MyLinkedList mll = new MyLinkedList(myNode);
        mll.addTail(myNode2);
        mll.addTail(myNode3);
        mll.addTail(myNode4);
        mll.addTail(myNode5);
        System.out.println(mll);
        int expected = 5;
        int actual = mll.getLength();
        assertEquals(expected, actual, "Duzina je netacna");
    }

    @Test
    void testAddIndex() {

    }
}