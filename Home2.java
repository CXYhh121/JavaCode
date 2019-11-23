import java.util.Random;
import java.util.Scanner;
public class Home2{
    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            int ret = getNumBinCount(num);
            System.out.println("num为" + num + ",该数字中二进制的个数为：" + ret);
        }
    }
    //写一个函数返回一个数中二进制的个数
    public static int getNumBinCount(int n){
        //用位运算
        //相邻的两个整数之间二进制的最后一位一定不同
        //将参数一直用相邻两个数进行&运算，知道该数变为0，计算&的次数，即为该数中二进制1的个数
        int count = 0;
        while(n > 0){
            n = n & (n-1);
        }
        return count;
    }*/

    public static void main(String[] args){
        Random random = new Random();
        int guess =  random.nextInt(100);
        System.out.println(guess);

        Scanner sc = new Scanner(System.in);
        System.out.println("please input one number:");
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            if(num < guess){
                System.out.println("small");
            }else if(num > guess){
                System.out.println("big");
            }else{
                System.out.println("success!");
            }
            System.out.println("please input one number:");
        }
    }

}