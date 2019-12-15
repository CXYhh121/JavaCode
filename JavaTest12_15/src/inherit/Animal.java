package inherit;


//继承：强调代码复用
//当若干类之间出现"is a"关系时，表示此类之间可以发生继承关系

//若使用继承 extends
//class Dog extends Animal
//class Cat extends Animal
//表示此时Cat与Dog是Animal子类(派生类)，Animal称为父类(超类)

//当一个类继承另一个父类时，可以直接使用父类中的属性和方法(public protected权限)
//当一个方法或属性使用protected后，表示在同一个包下所有类可以访问，不同包的子类可以使用

//当使用子类构造方法产生子类对象，首先调用父类的构造方法

//367215421548

public class Animal {
    //此时name为继承权限
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }

//    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.name = "pig";
//        animal.eat("糠");
//
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        dog.name = "泰迪";
//    }

}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
}

