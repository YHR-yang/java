package reflection;
/*
public class Main {
    public void hello(){
        System.out.println("hello from A");
    }
}
//第一种直接new调用函数
Main obj1 = new Main();
obj1.hello();
*/


import java.io.*;
import java.sql.DriverManager;

/*克隆方法
public class Main implements Cloneable{
    public void hello(){
        System.out.println("hello from A");
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String[] args) {
        Main obj2 =new Main();
        obj2.hello();

        Main obj3 = null;
        try {
            obj3 = (Main) obj2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        obj3.hello();
    }
}
 */

public class Main implements Serializable {
    private static final long serialVersionUID =1L;

    public void hello(){
        System.out.println("hello from C");
    }
    public static void main(String[] args) {
        Main obj4 = new Main();
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("data.obj"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.writeObject(obj4);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("data.obj"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Main obj5 = null;
        try {
            obj5 = (Main) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        obj5.hello();
    }
}
























