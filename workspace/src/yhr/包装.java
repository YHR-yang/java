package yhr;
/*
class Person{           //定义一个person类
    private String name;        //成员属性
    private int age;

    public void tell(){
        System.out.println("姓名："+name+"、年龄"+age);
    }

    public void setName(String setName) {       //设置name属性
        name=setName;
    }
    public void setAge(int tempAge) {           //设置age属性
        if (tempAge>0&& tempAge<250){           //如果有需要则可以追加一些验证逻辑
            age =tempAge;
        }
    }
    public String getName() {               //获取name属性内容
        return name;
    }
    public int getAge() {                   //获取age属性内容
        return age;
    }
}
public class 包装{
    public static void main(String[] args) {
        Person per =new Person();           //声明并实例化对象
        per.setName("张三");
        per.setAge(18);
        per.tell();         //方法调用

    }
}
*/


/*定义构造方法为属性初始化
class Person {
    private String name;
    private int age;
    public Person(String tempName,int tempAge){    //构造方法
        name= tempName;                 //name属性初始化
        age=tempAge;                    //age属性初始化
    }
    public void tell(){
        System.out.println("姓名："+name+"、年龄"+age);
    }
}
public class 包装 {
    public static void main(String[] args) {
        Person per = new Person("张三",18);       //声明并实例化对象
         （new Person("张三",18).tell();     //使用匿名对象进行操作，只能使用一次   ）
        per.tell();                     //方法调用
    }
}
*//*
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.setName(name);         //调用本类setName（）方法
        setAge(age);            //不适用this.方法（）   也表示调用本类方法
    }
    public void tell(){
        System.out.println("姓名："+this.name+"、年龄："+this.age);        //使用this明确文本属性
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class 包装{
        public static void main(String[] args) {
            Person per =new Person("张三",12);
            per.tell();
        }
    }
}
*/







































