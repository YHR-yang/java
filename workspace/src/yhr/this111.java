package yhr;

/*
//实现消息发送逻辑     Channel类的内部实例化了Message类对象，由于消息的发送需要通过通道来实现，所以
将Channel的当前对象this传递到Message类，并且利用Message.send()方法实现消息发送处理

class Message{
    private Channel channel;
    private String title;
    private String content;
    public Message(Channel channel,String title,String content){
        this.channel=channel;
        this.title=title;
        this.content=content;
    }
    public void send(){
        if(this.channel.isConnect()){
            System.out.println("【消息发送】title="+this.title+"、content="+this.content);
        }else {
            System.out.println("消息发送失败，无法与其连接陈成功！");
        }
    }
}
class Channel{
    private Message message;
    public Channel(String title,String content){
        this.message= new Message(this,title,content);
        this.message.send();
    }
    public boolean isConnect(){
        return true;
    }
}
public class this111 {
    public static void main(String[] args) {
        Channel ch = new Channel("运动会开幕","大家一起长跑30公里");
    }
}

 */


/*
//实现一个简单的JAVA类
class Dept{
    private long deptno;
    private String dname;
    private String loc;
    public Dept(){}          //提供无参构造法
    public Dept(long deptno,String dname,String loc){
        this.deptno=deptno;
        this.dname=dname;
        this.loc=loc;
    }
    public String getInfo(){
        return "【部门信息】部门编号："+this.deptno+"\n部门名称："+this.dname+"\n部门位置："+this.loc;
    }
}
public class this111 {
    public static void main(String[] args) {
        Dept dept = new Dept(10,"技术部门","巢湖");
        System.out.println(dept.getInfo());
    }
}
 */














