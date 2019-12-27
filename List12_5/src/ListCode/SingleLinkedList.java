package ListCode;


class Node {
    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class SingleLinkedList {
    //头节点
    //private Node head;
    private int size;
    //尾节点
    private Node last;
    private Node first;

    public Node getFirst() {
        return first;
    }

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
        if(first == null) {
            last = first = node;
            size++;
            return;
        }
        last.next = node;
        last = node;
        size++;
    }


    //在链表任意一个索引出插入一个新的节点
    public void addIndex(int index,int data) {
        if(index < 0 || index > size) {
            System.out.println("索引非法！");
            return;
        } else if (index == size) {
            //尾插法
            addLast(data);
        } else if(index == 0) {
            addFirst(data);
        } else {
            //中间插入节点
            //产生新节点等待插入
            Node newNode = new Node(data,null);
            //需要找到待插入位置的前驱节点
            Node prev = getIndexNode(index - 1);
            //将新节点尾插入prev节点的后方
            newNode.next = prev.next;
            prev.next = newNode;
            size++;
        }
    }


    //根据用户传入的index获取节点值
    public int getNode(int index) {
        if(rangeCheck(index)) {
            Node node = getIndexNode(index);
            return node.getData();
        }
        return -1;
    }

    //根据用户传入的index修改对应位置的值
    public int setNode(int index,int data) {
        if(rangeCheck(index)) {
            Node node = getIndexNode(index);
            node.data = data;
        }
        return -1;
    }

    //查询链表中是否有指定内容的节点
    public boolean contains(int data) {
        Node temp = first;
        while(temp != null) {
            if(temp.getData() == data) {
                return true;
            }
        }
        return false;
    }


    //删除第一个值为data的节点
    public void remove(int data) {
//        if(first.getData() == data) {
//            first = first.next;
//            size--;
//        }else {
//            //需要找到待删除的节点的前驱节点
//            Node prev = first;
//            while(prev.next != null) {
//                if(prev.next.getData() == data) {
//                    //此时prev恰好就是待删除节点的前驱节点
//                    prev.next = prev.next.next;
//                    size--;
//                    return;
//                }else {
//                    prev = prev.next;
//                }
//            }
//        }
        //引入一个虚拟头节点
        Node dummyHead = new Node(data-1,null);
        dummyHead.next = first;
        Node temp = dummyHead;
        while(temp.next != null) {
            if(temp.next.getData() == data) {
                //此时temp就是待删除节点的前驱节点
                temp.next = temp.next.next;
                size--;
                return;
            }else {
                temp = temp.next;
            }
        }
        first = dummyHead.next;
    }


    //删除所有只为data的节点
    public void removeAll(int data) {
//        while (first != null && first.getData() == data) {
//            first = first.next;
//            size--;
//        }
//        //此时头节点一定不是要删除的节点
//        if(first == null) {
//            return;
//        }else {
//            //此时头节点一定不是要删除的节点,并且链表中还有待删除的节点
//            Node prev = first;
//            while (prev.next != null) {
//                if(prev.next.getData() == data) {
//                    prev.next = prev.next.next;
//                    size--;
//                }else {
//                    prev = prev.next;
//                }
//            }
//
//        }
        Node dummyHead = new Node(data-1,null);
        dummyHead.next = first;
        Node prev = dummyHead;
        while(prev.next != null) {
            if(prev.next.getData() == data) {
                prev.next = prev.next.next;
                size--;
            }else {
                prev = prev.next;
            }
        }
        first = dummyHead.next;
    }

    //遍历一个链表
    public void print() {
        Node temp = first;
        while(temp != null) {
            System.out.print(temp.getData() + "、");
            temp = temp.getNext();
        }
        System.out.println();
    }
    //回文链表
    //原链表 1->2->3->4->5
    //回文链表 5->4->3->2->1

    public Node reverse(Node head) {
        if(head == null || head.next == null)
            return head;
        //当前链表不为空，遍历当前链表，产生新的节点头插另一个链表
        Node newHead = new Node(head.data,null);
        while(head.next != null) {
            //产生新节点，头插入新链表
            Node node = new Node(head.next.data,null);
            //addFirst(node.data);
            node.next = newHead;
            newHead = node;
            head = head.next;
        }
        return newHead;
    }

    //根据用户传入的index值取得对应的Node节点
    private Node getIndexNode(int index) {
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //检查index的合法性
    private boolean rangeCheck(int index) {
        if(index < 0 || index >= size) {
            System.out.println("索引非法！");
            return false;
        }
        return true;
    }
}