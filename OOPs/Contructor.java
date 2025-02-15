public class Contructor {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(14);
        Student s3=new Student("Samir");
    }
}
class Student{
    String name;
    int age;
    //non-parameterized constructor
    Student(){
        System.out.println("ishdfuhaiuhfu");
    }
    //parameterized constructor
    Student(int age){
        this.age=age;
    }
    //parameterized constructor
    Student(String Name){
        this.name=name;
    }
}