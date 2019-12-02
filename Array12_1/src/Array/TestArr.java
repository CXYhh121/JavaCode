package Array;

//Java数组的定义与应用

//1.数组的定义



//2.数组的使用：获取数组长度和访问数组元素
public class TestArr {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3,4, 5};
//        System.out.println(arr[0]);
//        int length = arr.length;
//        System.out.println(length);
//    }

    //3.遍历数组的两种方式
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//
//        //1.for循环遍历数组
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//        System.out.println();
//
//        //2.for-each遍历数组
//        for(int e : arr) {
//            System.out.print(e);
//        }
//        System.out.println();
//    }

    //4.数组作为方法的参数
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        //1.打印数组中的内容，printArray
//        printArray(arr);
//    }
//
//    public static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//        System.out.println();
//    }


    //理解引用类型
//    public static void main(String[] args) {
//        int num = 0;
//        func(num);
//        System.out.println("num = " + num);
//    }
//    public static void func(int x) {
//        x = 10;
//        System.out.println("x = " + x);
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        func(arr);
//        System.out.println("arr[0] = " + arr[0]);
//    }
//    public static void func(int[] a) {
//        a[0] = 10;
//        System.out.println("a[0] = " + a[0]);
//    }


    //5.数组作为方法的返回值
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        //写一个方法将数组中的每个元素乘2，但不改变原数组的值
//        String str1 = arr2Str(arr);
//        System.out.println(str1);
//        int[] newArr = transform(arr);
//        String str2 = arr2Str(newArr);
//        System.out.println(str2);
//    }
//    public static int[] transform(int[] arr) {
//        int[] newArr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i] * 2;
//        }
//        return newArr;
//    }
//
//    //将数组转换为字符串
//    public static String arr2Str(int[] arr) {
//        String str = "[";
//        for (int i = 0; i < arr.length; i++) {
//            str += arr[i];
//            if(i == arr.length - 1) {
//                str += "]";
//            }else {
//                str += ", ";
//            }
//        }
//        return str;
//    }

    //数组的练习
    //1.找出数组中的最大元素
//    public static void main(String[] args) {
//        int[] arr = {5,2,8,4,10,3,7};
//        int maxValue = findMaxValue(arr);
//        System.out.println("maxValue = " + maxValue);
//    }
//
//    public static int findMaxValue(int[] arr) {
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }

    //2.求数组元素的平均值
//    public static void main(String[] args) {
//        int[] arr = {6,3,5,7,9,10,5};
//        double avg = avgValue(arr);
//        System.out.println("avg = " + avg);
//    }
//
//    public static double avgValue(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        double avg = (double)sum/(double)(arr.length);
//        return avg;
//    }
    //3.查找数组中指定元素(顺序查找)
//    public static void main(String[] args) {
//        int[] arr = {3,6,7,8,9,3,10,15,4};
//        System.out.println("target的下标 = " + findValue(arr,10));
//    }
//
//    public static int findValue(int[] arr,int target) {
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == target) {
//                return i;
//            }
//        }
//        //循环结束，没有找到，返回-1
//        return -1;
//    }

    //查找数组的指定元素(二分查找)
    public static void main(String[] args) {
        int[] arr = {3,6,7,8,9,3,10,15,4};
        System.out.println("target的下标：" + binarySearch(arr,10));
    }

    public static int binarySearch(int[] arr,int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = left + (right - left)/2;
            if(arr[mid] > target) {
                //如果数组中间的值大于目标值，就到数组左侧区间找
                right = mid - 1;
            }else if(arr[mid] < target){
                //如果数组中间的值小于目标值，就到数组右侧区间找
                left = mid + 1;
            }else {
                //相等，找到了
                return mid;
            }
        }
        //循环结束，找不到
        return -1;
    }

}



