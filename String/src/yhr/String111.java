package yhr;


/*在String 伤使用“==”来判断堆内存的大小
public class String111 {
    public static void main(String[] args) {
        String strA = "mldn";
        String strB = new String("mldn");
        String strC=strB;
        System.out.println(strA==strB);         //"==" 是判断堆内存的大小，如果相等，true。如果不相等false
        System.out.println(strA==strC);
        System.out.println(strB=strC);
    }
}

 */

/*
//观察chart（）方法
public class String111 {
    public static void main(String[] args) {
        String str = "www.mldn.com";
        char c = str.charAt(1);
        System.out.println(c);
    }
}


 */


/*
//字符串与字符数组转换
public class String111 {
    public static void main(String[] args) {
        String str="mldnjava";                                  //定义字符串
        char[] result = str.toCharArray();                      //将字符串变为字符数组
        for (int x=0;x<result.length;x++){                      //循环字符数组
            result[x] -=32;                                     //编码减小32（大小写字母差为32——
        }
        String newstr = new String(result);                     //处理后的字符数组全部变为字符串
        System.out.println(newstr);                             //输出新的字符串
        System.out.println(new String(result,0,4));             //部分字符数组变为字符串
    }
}


 */


/*
//判断字符串组成是否全部为数字
public class String111 {
    public static void main(String[] args) {
        System.out.println(isNumer("mldn")?"由数字组成":"不是由数字组成");
        System.out.println(isNumer("123")?"由数字组成":"不是由数字组成");
        //isNumer()方法是判断传入的字符串对象是否为数字组成，在处理中会将字符串变为字符数组
        //采用循环的形式进行每一位字符的判断
    }
    public static boolean isNumer(String str){
        char[] result = str.toCharArray();
        for (int x=0;x<result.length;x++){
            if (result[x]<'0'||result[x]>'9'){
                return false;
            }
        }
        return true;
    }
}


 */


/*
//字符串与字节转换
public class String111 {
    public static void main(String[] args) {
        String str = "mldnjava";
        byte data[] = str.getBytes();                   //将字符串变为字节数组
        for (int x=0;x<data.length;x++){                //字节数组循环
            data[x] -=32;
        }
        System.out.println(new String(data));           //全部字节数组变为字符串
        System.out.println(new String(data,0,4));       //部分数组变为字符串
    }
}


 */


/*观察大小写比较
public class String111 {
    public static void main(String[] args) {
        String str ="mldn";
        System.out.println("MLDN".equals(str));
        System.out.println("MLDN".equalsIgnoreCase(str));
    }
}


 */

/*观察compareTo（）方法
public class String111 {
    public static void main(String[] args) {
        String strA ="mldn";
        String strB ="mlDn";
        System.out.println(strA.compareTo(strB));
        System.out.println(strB.compareTo(strA));
        System.out.println("Hello".compareTo("Hello"));
        System.out.println(strA.compareToIgnoreCase(strB));
    }
}


 */


/*查找字符是否存在
public class String111 {
    public static void main(String[] args) {
        String str ="www.mldn.com";
        System.out.println(str.contains("mldn"));
        System.out.println("hello");
    }
}


 */

/*使用indexOf（）方法判断
*如果该字符在原来字符条有，那么就输出他的索引数据，如果没有则返回数值为-1，
public class String111 {
    public static void main(String[] args) {
        String str = "www.mldn.cn";
        System.out.println(str.indexOf("mldn"));
        System.out.println(str.indexOf("hello"));
        if (str.indexOf("mldn")!=-1){
            System.out.println("要查询的字符串存在。");
        }
    }
}

 */


/*判断是否以指定的字符串开头或结尾
public class String111 {
    public static void main(String[] args) {
        String str = "**@@www.mldn.cn";
        System.out.println(str.startsWith("**"));
        System.out.println(str.startsWith("@@",2));     //以@@开头，判断正确，结果为true
        System.out.println(str.endsWith("##"));         //以##结尾，结果为false 不存在
    }
}
 */

/*字符拆分
public class String111 {
    public static void main(String[] args) {
        String str = "www.mldn.cn";
        System.out.println(str.substring(4));
        System.out.println(str.substring(4,8));
    }
}

 */

/*格式化字符串
public class String111 {
    public static void main(String[] args) {
        String name = "杨浩然";
        int age  = 20;
        double score = 98.765321;
        String str = String.format("姓名：%s、年龄：%d、成绩：%5.2f",
                name,age,score);
        System.out.println(str);
    }
}


 */


import java.util.Locale;

/*大小写转换
public class String111 {
    public static void main(String[] args) {
        String str = "www.mldn.cn";
        System.out.println(str.toUpperCase());      //转换大写
        System.out.println(str.toLowerCase());      //转换小写
    }
}

 */

/*
class StringUtil11{
    //首字母大写处理，其他字母保持不变
    public static String initcap(String str){
        if (str == null || "".equals(str)){
            return str;
        }
        if (str.length() ==1){
            return str.toUpperCase();
        }
        return str.substring(0,1).toUpperCase() +str.substring(1);
    }
}
public class String111 {
    public static void main(String[] args) {
        System.out.println(StringUtil11.initcap("mldnjava"));
        System.out.println(StringUtil11.initcap("m"));
    }
}


 */




