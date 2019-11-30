package Java11_30;

//this
// this修饰属性
//   表示破坏就近取用原则，直接从类中访问同名成员变量
// this修饰方法
//   a.访问类中普通成员方法
//   b.访问类中的构造方法
//       I.this调用构造方法必须放在构造方法首行
//       II.this调用构造方法不能成环
// this表示当前对象引用
//   当前方法或属性是通过哪个对象调用的，this就指向此对象

class Person {
    int age;
    String name;
    String sex;


    public Person() {
        System.out.println("一个类的无参构造方法");
    }

    public Person(int age) {
        this.age = age;
        System.out.println("一个类的一个参数的构造方法");
    }
    public Person(int age,String name) {
        this(age);
        this.name = name;
        System.out.println("一个类的两个参数的构造方法");
    }
    public Person(int age, String name, String sex) {
        this(age,name);
        this.sex = sex;
        System.out.println("一个类的三个参数的构造方法");
    }
}

public class Testthis {
    public static void main(String[] args) {
        Person person = new Person(10,"张三","男");
        System.out.println(person.age);
        System.out.println(person.name);
        System.out.println(person.sex);
    }
}
