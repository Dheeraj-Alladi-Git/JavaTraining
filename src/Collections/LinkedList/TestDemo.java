package Collections.LinkedList;

class Node{

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class TestDemo {

    Node head;

    //add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else {
            Node currNode = head;
            while(currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    //Delete First
}
