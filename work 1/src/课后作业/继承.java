package 课后作业;


/**
 * 夏然
 * github.com/YHR-yang
 */

/*1.
class Person{
    private String name;
    private String addr;
    private String sex;
    private int age;
    public Person(){}
    public Person(String name,String addr){
        this(name,addr,"男",0);
    }
    public Person(String name,String addr,String sex,int age){
        this.name=name;
        this.age=age;
        this.addr=addr;
        this.sex=sex;
    }
    public String getInfo(){
        return "姓名："+this.name+"、年龄："+this.age+"、性别："+this.sex+"、地址："+this.addr;
    }
}
class Student extends Person{
    private double math;
    private double english;
    public Student(){}
    public Student(String name,String addr){
        super(name,addr);
    }
    public Student(String name,String addr,String sex,int age,double math,double english){
        super(name,addr,sex,age);
        this.english=english;
        this.math=math;
    }
    public String getInfo(){
        return super.getInfo()+"、数学成绩："+this.math+"、英语成绩："+this.english;
    }
}
public class 继承 {
    public static void main(String[] args) {
        Student stu = new Student("张三","安徽","男",20,150,60);
        System.out.printf(stu.getInfo());
    }
}

 */

    /*
class Employee{
    private String name;
    private String sex;
    private int age;
    public Employee(){}
    public Employee(String name,String sex,int age){
        this.age=age;
        this.sex=sex;
        this.name=name;
    }
    public String getInfo(){
        return "姓名："+this.name+"、性别："+this.sex+"、年龄："+this.age;
    }
}
class Management extends Employee{
    private String job;
    private double income;
    public Management(){}
    public Management(String name,String sex,int age,String job,double income){
        super(name,sex,age);
        this.job=job;
        this.income=income;
    }
    public String getInfo(){
        return "【管理层】："+super.getInfo()+"职务："+this.job+"" + "、年薪："+this.income;
    }
}
class Staff extends Employee{
    private String dept;
    private double salary;
    public Staff(){}
    public Staff(String name,String sex,int age,String dept,double salary){
        super(name,sex,age);
        this.dept=dept;
        this.salary=salary;
    }
    public String getInfo(){
        return "【职员】："+super.getInfo()+"所属部门："+this.dept+"、月薪："+this.salary;
    }
}

public class 继承 {
    public static void main(String[] args) {
    Management man =new Management("杨浩然","男",18,"java程序员",12000);
    Staff sta = new Staff("彭永真","男",21,"计算机与科学系",12000);
        System.out.printf(man.getInfo());
        System.out.printf("\n");
        System.out.printf(sta.getInfo());
    }
}

     */




































