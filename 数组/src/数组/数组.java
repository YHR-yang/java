package 数组;

/*
foreach结构输出数组
public class Demo2 {
    public static void main(String[] args) {
        int data[][]= new int[][]{
                {1,2,3,4,5,},{1,2,3},{5,6,7,8} };         //定于二维数组
        for (int temp []:data){
            for (int num:temp){
                System.out.println(num+"、");
            }
            System.out.println();       //换行
        }
    }
}
 */

/*
数组传递数据内容
public class 数组 {
    public static void main(String[] args) {
        int data[]=new int[]{10,20,30};
        int temp[]=data;
        temp[0]=99;
        for (int x=0;x<data.length;x++){
            System.out.println(data[x]+"、");
        }
    }
}


 */

/*
public class 数组 {
    public static void main(String[] args) {
        int data[][]=new int[][]{
                {1,2,3,4,5},{1,2,3},{5,6,7,8} //'
        };
        for (int x=0;x<data.length;x++){
            for (int y=0;y< data[x].length;y++){
                System.out.println("data["+x+"]["+y+"]="+data[x][y]);
            }
            System.out.println();
        }
    }
}


 */

/*使用方法接收数组引用
public class 数组 {
    public static void main(String[] args) {
        int data[]=new int[]{1,2,3};
        printDemo(data);            //将接接收到的整型数组内容进行输出
    }
    public static void printDemo(int temp[]){               //temp是数组临时变量  用于储存变量的
        for (int x=0;x<temp.length;x++){
            System.out.println(temp[x]+"、");            //获取下标元素
        }
    }
}

 */
/*
public class 数组 {
    public static void main(String[] args) {
        int data[] = initDemo();            //接收数组
        printDemo(data);                    //数组引用传递
    }
    //返回一个初始化的数组内容
    //return    int 型数组
    public static int[] initDemo(){
        int arr[] = new int[]{1,2,3};          //开辟数组
        return arr;                             //返回arr数组
    }
    public static void printDemo(int temp[]){
        for (int x=0;x<temp.length;x++){                //for循环输出
            System.out.println(temp[x]+"、");                //获取下标元素内容
        }
    }
}


 */


/*
public class 数组 {
    public static void main(String[] args) {
        int data[] = new int[]{1,2,3};
        changeDemo(data);           //修改数组内容
        printDemo(data);                //传递数组内容
    }
    public static void changeDemo(int arr[]){
        for (int x=0;x< arr.length;x++){
            arr[x]*=2;              //新建这个arr数组并且乘以二
        }
    }
    public static void printDemo(int temp[]){
        for (int x=0;x< temp.length;x++){
            System.out.println(temp[x]+"、");                //最后数组传递给temp数组，，并且数组内容都乘以2
        }
    }
}


 */




/*
//结合面向对象设计实现数组内容统计

class Demo{
    private int sum;
    private double avg;
    private int max;
    private int min;

    public Demo(int data[]){      //进行数组计算
        this.max=data[0];           //假设第一个是最大值
        this.min=data[0];              //假设第一个是最小值
        for (int x=0;x<data.length;x++){        //利用循环每一个数组的元素
            if (data[x]>max){           //如果max不是最大值
                this.max=data[x];           //修改max保存的内容
            }
            if (data[x]<min){
                this.min=data[x];
            }
            this.sum +=data[x];             //数据累加
        }
        this.avg=this.sum/data.length;          //统计平均值
    }
    public int getSum(){
        return this.sum;            //返回数据综合
    }
    public double getAvg(){
        return this.avg;                //返回数据平均值
    }
    public int getMax(){
        return this.max;                    //返回最大值
    }
    public int getMin(){
        return this.min;                //返回最小值
    }
}
public class 数组 {
    public static void main(String[] args) {
        int data[] = new int[]{1,2,3,4,5};          //开辟数组
        Demo demo = new Demo(data);         //数据计算
        System.out.println("数组内容总和："+demo.getSum()
        );
        System.out.println("数组内容平均值："+demo.getAvg());
        System.out.println("数组内容最大值："+demo.getMax());
        System.out.println("数组内容最小值："+demo.getMin());
    }
}


 */

/*
class Arrayutil{
    public static void sort(int data[]){
        for (int x=0;x< data.length;x++){
            for (int y=0;y<data.length-x-1;y++){
                if (data[y]>data[y+1]){
                    int temp = data[y];
                    data[y]=data[y+1];
                    data[y+1]=temp;
                }
            }
        }
    }
    public static void printArray(int temp[]){
        for (int x=0;x<temp.length;x++){
            System.out.println(temp[x]+"、");
        }
    }
}
public class 数组 {
    public static void main(String[] args) {
        int data[] = new int[]{1,0,2,4,3,5,8,7,9,6};
        Arrayutil.sort(data);
        Arrayutil.printArray(data);
    }
}


 */


/*
//数组转置处理，去数组长度的一般作为循环次数，进行首位交换
class ArrayUtil{
    public static void reverse(int data[]){
        int center = data.length / 2;           //确定交换的次数
        int head = 0;                           //【前索引】操作脚标
        int tail = data.length - 1;             //【后索引】操作脚标
        for (int x=0;x< center;x++){            //循环转置
            int temp=data[head];                //数据交换
            data[head]=data[tail];              //数据交换
            data[tail]=temp;                    //数据交换
            head++;                             //前索引自增
            tail--;                             //后索引自减
        }
    }
    public static void printArray(int temp[]){                  //数组输出
        for (int x=0;x<temp.length;x++){
            System.out.println(temp[x]+"、");
        }
        System.out.println();
    }
}
public class 数组 {
    public static void main(String[] args) {
        int data[] = new int[]{1,2,3,4,5,6,7,8,9};              //排序原始数组
        ArrayUtil.reverse(data);                                //转置处理
        ArrayUtil.printArray(data);                             //数组输出
    }
}


 */


/*
class ArrayUtil{
    public static void reverse(int temp[][]){           //数组转置
        for (int x=0;x< temp.length;x++){
            for (int y=0;y< temp[x].length;y++){
                int t=temp[x][y];                       //行列交换
                temp[x][y]=temp[y][x];
                temp[y][x]=t;
            }
        }
    }
    public static void printArray(int temp[][]){            //数组输出
        for (int x=0;x<temp.length;x++) {
            for (int y = 0; y < temp[x].length; y++) {
                System.out.println(temp[x][y] + "、");
            }
            System.out.println();
        }
        System.out.println();
    }
}
public class 数组 {
    public static void main(String[] args) {
        int data[][] = new int[][]{                         //二维数组
                {1,2,3},{4,5,6},{7,8,9}
        };
        ArrayUtil.reverse(data);                         //转置处理
        ArrayUtil.printArray(data);                     //数组输出
    }
}


 */

/*
//数组排序
class ArrayUtil{
    public static void printArray(int temp[]){              //循环输出
        for (int x=0;x<temp.length;x++){
            System.out.println(temp[x]+"、");
        }
        System.out.println();
    }
}
public class 数组 {
    public static void main(String[] args) {
        int data[] = new int[]{23,12,1,234,2,6,12,34,56};
        java.util.Arrays.sort(data);                //数组排序  java.util.Arrays.sort().....
        ArrayUtil.printArray(data);         //数组输出
    }
}


 */

/*
class ArrayUtil{
    public static void printArray(int temp[]){
        for (int x=0;x<temp.length;x++){                //循环输出
            System.out.println(temp[x]+"、");
        }
        System.out.println();
    }
}
public class 数组 {
    public static void main(String[] args) {
        int dataA[] = new int[]{1,2,3,4,5,6,7,8,9};
        int dataB[] = new int[]{11,22,33,44,55,66,77,88,99};
        System.arraycopy(dataA,5,dataB,3,3);           //数组复制
        ArrayUtil.printArray(dataB);        //输出数组内容
    }
}


 */

/*
使用可变参数
class ArrayUtil{
    public static int sum(int... data){
        int sum=0;
        for (int temp:data){
            sum+=temp;
        }
        return sum;
    }
}
public class 数组 {
    public static void main(String[] args) {
        System.out.println(ArrayUtil.sum(1,2,3));
        System.out.println(ArrayUtil.sum(new int[]{1,2,3}));
    }
}
 */




/*
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getInfo(){
        return "姓名："+this.name+"、年龄："+this.age;
    }
}
public class 数组 {
    public static void main(String[] args) {
        Person per[] = new Person[3];
        per[0]=new Person("张三",18);
        per[1]=new Person("杨浩然",20);
        per[2]=new Person("彭永真",21);
        for (int x=0;x<per.length;x++){
            System.out.println(per[x].getInfo());
        }
    }
}


 */

/*
class Car{                  //描述汽车的类
    private String name;            //汽车的名称
    private double price;           //汽车的价格
    private Person person;          //车应该属于一个人
    public Car(String name,double price){
        this.name=name;
        this.price=price;
    }
    public void setPerson(Person person){               //配置汽车与人的关系
        this.person=person;
    }

    public Person getPerson() {         //获取汽车拥有人的信息
        return this.person;
    }
    public String getInfo(){                //获取汽车信息
        return "汽车品牌型号："+this.name+"、汽车价值："+this.price;
    }
}
class Person{                   //描述人的信息
    private String name;
    private int age;
    private Car car;
    public Person(String name,int age){                 //构造传入人的信息
        this.name=name;
        this.age=age;
    }
    public void setCar(Car car){            //设置人与汽车的关系
        this.car=car;
    }
    public Car getCar(){                //获取人对应的汽车信息
        return this.car;
    }
    public String getInfo(){            //获取人员信息
        return "姓名："+this.name+"、年龄："+this.age;
    }
}
public class 数组 {
    public static void main(String[] args) {
        Person per = new Person("林希勒",21);
        Car car = new Car("奔驰G50",1588800.00);
        per.setCar(car);
        car.setPerson(per);
        System.out.println(per.getCar().getInfo());         //通过人获取汽车的信息
        System.out.println(car.getPerson().getInfo());          //通过汽车获取拥有人的信息
    }
}

 */


/*
class Car{
    private String name;
    private double price;
    private Person person;
    public Car(String name,double price){
        this.name=name;
        this.price=price;
    }
    public void setPerson(Person person){
        this.person=person;
    }
    public Person getPerson(){
        return this.person;
    }
    public String getInfo(){
        return "汽车品牌型号："+this.name+"、汽车价值："+this.price;
    }
}
class Person{
    private String name;
    private int age;
    private Car car;
    private Person children[];
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setCar(Car car){
        this.car=car;
    }
    public void setChildren(Person children[]){
        this.children=children;
    }
    public Person[] getChildren(){
        return this.children;
    }
    public Car getCar(){
        return this.car;
    }
    public String getInfo(){
        return "姓名："+this.name+"、年龄："+this.age;
    }
}
public class 数组 {
    public static void main(String[] args) {
        Person person = new Person("杨浩然",20);
        Person childA = new Person("杨丽萍",25);
        Person childB = new Person("彭永真",21);
        childA.setCar(new Car("BMW X1",300000.00));
        childB.setCar(new Car("法拉利",1000000.00));
        person.setChildren(new Person[]{childA,childB});
        Car car = new Car("奔驰G50",200000.00);
        person.setCar(car);
        car.setPerson(person);
        System.out.println(person.getCar().getInfo());
        System.out.println(car.getPerson().getInfo());
        for (int x=0;x<person.getChildren().length;x++){
            System.out.println("\t|-"+person.getChildren()[x].getInfo());
            System.out.println("\t\t|-"+person.getChildren()[x].getCar().getInfo());
        }
    }
}


 */


class Dept{
    private long deptno;
    private String dname;
    private String loc;
    private Emp emps[];
    public Dept(long deptno,String dname,String loc){
        this.deptno=deptno;
        this.dname=dname;
        this.loc=loc;
    }
    public void setEmps(Emp[] emps){
        this.emps=emps;
    }
    public Emp[] getEmps(){
        return this.emps;
    }
    public String getInfo(){
        return "【部门信息】部门编号："+this.deptno+"、部门名称："+this.dname+"、部门位置:"+this.loc;
    }
}
class Emp{
    private long empno;
    private String ename;
    private String job;
    private double sal;
    private double comm;
    private Dept dept;
    private Emp mgr;
    public Emp(long empno,String ename,String job,double sal,double comm){
        this.empno=empno;
        this.ename=ename;
        this.job=job;
        this.sal=sal;
        this.comm=comm;
    }
    public String getInfo(){
        return "【雇员信息】编号："+this.empno+"、姓名："+this.ename
                +"、职位："+this.job+"、工资："+this.sal+"、佣金："+this.comm;
    }
    public void setDept(Dept dept){
        this.dept=dept;
    }
    public void setMgr(Emp mgr){
        this.mgr=mgr;
    }
    public Dept getDept(){
        return this.dept;
    }
    public Emp getMgr(){
        return this.mgr;
    }
}
public class 数组 {
    public static void main(String[] args) {
        Dept dept = new Dept(10,"MLDN教学部","北京");
        Emp empA = new Emp(7396L,"SMITH","CLERK",800.00,0.0);
        Emp empB = new Emp(7566L,"FORD","MANAGER",2450.00,0.0);
        Emp empC = new Emp(7839L,"KING","PRESIDNT",500.00,0.0);
        empA.setDept(dept);
        empB.setDept(dept);
        empC.setDept(dept);
        empA.setMgr(empB);
        empB.setMgr(empC);
        dept.setEmps(new Emp[]{empA,empB,empC});
        System.out.println(dept.getEmps());
        for (int x=0;x<dept.getEmps().length;x++){
            System.out.println("\t|-"+dept.getEmps()[x].getDept());
            if (dept.getEmps()[x].getMgr() !=null){
                System.out.println("\t\t|-"+dept.getEmps()[x].getMgr().getInfo());
            }
        }
        System.out.println("---------------------------------------------------");
        System.out.println(empB.getDept().getInfo());
        System.out.println(empB.getMgr().getInfo());
    }
}













































































