package static11;
/*
class Chinese{
    private String name;
    private int age;
    static String country="中华人民共和国";        //【静态成员属性】保存在全局数据区
    public Chinese(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getInfo(){
        return "姓名"+this.name+"、年龄:"+this.age+"、国家："+this.country;
    }
}
public class static001 {
    public static void main(String[] args) {
        Chinese perA = new Chinese("杨浩然",18);
        Chinese perB = new Chinese("彭永真",20);
        perA.country="伟大的中国";
        System.out.println(perA.getInfo());
        System.out.println("\n");
        System.out.println(perB.getInfo());
    }
}

 */

/*
class Chinese{
    private String name;
    private String xingbie;
    private int age;
    private static String country="中国";
    public Chinese(String name,int age,String xingbie){
        this.name=name;
        this.age=age;
        this.xingbie=xingbie;
    }
    public static void setCountry(String c){
        country=c;
    }
    public String getInfo(){
        return "姓名："+this.name+"\n性别:"+this.xingbie+"\n年龄："+this.age+"\n国家："+Chinese.country;
    }
}
public class static001 {
    public static void main(String[] args) {
        Chinese.setCountry("中华人名共和国");
        Chinese per = new Chinese("傻逼雨薇",18,"女");
        System.out.println(per.getInfo());
    }
}


 */

//实现属性自动命名
class Book{
    private String title;
    private static int count=0;
    public Book(){
        this("MLDNTITLE-"+ count ++);
    }
    public Book(String title){
        this.title=title;
    }
    public String getTitle{
           return title;
    }
}
public class static001 {
    public static void main(String[] args) {
        System.out.println(new Book("java").getTitle);
    }
}















