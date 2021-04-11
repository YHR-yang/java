package yhr;

import java.nio.channels.Channel;

/*
class Person{

    private String name;
    private int age;
    public Person(){            //构造方法重载（无参构造）
        System.out.println("***一个新的peron类对象实例化了。 ***");
    }
    public Person(String name){             //构造方法重载（单参构造）
        this();         //调用本类无参构造
        this.name=name;         //设置name属性
    }
    public Person(String name,int age){     //构造方法虫子啊（双参构造）
        this(name);                         //调用本类单参构造
        this.age=age;               //设置age属性内容
    }
    public void tell(){
        System.out.println("姓名："+this.name+"、年龄："+this.age);
    }
    public static class this222{
        public static void main(String[] args) {
            Person per =new Person("张三",12);
            per.tell();
        }
    }
}
*/
/*
class Emp{
    private long empno;         //定义属性内容
    private String ename;
    private String dept;
    private double salary;
    public Emp(){           //无参构造
        this(1000,"无名氏",null,0.0);          //调用四参构方法
    }
    public Emp(long empno){     //无参构造
        this(empno,"新员工","未定",0.0);     //调用四参构造
    }
    public Emp (long empno,String ename,String dept){       
        this(empno,ename,dept,2055.00);
    }
    public Emp(long empno,String ename,String dept,double salary){
        this.empno=empno;               //设置各个属性内容
        this.ename=ename;
        this.dept=dept;
        this.salary=salary;
    }
    public String getInfo(){                //返回完整雇员信息
        return "雇员编号："+this.empno+
                "\n雇员姓名："+this.ename+
                "\n所在部门："+this.dept+
                "\n基本工资："+this.salary;
    }
}
public class this222 {
    public static void main(String[] args) {
        Emp emp = new Emp(7369L,"杨浩然","董事长",10000.00);
        System.out.println(emp.getInfo());                  //输出信息
    }
}
*/

//观察当前对象
/*
 class Message{
     public void printThis(){
         System.out.println("【Message类】 this="+this);
     }
}
public class this222 {
    public static void main(String[] args) {
        Message msgA=new Message();
        System.out.println("【主类】msgA ="+msgA);
        msgA.printThis();
        System.out.println("----------------------");
        Message msgB=new Message();
        System.out.println("【主类】msgB="+msgB);
        msgB.printThis();
    }
}

 */
/*
class Person{
    private String name;
    private int age;
    public void tell(){
        System.out.println("姓名 ："+name+"、年龄："+age);
    }
    public void setName(String tempName){
        name=tempName;
    }
    public void setAge(int tempAge){
        if (tempAge>0 && tempAge<120){
            age=tempAge;
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class this222 {
    public static void main(String[] args) {
        Person per= new Person();
        per.setAge(18);
        per.setName("金书记");
        per.tell();
    }
}

 */

























