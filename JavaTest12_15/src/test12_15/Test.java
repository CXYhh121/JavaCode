package test12_15;

import java.util.ArrayList;
import java.util.Date;


//包的概念以及使用
//1.避免类同名，在不同包下可以出现同名文件
//2.方便使用第三方的类库以及方法
//
//包的导入与声明
//若要将类放入指定包中，使用package 包名称
//每当有一个子包时，使用.分隔符
//package bit.java30.test
//
//导入
//import 包名称.类名称

//若同时使用同一个包中的多个类，可以使用通配符*来将包中所有类一次性导入
//import java.util.*;

//静态导入，只导入Math类静态属性及方法
//import static java.lang.Math.*;
//import static java.lang.System.*;
//静态导入之后，使用时无需再添加类名
//int result = min(a,b);
//out.println(result);

//包访问权限
//当方法或属性使用包访问权限时，在同一个包下(没有嵌套)的所有类或方法可以使用
//不同包不可以使用(即使在子包中，)

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        ArrayList list = new ArrayList();
    }


}
