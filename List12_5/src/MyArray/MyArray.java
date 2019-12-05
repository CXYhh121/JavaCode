package MyArray;

import java.lang.reflect.Array;
import java.util.Arrays;

//public class MyArray {
//    private int size;
//    private int[] num;
//
//    public MyArray(int size, int[] num) {
//        this.size = size;
//        this.num = num;
//    }
//
//    //向动态数组中添加元素，默认向数组末尾添加
//    public void PushBack(int data) {
//
//    }
//
//    //向动态数组任意位置插入元素
//    public void Insert(int index,int data) {
//        //判断index的合法性
//        if(index < 0 || index > size) {
//            System.out.println("索引方法");
//            return;
//        }else if(index == size) {
//            //尾部添加
//        }else {
//            //此时在数组中间位置添加元素
//            if(size == num.length) {
//                //扩容
//                grow();
//            }else {
//
//            }
//        }
//    }
//
//    //修改指定目标的内容
//
//    //清空数组的值
//    public void clear() {
//        //Arrays.fill();
//    }
//
//    //打印数组内容
//    public void print() {
//        for (int i = 0; i < size; i++) {
//            System.out.print(num[i]);
//        }
//        System.out.println();
//    }
//
//    //需要有一个方法来检验index下标的合法性
//    //由于该方法只属于MyArray的内部调用，因此将其封装
//    private boolean rangeCheck(int index) {
//        if(index < 0 || index >= size) {
//            return false;
//        }
//        return true;
//    }
//
//    //内部数组的扩容方法
//    private void grow() {
//
//    }
//
//
//}



public class MyArray {
    int num[];
    int size;

    public MyArray(int length) {
        this.num = new int[length];
    }
    /**
     * 向动态数组中添加元素，默认向数组末尾添加
     * @param data
     */
    public void add(int data) {
        if (size == num.length) {
            num = Arrays.copyOf(num,num.length << 1);
        }
        num[size] = data;
        size ++;
    }

    /**
     * 向动态数组的任意位置插入元素
     * @param index 插入的目标索引
     * @param data
     */
    public void add(int index,int data) {
        // 判断index是否合法
        if (index < 0 || index > size) {
            // 只要index > size 都是非法的，因为数组无法取到数组长度的下标
            System.out.println("索引非法!");
            return;
        }
        // 数组尾插
        if (index == size) {
            add(data);
        }else {// 数组中间位置插入
            // 判断内部数组是否满载
            if (size == num.length) {
                //扩容
                grow();
                //num = Arrays.copyOf(num,num.length << 1);
            }
            // 将index以及之后元素向后搬移
            System.arraycopy(num,index,num,index + 1,size - index);
            num[index] = data;
            size ++;
        }
    }

    //获取数组指定位置的值
    public int get(int index) {
        if(rangeCheck(index)) {
            return num[index];
        }
        return -1;
    }


    //修改数组指定位置的值
    public boolean set(int index,int data) {
        if(rangeCheck(index)) {
            num[index] = data;
            return true;
        }
        return false;
    }

    //删除指定位置的值
    public boolean remove(int data) {
        for (int i = 0; i < size; i++) {
            if(num[i] == data) {
                //将找到的data值的index后的值向前移动，覆盖data值所在位置
                System.arraycopy(num,i+1,num,i,size-i-1);
                num[size] = 0;
                size--;
                return true;
            }
        }
        return false;
    }

    //清空数组
    public void clear() {
        //将数组中的值都赋值为0
        Arrays.fill(num,0,size,0);
    }

    // 返回动态数组长度
    public int size() {
        return size;
    }

    // 打印动态数组内容
    public void print() {
        // 数组永远无法取到数组长度下标，因此不能等于size
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + "、");
        }
        System.out.println();
    }

    //需要有一个方法来检验index下标的合法性
    //由于该方法只属于MyArray的内部调用，因此将其封装
    private boolean rangeCheck(int index) {
        if(index < 0 || index >= size) {
            return false;
        }
        return true;
    }

    //内部数组的扩容方法
    private void grow() {
        num = Arrays.copyOf(num,num.length << 1);
    }

}