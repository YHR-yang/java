package 抽象类与接口;

/**
 * 夏然
 * github.com/YHR-yang
 */

/*抽象类定义方法
abstract class Message {
    private String type;

    public Message(String type) {
        this.type = type;
    }

    public abstract String getConnectInfo();

    protected String getType() {
        return this.type;
    }
}
class DatabaseMessage extends Message {
    public DatabaseMessage(String type) {
        super(type);
    }

    @Override
    public String getConnectInfo() {
        return "【" + super.getType() + "】数据库连接信息";
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        Message msg =new DatabaseMessage("mldn");
        System.out.println(msg.getConnectInfo());
    }
}

 */

    /*使用抽象类
abstract class Message{
    private String type;
    public abstract String getConnectInfo();
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return this.type=type;
    }
}
class DatabaseMessage extends Message{

    @Override
    public String getConnectInfo() {
        return "【"+super.getType()+"】数据库信息";
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        Message msg =new DatabaseMessage();
        msg.setType("MLDN");
        System.out.println(msg.getConnectInfo());
    }
}

     */
/*
abstract class Message{
    public abstract String getInfo();
    public static Message getInstance(){
        return new DataMessage();
    }
}
class DataMessage extends Message {

    @Override
    public String getInfo() {
        return "苏州信息职业技术学院";
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        Message msg =Message.getInstance();
        System.out.println(msg.getInfo());
    }
}
*/
    /*
abstract class Action{
    public static final int EAT=1;
    public static final int SLEEP=5;
    public static final int WORK=10;
    public void command(int code){
        switch (code) {
            case EAT: {
                this.eat();
                break;
            }
            case SLEEP: {
                this.sleep();
                break;
            }
            case EAT + SLEEP + WORK: {
                this.eat();
                this.sleep();
                this.work();
                break;
            }
        }
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void work();
}
class Robot extends Action{

    @Override
    public void eat() {
        System.out.println("机器人需要接通电源。");
    }

    @Override
    public void sleep() {}
    @Override
    public void work() {
        System.out.println("机器人按照固定的套路进行工作");
    }
}
class Person extends Action{

    @Override
    public void eat() {
        System.out.println("饿的时候安静的坐下吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("安静的躺下，慢慢的睡得，而后做着美梦");
    }

    @Override
    public void work() {
        System.out.println("人类是高级脑类动物，在工作中不断学习与成长");
    }
}
class Pig extends Action{

    @Override
    public void eat() {
        System.out.println("吃食槽中饲料");
    }

    @Override
    public void sleep() {
        System.out.println("到底就睡");
    }

    @Override
    public void work() {}
}
public class 抽象类 {
    public static void main(String[] args) {
        Action robotAction =new Robot();
        Action personAction = new Person();
        Action pigAction = new Pig();
        System.out.println("-------------机器人行为——————---------");
        robotAction.command(Action.SLEEP);
        robotAction.command(Action.WORK);
        System.out.println("-----------人类行为----------");
        personAction.command(Action.SLEEP+Action.EAT+Action.WORK);
        System.out.println("-----------猪类行为---------");
        pigAction.work();
        personAction.eat();
    }
}

     */
    /*
class Int{
    private int data;
    public Int(int data){
        this.data=data;
    }
    public int intValue() {
        return this.data;
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        Object obj = new Int(10);
        int x= ((Int)obj).intValue();
        System.out.println(x*2);
    }
}

     */
/*使用接口，用interfa定义然后使用implements来定义接口子类，向上转型实例化接口对象
interface  IMssage{
    public static final String INFO="www.mldn.com";
    public abstract String getInfo();
}
class MessageImpl implements IMssage{
    @Override
    public String getInfo() {
        return "杨浩然";
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        IMssage msg = new MessageImpl();
        System.out.println(msg.getInfo());
    }
}

 */
    /*
interface IMssage{
    public static final String INFO="www.mldn.com";
    public abstract String getInfo();
}
interface Ichanner{
    public abstract boolean connect();
}
class MessageImpl implements IMssage,Ichanner{
    @Override
    public String getInfo(){
        if (this.connect()){
            return "yhr";
        }
        return "【默认消息】"+IMssage.INFO;
    }

    @Override
    public boolean connect() {
        return true;
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        IMssage msg =new MessageImpl();
        System.out.println(msg.getInfo());
    }
}
*/
    /*
interface yrh{
    public static final String INFO="lsjdljflsfs";
    public abstract String getInfo();
}
interface hr{
    public abstract boolean connect();
}
class xiaran implements yrh,hr{
    @Override
    public String getInfo(){
        if (this.connect()){
            return "ljsdlslf";
        }
        return "lsdjflsk"+yrh.INFO;
    }

    @Override
    public boolean connect() {
        return true;
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        yrh y = new xiaran();
        System.out.println(y.getInfo());
    }
}
     */
    /*
interface IMessage{
    public static final String INFO="jsdl";
    public abstract String getInfo();
}
interface IChannel{
    public abstract boolean connect();
}
abstract class DatabaseAbstraact{
    public abstract  boolean getDatabaseConnection();
}
class MessageImpl extends DatabaseAbstraact implements IMessage,IChannel{
    @Override
    public String getInfo(){
        if (this.connect()){
            if (this.getDatabaseConnection()){
                return "【数据库消息】杨浩然恭喜被南京大学录取";
            }else {
                return "数据库无妨访问！";
            }
        }
        return "【默认消息】"+IMessage.INFO;
    }

    @Override
    public boolean connect() {
        return true;
    }

    @Override
    public boolean getDatabaseConnection() {
        return true;
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        IMessage msg =new MessageImpl();
        System.out.println(msg.getInfo());
    }
}
*/
    /*
interface IMessage{
    public static final String INFO ="www.baidu.com";
    public  abstract  String getInfo();
}
interface IChannel{
    public abstract  boolean connect();
}
abstract  class DatabaseAbstract{
    public abstract boolean getDatabaseConnection();
}
class MessageImpl extends DatabaseAbstract implements  IMessage,IChannel{
    @Override
    public String getInfo() {
        if (this.connect()){
            if (this.getDatabaseConnection()) {
                return "【数据库消息】杨浩然恭喜获得10亿元";
            }else {
                return "数据库无法访问";
            }
        }
        return "【默认消息】"+IMessage.INFO;
    }

    @Override
    public boolean connect() {
        return true;
    }

    @Override
    public boolean getDatabaseConnection() {
        return true;
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        IMessage msg = new MessageImpl();
        System.out.println(msg.getInfo());
    }
}
*/
    /*
interface IMessage{
    public String message();
    public default boolean connect(){
        System.out.println("杨浩然");
        return true;
    }
    public static IMessage getInstance(){
        return new MessageImpl();
    }

}
class MessageImpl implements IMessage{
    public String message(){
        if (this.connect()){
            return "lsjdflksjf";
        }
        return "lsjdflsdjf0";
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        IMessage mssg =IMessage.getInstance();
        System.out.println(mssg.message());
    }
}
*/
/*
interface IFood{
    public void eat();
}
class Bread implements IFood{
    public void eat(){
        System.out.println("吃面包");
    }
}
class Milk implements IFood{
    public void eat(){
        System.out.println("喝牛奶");
    }
}
class Factory{
    public static IFood getInstance(String className){
        if ("bread".equals(className)){
            return new Bread();
        }else if ("milk".equals(className)){
            return new Milk();
        }else{
            return null;
        }
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        IFood food = Factory.getInstance("brade");
        food.eat();
    }
}
*/
/*
interface IEat{
    public void get();
}
class EatReal implements IEat{
    public void get(){
        System.out.println("sdhjfgui");
    }
}
class EatProxy implements IEat{
    private IEat eat;
    public EatProxy(IEat eat){
        this.eat=eat;
    }
    public void get(){
        this.prepaer();
        this.eat.get();
        this.clear();
    }
    public void prepaer(){
        System.out.println("lsdjfklsdf");
        System.out.println("lskjdfliksdjf");
    }
    public void clear(){
        System.out.println("lksdjfioksd");
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        IEat eat = new EatProxy(new EatReal());
        eat.get();
    }
}


 */

    /*
class Point<T>{
    private T x;
    private T y;
    public void setX(T x){
        this.x=x;
    }
    public void  setY(T y){
        this.y=y;
    }
    public T getX(){
        return this.x;
    }
    public T getY(){
        return this.y;
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        //实例化Point类对象，设置泛型标记T的目标数据类型，属性，方法参数，返回值的类型动态配置
        Point<Integer>point=new Point<Integer>();
        //根据需求进行内容的设置，所有数据都通过Object接收
        point.setX(10);
        point.setY(20);
        //从里面获取数据，由于返回的是Object类型，所以必须进行强制性的向下转型
        int x =point.getX();            //避免强制转型，，获取x坐标原始内容
        int y=point.getY();             //避免强制转型，，获取y坐标原始内容
        System.out.println("x坐标："+x+"、y坐标："+y);
    }
}
     */
/*使用？接收数据
class Message<T>{
    private T content;
    public void setContent(T content){
        this.content=content;
    }
    public T getContent(){
        return this.content;
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        Message<String> msg = new Message<String>();
        msg.setContent("www.baidu.com");
        fun(msg);
    }
    public static void fun(Message<?> temp){
        System.out.println(temp.getContent());
    }
}
*/
/*泛型上限   （？ extends类）：只能够使用当前类或当前类的子类设置泛型类型。
class Message<T extends Number>{
    private T content;
    public void setContent(T content){
        this.content=content;
    }
    public T getContent(){
        return this.content;
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        Message<Integer> msg = new Message<Integer>();
        msg.getContent();
        fun(msg);
    }
    public static void fun(Message<? extends Number>temp){
        System.out.println(temp.getContent());
    }
}


 */
/*泛型下限    （？ super）只能够设置指定的类或指定类的父类，
fun（）方法使用泛型下限设置类可以接收的Message对象的泛型类型只能是String或其父类Object。

class Message<T>{
    private T content;
    public void setContent(T content){
        this.content=content;
    }
    public T getContent(){
        return this.content;
    }
}
public class 抽象类 {
    public static void main(String[] args) {
        Message<String> msg = new Message<String>();
        msg.setContent("杨浩然");
        fun(msg);
    }
    public static void fun(Message<? super String> temp){
        System.out.println(temp.getContent());
    }
}

 */




































