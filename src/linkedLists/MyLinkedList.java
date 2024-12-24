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

    public void setHead(MyNode myNode) {
        this.head = myNode;
        this.tail = myNode;
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
        if (this.length == 1) {
            this.head = myNode;
            this.head.setNext(this.tail);
            this.tail.setPrev(this.head);
        } else {
            MyNode oldHead = new MyNode(myNode, this.head.getNext(), this.head.getValue());
            this.head = myNode;
            this.head.setNext(oldHead);
        }
        addLength();
        return myNode;
    }

    public MyNode addTail(MyNode myNode) {
        if(this.length == 1) {
            this.tail = myNode;
            this.tail.setPrev(this.head);
            this.head.setNext(this.tail);
        } else {
            myNode.setPrev(this.tail);
            this.tail.setNext(myNode);
            this.tail = myNode;
        }

        addLength();
        return myNode;
    }

    public MyNode addNode(MyNode myNode, int index) {
        if(index < this.length - 1) {
            return null;
        } else if (index == 0) {
            addHead(myNode);
        } else if (index == this.length - 1) {
            addTail(myNode);
        } else {
            MyNode targetNode = this.head;
            for (int i = 0; i < index; i++) {
                targetNode = targetNode.getNext();
            }
            myNode.setPrev(targetNode);
            myNode.setNext(targetNode.getNext());
        }
        return myNode;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("My Linked List ");
        sb.append("\n Length: ");
        sb.append(this.length);
        sb.append("\n Members: ");
        MyNode currNode = this.head;
        sb.append(head);
        if(this.length > 1) {
            sb.append(", ");
        }
        for (int i = 0; i < this.length - 1; i++) {
            sb.append(currNode.getNext());
            if (i < this.length - 2) {
                sb.append(", ");
            }
            currNode = currNode.getNext();
        }
        return sb.toString();
    }
}
