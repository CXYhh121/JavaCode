import java.util.Scanner;

public class Home{
    //1.判断一个数是否是素数
    /** public static void main(String[] args){
        System.out.println("请输入一个数：");
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            boolean issushu = true;
            int num = sc.nextInt();
            if(num <= 1){
                issushu = false;
                //System.out.println("不是素数");
            }
            for(int i = 2;i < num;i++){
                if(num % i == 0){
                    //不是素数
                    issushu = false;
                    //System.out.println("不是素数");
                    break;
                }
            }
            if(issushu == true){
                System.out.println("是素数");
            }else{
                 System.out.println("不是素数");
            }
        }
    }*/

    //2.打印1-100之间所有的素数
    /*public static void main(String[] args){
        for(int i = 2;i <= 100;i++){
            boolean issushu = true;
            //判断从i - i-1
            for(int j = 2;j < i;++j){
                if(i % j == 0){
                    issushu = false;
                    break;
                }
            }
            if(issushu == true){
                System.out.print(i + " ");
            }else{
                continue;
            }
        }
    }*/

    //3.打印乘法口诀表
    /*public static void main(String[] args){
        for(int i = 1;i <= 9;i++){
            for(int j = 1;j <= i;++j){
                System.out.print(j+"*"+i+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }*/

    //4.欧几里得算法求解两数的最大公约数


    /*public static void main(String[] args){
        //1! + 2 ! + 3! + .....
        int sum = 0;
        for(int i = 1; i <= 5;++i){
            int tmp = 1;
            for(int  j = 1;j < i;j++){
                tmp *= j;
            }
            sum += tmp;
        }
        System.out.println(sum);
    }*/

    public static void main(String[] args){
        int a = 10;
        int b = 20;

        //调用方法
        int result = add(a,b);
        System.out.println(result);
        //test();
        int[] num = new int[] {10,20};
        swap(num);
        System.out.println(num[0] + " " + num[1]);
    }

    //声明一个方法来实现两个整数相加
    public static int add(int x,int y){
        return x + y;
    }

    //不带返回值的方法
    public static void test(){
        System.out.println("Hello world");
    }
    public static void swap(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

}