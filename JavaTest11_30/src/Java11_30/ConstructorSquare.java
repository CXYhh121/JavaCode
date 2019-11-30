package Java11_30;


//构造代码块
//定义在类中不佳任何修饰符的代码块，称为构造块
//构造块优先于构造方法执行，并且产生几个对象就调用几次构造块
//一半也可用构造块完成属性的初始化操作
public class ConstructorSquare {
    int age = 0;
    String name = "";

    public ConstructorSquare() {
        age = 20;
        name = "lisi";
        System.out.println("23232");
    }

    {
        //2.构造代码块
        age = 40;
        name = "df";
        System.out.println("333333");
    }

    public static void main(String[] args) {
        ConstructorSquare constructorSquare = new ConstructorSquare();
        System.out.println(constructorSquare.age);
        System.out.println(constructorSquare.name);
    }

}
