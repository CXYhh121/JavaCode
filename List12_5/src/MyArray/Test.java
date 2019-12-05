package MyArray;

public class Test {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(3);
        //在数组末尾插入元素
        myArray.add(1);
        myArray.add(3);
        myArray.add(5);
        //在数组任意位置插入元素
        myArray.add(3,7);
        myArray.add(4,8);
        //获取数组任意位置的值
        myArray.get(4);
        //修改数组任意位置的值
        myArray.set(3,10);

        myArray.print();
        //删除数组某个指定位置的值
        myArray.remove(3);
        myArray.print();
    }
}
