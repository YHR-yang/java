package 课后作业;

/*
//1.编写斌个测试一个代表地址的Address类，，，地址信息有国家、省份、城市、街道、邮编等组成，并可以返回完整地址信息
class Address{
    private String name;
    private int age;
    private String Gender;
    private String Country;
    private String province;
    private String city;
    private String street;
    private int youbian;

    public Address(String name,int age,String Gender,String Country,String province,String city,String street,int youbian){
        this.name=name;
        this.age=age;
        this.Gender=Gender;
        this.Country=Country;
        this.province=province;
        this.city=city;
        this.street=street;
        this.youbian=youbian;
    }
    public String getInfo(){
        return "姓名："+this.name+"\n年龄："+this.age+"\n性别："+this.Gender+"\n国家："+this.Country+"\n省份："+this.province+"\n城市："+this.city+"\n街道："+this.street+"\n邮编："+this.youbian;
    }
}
public class 类与对象 {
    public static void main(String[] args) {
        Address address = new Address("杨浩然",18,"男","中国","安徽省","巢湖市","亚父街道",238000);
        System.out.println(address.getInfo());
    }
}


 */



/*
//定义并测试一个代表员工的Employee类。员工属性包括编号、姓名、基本薪水、薪水增长率，还包括计算薪水增长额及计算增长后的工资总额的操作方法
class Employee{
    private int number;
    private String name;
    private int pay;
    static  int rate=2;
    static  int increase=2000;
    private int Total;

    public Employee(int number,String name,int pay,int Total){
        this.number=number;
        this.name=name;
        this.pay=pay;
        this.Total=Total;
    }
    public String getInfo(){
        return "编号："+this.number+"、姓名："+this.name+"、基本薪水："+this.pay+"元"+"、薪水增长率："+this.rate+"%"+"、薪水增长额："+this.increase+ "元"+"、薪水总额："+this.Total+"元";
    }
}
public class 类与对象 {
    public static void main(String[] args) {
        Employee employeeA = new Employee(001,"杨浩然",8000,120000);
        Employee employeeB = new Employee(002,"杨丽萍",8000,120000);
        Employee employeeC = new Employee(003,"杨龙",8000,120000);
        Employee employeeD = new Employee(004,"郭德霞",8000,120000);
        Employee employeeE = new Employee(005,"彭永真",8000,120000);
        System.out.println(employeeA.getInfo());
        System.out.println("\n");
        System.out.println(employeeB.getInfo());
        System.out.println("\n");
        System.out.println(employeeC.getInfo());
        System.out.println("\n");
        System.out.println(employeeD.getInfo());
        System.out.println("\n");
        System.out.println(employeeE.getInfo());
    }
}


 */


/*
//3.设计一个Dog类，有名字、颜色、年龄等属性，定义构造法来初始化类的这些属性 定义方法输出Dog类信息，编写应用程序使用Dog类。
class Dog{
    private String name;
    private String color;
    private int age;
    public Dog(){}
    public Dog(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    public String getInfo(){
        return "狗的名字:"+this.name+"\n狗的颜色:" +this.color+"\n狗的年龄："+this.age;
    }
}
public class 类与对象 {
    public static void main(String[] args) {
        Dog dog = new Dog("小黑","黑色",2);
        System.out.println(dog.getInfo());
    }
}

 */

/*
//4、构造一个银行账户类，类的构成包括以下内容：
//数据成员用户的账户名称、用户的账户余额（private数据类型）
//方法包括开户（设置账户名称及金额），利用构造方法完成
//查询余额
class Account{
    private String name;
    private int balance;

    public Account(){}
    public Account(String name,int balance){
        this.name=name;
        this.balance=balance;
    }
    public String getInfo(){
        return "账户名称:"+this.name+"\n账户余额:"+this.balance+"元";
    }
}
public class 类与对象 {
    public static void main(String[] args) {
    Account account = new Account("杨浩然",10000);
    System.out.println(account.getInfo());
    }
}


 */


/*
//5.设计一个表示用户的user类，类中的变量有用户名、口令和记录用户个数的变量，定义类的3个构造方法（无参、为用户名赋值、为用户名和口令赋值），获取和设置口令的方法和返回类信息的方法
class User{
    private String name;
    private int Password;
    private int number;

    public User(){}
    public User(String name,int Password,int number){
        this.name=name;
        this.Password=Password;
        this.number=number;
    }
    public String getInfo(){
        return "用户名:"+this.name+"、用户口令："+this.Password+"、用户个数："+this.number;
    }
}
public class 类与对象 {
    public static void main(String[] args) {
        User userA = new User("杨浩然",341402,01);
        User userB = new User("杨丽萍",123456,02);
        System.out.println(userA.getInfo());
        System.out.println(userB.getInfo());
    }
}


 */



//6.声明一个图书类，其数据成员为书名，编号（利用静态变量实现自动编号）、书价，并拥有静态数据成员册数、记录图书的总册数，在构造方法中利用此静态变量为对象的编号赋值，在主方法定义多个对象，并求出总册数
class Book{
    private int bid;    //编号
    private String title;   //书名
    private double price;    //价格
    private static int count=1;
    public Book(String title,double price){
        this.bid=count++;
        this.title=title;
        this.price=price;
    }
    public String getInfo(){
        return "图书编号"+this.bid+"、图书书名："+this.title+"、图书价格："+this.price;
    }
    public static  int getCount(){
        return count;
    }
}
public class 类与对象 {
    public static void main(String[] args) {
        Book b1 = new Book("java",89.5);
        Book b2 = new Book("python",25.6);
        System.out.println(b1.getInfo());
        System.out.println(b2.getInfo());
    }
}





















