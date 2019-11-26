public class Home3{
    public static void main(String[] args){
        for(int i = 0;i < 10;i++){
            int ret = fibo(i);
            System.out.println("ret = " + ret);
        }
    }

    //递归求解
    public static int fibo(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    //非递归求解
    public static int fibo1(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            int last1 = 1;
            int last2 = 1;
            int cur = 0;
            for(int i = 3;i <=n;++i){
                cur = last1 + last2;
                last2 = last1;
                last1 = cur;
            }
            return cur;
        }
    }
}