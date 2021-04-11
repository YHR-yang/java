package 课后作业;

/**
 * 夏然
 * github.com/YHR-yang
 */
/*
//定义一个classname接口，接口中只有一个抽象方法getclassname（），设计一个类Company，
//给类实现接口ClassName中的方法getClassName（），功能是获取该类的类名称
interface IClassName{
    public String getClassName();
}
class Company implements IClassName{
    public String getClassName(){
        return "Company";
    }
}
public class 抽象类与接口 {
    public static void main(String[] args) {
        IClassName ica = new Company();
        System.out.println(ica.getClassName());
    }
}
*/


    /*
//定义类shape，用来表示一般二维图形，shape具有抽象方法area（），perimeter（） ，分别用来计算形状得面积与周长。定义子类(矩形，圆形），
abstract class shape{
    public abstract double area();
    public abstract double perimeter();
}
class yuan extends shape{
    public double banjin;
    public yuan(double banjin){
        this.banjin=banjin;
    }
    public double area(){
        return 3.1415926 *this.banjin*this.banjin;
    }
    public double perimeter(){
        return 2*3.1415926*this.banjin;
    }
}
class juxin extends shape{
    private double chang;
    private double kuan;
    public juxin(double chang,double kuan){
        this.chang=chang;
        this.kuan=kuan;
    }
    public double area() {
        return this.chang *this.kuan;
    }
    public double perimeter() {
        return 2*(this.chang+this.kuan);
    }
}
class Factory{
    public static shape getInstance(String className,double ...args){       //工厂设计模式
        if ("yuan".equalsIgnoreCase(className)){
            return new yuan(args[0]);
        }else if("juxin".equalsIgnoreCase(className)){
            return new juxin(args[0],args[1]);
        }else {
            return null;
        }
    }
}
public class 抽象类与接口 {
    public static void main(String[] args) {
        shape sap=Factory.getInstance("yuan",1.1);
        shape sap1 = Factory.getInstance("juxin",1.5,10.2);
        System.out.println("圆形面积："+sap.area()+"圆形周长："+sap.perimeter());
        System.out.println("矩形面积；"+sap1.area()+"矩形周长："+sap1.perimeter());
    }
}
*/


























