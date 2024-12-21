package linkedLists;

public class MyLinkedList {

    private MyNode head;
    private MyNode tail;
    private int length;

    public MyLinkedList(MyNode myNode) {
        this.head = myNode;
        this.tail = myNode;
        this.length = 1;
    }

    public MyNode getHead() {
        return head;
    }

    public void setHead(MyNode head) {
        this.head = head;
    }

    public MyNode getTail() {
        return tail;
    }

    public void setTail(MyNode tail) {
        this.tail = tail;
    }

    private void addLength() {
        this.length++;
    }

    public int getLength() {
        return length;
    }

    public MyNode addHead(MyNode myNode) {
        myNode.setPrev(null);
        myNode.setNext(this.head);
        this.head.setPrev(myNode);
        addLength();
        return myNode;
    }

    public MyNode addTail(MyNode myNode) {
        myNode.setNext(null);
        myNode.setPrev(this.tail);
        this.tail.setNext(myNode);
        addLength();
        return myNode;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }
}
