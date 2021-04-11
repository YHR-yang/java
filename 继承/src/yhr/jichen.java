package yhr;



/*子类对象实例化，观察无参构调用
class Person{
    public Person(){
        System.out.println("【Person父类】调用person父类构造实例化对象（public Person)");
    }
}
class Student extends Person{
    public Student(){
        System.out.println("【Student子类】调用Student子类构造实例化对象（publi Student）");
    }
}
public class jichen {
    public static void main(String[] args) {
        Student stu = new Student();
    }
}

 */


/*不允许直接访问非私有操作

class Person{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){            //获取私有属性
        return this.name;
    }
}
class Student extends Person{
    public Student(String name){        //子类构造
        setName(name);                  //调用父类构造
    }
    public String getInfo(){
        return "姓名："+getName();             //间接访问
    }
}
public class jichen {
    public static void main(String[] args) {
        Student stu = new Student("李双双");       //实例化
        System.out.println(stu.getInfo());          //调用子类
    }
}


 */

/*
class Channel{
    public void connect(){      //父类定义方法
        System.out.println("【Channel类】进行资源的连接");
    }
}
class DatabaseChannel extends Channel{              //要进行数据库连接
    public void connect(){
        System.out.println("【DatabaseChannel子类】进行数据库资源连接");
    }
}
public class jichen {
    public static void main(String[] args) {
        DatabaseChannel channel = new DatabaseChannel();        //实例化子对象
        channel.connect();      //调用被覆写过的方法
    }
}

 */

/*子类调用父类已被覆写过的方法
class Channel{
    public void connect(){
        System.out.println("【Chanenl父类】进行资源连接");
    }
}
class DatabaseChannel extends Channel{
    public void connect(){
    //子类调用父类中被覆写过的方法，如果此时没用使用super方法的的形式定义
    /这样就相当于this方法调用本类
        super.connect();
        System.out.println("【DatabaseChannel子类】进行数据库资源的连接");
    }
}
public class jichen {
    public static void main(String[] args) {
        DatabaseChannel databaseChannel = new DatabaseChannel();
        databaseChannel.connect();
    }
}


 */


/*观察private权限下的方法覆写
class Channel{
    private void connect(){
        System.out.println("【Channel父类】进行资源的连接");
    }
    public void handle(){
        this.connect();
    }
}
class DatabaseChannel extends Channel{
    public void connect(){
        System.out.println("【DatabaseChannel子类】进行数据库资源的连接");
    }
}
public class jichen {
    public static void main(String[] args) {
        DatabaseChannel channel = new DatabaseChannel();
        channel.connect();
    }
}

 */


class Message{
    public void print(){
        System.out.println("www.mldn.com");
    }
}
class DataMessage extends Message{
    public void print(){
        System.out.println("MLDN数据库连接信息...");
    }
}
class NetMessage extends Message{
    public void print(){
        System.out.println("YOOK网络信息...");
    }
}
public class jichen {
    public static void main(String[] args) {
        Message msgA = new DataMessage();
        Message msgB = new NetMessage();
        msgA.print();
        msgB.print();
    }
}
















































