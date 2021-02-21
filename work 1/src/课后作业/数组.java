package 课后作业;

//1.数据表结构，要求实现映射转换。。获取一个分类的完整信息 。。。可以根据分类获取其对应的所有子分类的信息


/*
class Item{
    private long iid;
    private String title;
    private Subitem subitems [];
    public Item(long iid,String title){
        this.iid=iid;
        this.title=title;
    }
    public void setSubitems(Subitem subitems[]){
        this.subitems=subitems;
    }
    public Subitem[] getSubitems(){
        return this.subitems;
    }
    public  String getInfo(){
        return "【分类信息】iid="+this.iid+"、title="+this.title;
    }
}
class Subitem{
    private long sid;
    private String title;
    private Item item;
    public Subitem(long sid,String title){
        this.sid=sid;
        this.title=title;
    }
    public void setItem(Item item){
        this.item=item;
    }
    public Item getItem(){
        return this.item;
    }
    public String getInfo(){
        return "子分类信息sid="+this.sid+"、title="+this.title;
    }
}
public class 数组 {
    public static void main(String[] args) {
        //根据结构设置对象数据
        Item item = new Item(1L,"图书馆");
        Subitem subitems[] = new Subitem[]{
                new Subitem(10L,"编程图书"),
                new Subitem(10L,"图形图像类图书")
        };
        item.setSubitems(subitems);
        for (int x=0;x<subitems.length;x++){
            subitems[x].setItem(item);
        }
        System.out.println(item.getInfo());
        for (int x=0;x<item.getSubitems().length;x++){
            System.out.println("\t|-"+item.getSubitems()[x].getInfo());
        }
    }
}


 */


/*
//2.多对多映射转换
class Member{
    private  String mid;
    private String name;
    private Product products [];
    public Member(String mid,String name){
        this.mid=mid;
        this.name=name;
    }
    public void setProducts(Product products[]){
        this.products=products;
    }
    public Product[] getProducts(){
        return this.products;
    }
    public String getInfo(){
        return "【用户信息】mid="+this.mid+"、name="+this.name;
    }
}
class Product{
    private long pid;
    private String title;
    private double price;
    private Member members[];
    public Product(long pid,String title,double price){
        this.pid=pid;
        this.title=title;
        this.price=price;
    }
    public void setMembers(Member members[]){
        this.members=members;
    }
    public Member[] getMembers(){
        return this.members;
    }
    public String getInfo(){
        return "【商品信息】pid="+this.pid+"、titel:"+this.title+"、价格"+this.price;
    }
}
public class 数组 {
    public static void main(String[] args) {
        Member memA = new Member("mldn","张三");
        Member memB = new Member("mldn","李四");
        Product proA = new Product(1L,"JAVA开发图书",79.8);
        Product proB = new Product(2L,"非常大的耳机",2309.8);
        Product proC = new Product(3l,"小米手机",3999);
        memA.setProducts(new Product[]{proA,proB,proC});
        memB.setProducts(new Product[]{proA});
        proA.setMembers(new Member[]{memA,memB});
        proB.setMembers(new Member[]{memA});
        proC.setMembers(new Member[] {memA});
        System.out.println("-------------根据用户查看浏览商品信息------------");
        System.out.println(memA.getInfo());
        for (int x=0;x<memA.getProducts().length;x++){
            System.out.println("\t|-"+memA.getProducts()[x].getInfo());
        System.out.println("-------------根据商品找到被浏览的记录------------");
        System.out.println(proA.getInfo());
            for (int y=0;y<proA.getMembers().length;y++){
                System.out.println("\t\t|-"+proA.getMembers()[x].getInfo());
            }
        }
    }
}


 */


/*
class Member{
    private String mid;
    private String name;
    private Role roles [];
    public Member(String mid,String name){
        this.mid=mid;
        this.name=name;
    }
    public void setRoles(Role roles[]){
        this.roles=roles;
    }
    public Role[] getRoles(){
        return this.roles;
    }
    public String getInfo(){
        return "【用户信息】mid="+this.mid+"、name："+this.name;
    }
}
class Role{
    private long rid;
    private String title;
    private Member members[];
    private Privilege privileges[];
    public Role(long rid,String title){
        this.rid=rid;
        this.title=title;
    }
    public void setMembers(Member members[]){
        this.members=members;
    }
    public Member[] getMembers(){
        return this.members;
    }
    public void setPrivileges(Privilege privileges[]){
        this.privileges=privileges;
    }
    public Privilege[] getPrivileges(){
        return this.privileges;
    }
    public String getInfo(){
        return "【角色信息】rid="+this.rid+"、title="+this.title;
    }
}
class Privilege{
    private long pid;
    private String title;
    private Role role;
    public Privilege(long pid,String title){
        this.pid=pid;
        this.title=title;
    }
    public void setRoles(Role role){
        this.role=role;
    }
    public Role getRole(){
        return this.role;
    }
    public String getInfo(){
        return "【权限信息】pid="+this.pid+"title="+this.title;
    }
}
public class 数组 {
    public static void main(String[] args) {
        //根据结构设置对象数据
        Member memA=new Member("mldn-a","张三");
        Member memB=new Member("mldn-b","李四");
        Role roleA = new Role(1L,"系统配置");
        Role roleB = new Role(2L,"备份管理");
        Role roleC = new Role(3L,"人事管理");
        Privilege priA  = new Privilege(1000L,"系统初始化");
        Privilege priB  = new Privilege(1001L,"系统系统还原");
        Privilege priC  = new Privilege(1002L,"系统环境修改");
        Privilege priD  = new Privilege(2000L,"备份员工数据");
        Privilege priE  = new Privilege(2001L,"备份部门数据");
        Privilege priF  = new Privilege(2002L,"备份公文数据");
        Privilege priG  = new Privilege(3000L,"增加员工");
        Privilege priH  = new Privilege(3001L,"编辑员工");
        Privilege priI  = new Privilege(3002L,"浏览员工");
        Privilege priJ  = new Privilege(3003L,"员工离职");
        //增加角色与权限对应的关系
        roleA.setPrivileges(new Privilege[]{priA,priB,priC});
        roleB.setPrivileges(new Privilege[]{priD,priE,priF});
        roleC.setPrivileges(new Privilege[]{priG,priH,priI,priJ});
        //增加权限与角色对应
        priA.setRoles(roleA);
        priB.setRoles(roleA);
        priC.setRoles(roleA);
        priD.setRoles(roleB);
        priE.setRoles(roleB);
        priF.setRoles(roleB);
        priG.setRoles(roleC);
        priH.setRoles(roleC);
        priI.setRoles(roleC);
        priJ.setRoles(roleC);
        //增加用户与角色的对应关系
        memA.setRoles(new Role[]{roleA,roleB});
        memB.setRoles(new Role[]{roleA,roleB,roleC});
        roleA.setMembers(new Member[]{memA,memB});
        roleB.setMembers(new Member[]{memA,memB});
        roleC.setMembers(new Member[]{memB});
        //根据要求获取数据
        System.out.println("---------通过用户查找信息--------");
        System.out.println(memB.getInfo());
        for (int x=0;x<memB.getRoles().length;x++){
            System.out.println("\t|-"+memB.getRoles()[x].getInfo());
            for (int y=0;y<memB.getRoles()[x].getPrivileges().length;y++){
                System.out.println("\t\t|-"+memB.getRoles()[x].getInfo());
            }
        }
        System.out.println("----------通过角色查找信息-------");
        System.out.println(roleB.getInfo());
        System.out.println("\t|- 浏览此角色下的所有权限信息：");
        for (int x=0;x<roleB.getPrivileges().length;x++){
            System.out.println("\t\t|-"+roleB.getPrivileges()[x].getInfo());
        }
        System.out.println("\t|- 浏览此角色下的所有用户信息");
        for (int x=0;x<roleB.getPrivileges().length;x++){
            System.out.println("\t\t|-"+roleB.getPrivileges()[x].getInfo());
        }
        System.out.println("--------通过权限查找信息-----");
        System.out.println(priA.getInfo());
        for (int x=0;x<priA.getRole().getMembers().length;x++){
            System.out.println("\t|-"+priA.getRole().getMembers()[x].getInfo());
        }
    }
}


 */














































