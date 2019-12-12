package List;

//双向链表

class DobuleNode {
    public int data;
    //前驱节点
    public DobuleNode prev;
    //后继节点
    public DobuleNode next;

    public DobuleNode(int data, DobuleNode prev, DobuleNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
public class LinkedList {
    private int size;
    private DobuleNode head;
    private DobuleNode last;

    //尾插
    public void addLast(int data) {
        DobuleNode node = new DobuleNode(data,null,null);
        if(head == null) {
            head = last = node;
            size++;
            return;
        }else {
            node.prev = last;
            last.next = node;
            last = node;
            size ++;
        }
    }
    //头插
    public void addFirst(int data) {
        DobuleNode node = new DobuleNode(data,null,null);
        if(head == null || head.next == null) {
            head = last = node;
            size ++;
            return;
        }else {
            node.next = head;
            head.prev = node;
            head = node;
            size ++;
        }
    }

    //任意位置插入
    public void addIndex(int index,int data) {
        if(index < 0 || index > size) {
            System.out.println("索引非法");
            return;
        }else if(index == size) {
            addLast(data);
        }else if(index == 0) {
            addFirst(data);
        }else {
            //中间位置插入
            DobuleNode node = new DobuleNode(data,null,null);
            //取得待插入节点的前驱节点
            DobuleNode prev = findNode(index - 1);
            node.prev = prev;
            node.next = prev.next;

            prev.next = node;
            node.next.prev = node;
            size ++;
        }
    }


    public void print() {
        DobuleNode x = head;
        while(x != null) {
            System.out.print(x.data + "、");
            x = x.next;
        }
    }


    //获得任意位置的值
    public int get(int index) {
        if(rangeCheck(index)) {
            DobuleNode node = findNode(index);
            return node.data;
        }
        return -1;
    }

    //删除指定位置的节点
    public void remove(int data) {
        DobuleNode x = head;
        while (x != null) {
            if (x.data == data) {
                // 删除x
                //unlink(x);
                break;
            }else {
                x = x.next;
            }
        }
    }

    public void removeAll(int data) {
        DobuleNode x = head;
        while (x != null) {
            if (x.data == data) {
                // 删除x
                DobuleNode next = x.next;
                //unlink(x);
                x = next;
            }else {
                x = x.next;
            }
        }
    }

    //取得index的位置的节点
    private DobuleNode findNode(int index) {
        //
        if(index < (size >> 1)) {
            //从头向后遍历
            DobuleNode x = head;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        }else {
            DobuleNode x = last;
            for (int i = 0; i < index; i++) {
                x = x.prev;
            }
            return x;
        }
    }

    private boolean rangeCheck(int index) {
        if(index < 0 || index > size) {
            System.out.println("索引非法");
            return false;
        }
        return true;
    }

}
