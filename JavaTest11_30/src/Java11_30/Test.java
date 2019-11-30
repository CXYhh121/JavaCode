package Java11_30;

//面向对象的三大特性
//封装,保护属性，降低复杂程度
//private实现封装处理
//private：被private修饰的属性或方法表示属于类的私有域
//出了此类其他类根本不知道，也无法访问
//getter域setter方法
//当类中属性被private封装后，若要在类的外部访问private属性，需要提供getter与setter方法

//Java编码规范：
//1.类中所有属性(成员变量)一半都使用private封装，根据具体提供对外getter余setter方法访问属性
//2.类中的所有方法一般使用public访问
//补充知识点：
//1.toString():将任意类的对象转为字符串,展示类中的属性信息
// 任意一个类中若没有提供toString()方法，则print输出其地址
//若提供tostring()，则print函数输出其tostring()的返回值
//2.匿名对象，没有任何引用关联的对象,只能使用一次


class Accout {
    //账户ID
    private int id;
    //密码
    private String password;
    //余额
    private double sal;


//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword() {
//        //验证密码
//        System.out.println("请输入原密码：");
//        Scanner scanner = new Scanner(System.in);
//
//    }





    //control+enter
    @Override
    public String toString() {
        return "Accout{" +
                  "id=" + id +
                  ", password='" + password + '\'' +
                  ", sal=" + sal +
                  '}';
    }
}

public class Test {
    public static void main(String[] args) {

    }
}


