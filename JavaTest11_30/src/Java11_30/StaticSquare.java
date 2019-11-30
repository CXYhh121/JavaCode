package Java11_30;
//1.普通代码块
//2.定义在类中不佳任何修饰符的代码块，称为构造块
//构造块优先于构造方法执行，并且产生几个对象就调用几次构造块
//一般也可用构造块完成属性的初始化操作
//3.静态代码块，定义在类中，用static关键字修饰的称为静态代码块
//静态代码块优先于构造块执行，无论多少对象产生，只执行一次，在类加载时执行
//主类中的静态代码块优先于主方法执行

class TestSquare {
    public TestSquare() {
        System.out.println("1.TestSquare的构造方法....");
    }

    {
        System.out.println("2.TestSquare的构造代码块...");
    }

    static {
        System.out.println("3.TestSquare的静态代码块...");
    }
}

public class StaticSquare {
    public StaticSquare() {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    static {
        System.out.println("3");
    }
    public static void main(String[] args) {
        //System.out.println("4");
        //StaticSquare staticSquare = new StaticSquare();
        TestSquare testSquare = new TestSquare();
    }
}
