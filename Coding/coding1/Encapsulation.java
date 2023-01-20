public class Encapsulation{
    public static void main(String[] args){
        Student stu = new Student();
        stu.setName("k");
        stu.setID("01");
        stu.setAge("25");

        System.out.println(stu.getNetID());
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        stu.getInfo();
    }
}

class Student{
    private String name;
    private String netID;
    private STring age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNetID(){
        return netID;
    }
    public void setID(String netID){
        this.netID = netID;
    }

    public String getAge(){
        return age;
    }

    public void setAge(String age){
        this.age = age;
    }

    public void getInfo(){
        System.out.println(netID + ":" + name + ", " + age + "is my inforamtion!");
    }
}