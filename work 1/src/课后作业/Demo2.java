package 课后作业;

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

public class Demo2 {
    public static void main(String[] args) {
        int data[]=new int[]{10,20,30};
        int temp[]=data;
        temp[0]=99;
        for (int x=0;x<data.length;x++){
            System.out.println(data[x]+"、");
        }
    }
}













































