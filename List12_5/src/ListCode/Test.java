package ListCode;

public class Test {
    public static void main(String[] args) {
        SingleLinkedList s1 = new SingleLinkedList();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.print();



//        //生成每个节点
//        SingleLinkedList s1 = new SingleLinkedList(1,null);
//        SingleLinkedList s2 = new SingleLinkedList(2,null);
//        SingleLinkedList s3 = new SingleLinkedList(3,null);
//
//
//        //将第二个节点挂接在第一个节点之后
//        s1.setNext(s2);
//        s2.setNext(s3);
//
//        //如何遍历这个链表结构
//        SingleLinkedList temp = s1;
//        while(temp != null) {
//            System.out.println(temp.getData());
//            //继续向下一个节点走
//            temp = temp.getNext();
//        }
    }
}
