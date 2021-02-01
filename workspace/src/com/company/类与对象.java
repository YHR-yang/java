package com.company;
class Person{               //定义一个类（Person)
    String name;       //定义一个成员属性
    int age;            //定义一个成员属性

    public void tell(){
        System.out.println("姓名:"+name+"、年龄"+age);
    }
}
public class 类与对象{
    public static void main(String[] args) {
        /*
        //引用传递
        Person per1 =new Person();    //声明并实例化对象
        per1.name ="张三";                //为属性赋值
        per1.age = 18;              //为属性赋值
        Person per2 =per1;              //引用传递
        per2.age=80;                    //修改age属性内容
        per1.tell();                    //进行方法的调用
                 */

        /*
        //类引用数据类型使用分析
        Person per = new Person();      //声明并实例化对象
        per.name ="张三";
        per.age =18;
        per.tell();
                */

        /*
        //对象实例化
        Person per = null;      //声明对象
        per = new Person();     //实例化对象
        per.name="张三";         //成员属性赋值
        per.age=18;             //成员属性赋值
        per.tell();             //方法调用
                */

        //通过方法实现引用传递
        Person per = new Person();      //声明并实例化对象
        per.name = "张三";
        per.age = 18;
        change(per);        //等价于change(Person temp);
        per.tell();          //方法调用
    }
    public static void change(Person temp){         //temp 接受 Person类型
        temp.age=80;              //修改对象属性
    }
}











