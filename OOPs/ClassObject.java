public class ClassObject{
    public static void main(String[] args) {
        pen p1= new pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setSize(10);
        System.out.println(p1.getSize());

        Student s1 = new Student();
        s1.setAge(20);
        System.out.println(s1.getAge());
    }
}

class pen{
    private String color;
    private int size;
    void setColor(String color){
        this.color=color;
    }
    void setSize(int size){
        this.size=size;
    }
    String getColor(){
        return this.color;
    }
    int getSize(){
        return this.size;
    }    
}

class Student{
     private int age;
    String name;
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
     int getAge(){
        return this.age;
    }
}