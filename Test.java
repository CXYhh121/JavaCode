import java.util.Scanner;

import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        //int num = 10;
        //String str = "hello";
        //String str1 = "world";
        //byte a = 10;
        //byte b = 10;
        //byte c = a + b;
        //int num = 123;
        //String str = num + "";

        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        //获取一个字符串
        String name = sc.nextLine();
        //获取一个整数
        int age = sc.nextInt();
        // 获取一个小数
        double score = sc.nextDouble();
        System.out.println("name is :" + name + "age is :" + age + "score is :" + score);
    }
}