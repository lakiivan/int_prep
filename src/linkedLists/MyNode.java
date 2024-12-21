package linkedLists;

public class MyNode {
    private MyNode prev;
    private MyNode next;
    private int value;

    public MyNode(MyNode prev, MyNode next, int value) {
        this.prev = prev;
        this.next = next;
        this.value = value;
    }

    public MyNode getPrev() {
        return prev;
    }

    public void setPrev(MyNode prev) {
        this.prev = prev;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "prev=" + prev +
                ", next=" + next +
                ", value=" + value +
                '}';
    }
}
