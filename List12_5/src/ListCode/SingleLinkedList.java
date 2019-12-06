package ListCode;


class Node {
    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class SingleLinkedList {
    //头节点
    private Node head;
    private int size;
    //尾节点
    private Node last;
    private Node first;


    public void add(int data) {
        addLast(data);
    }

    //t头插法
    public void addFirst(int data) {
        Node node = new Node(data,null);
        if(first == null) {
            first = last = node;
            size++;
            return;
        }
        node.next = first;
        first = node;
        size++;
    }

    //尾插法
    public void addLast(int data) {
        //生成一个新的节点
        Node node = new Node(data,null);
        //此时链表还是空的，没有一个节点
        if(head == null) {
            last = first = node;
            size++;
            return;
        }
        last.next = node;
        last = node;
        size++;
    }

    //遍历一个链表
    public void print() {
        Node temp = first;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

//    public SingleLinkedList(int data, SingleLinkedList next) {
//        this.data = data;
//        this.next = next;
//    }
//
//    public int getData() {
//        return data;
//    }
//
//    public void setData(int data) {
//        this.data = data;
//    }
//
//    public SingleLinkedList getNext() {
//        return next;
//    }
//
//    public void setNext(SingleLinkedList next) {
//        this.next = next;
//    }