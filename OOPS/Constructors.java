package OOPS;

//Constructor -> is a special method which is invoked automatically at the time of object craetion
public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Shyna");
        Student s3 = new Student(123);
    }                               
}

class Student{
String name;
int roll;

//Non-Parameterized Construcor
Student(){
    System.out.println("constructor is called");
}

//Parameterized Constructor
Student(String name){
    this.name = name;
}
Student(int roll){
    this.roll = roll;
}

}
