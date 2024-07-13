package Inheritance.MamTask;

class Person
{
    void speak()
    {
        System.out.println("person");
    }
}

class Student extends Person
{
    void speak(){
        System.out.println("student speak");
    }
}

class Teacher extends Person
{
    void speak(){
        System.out.println("Teacher speaking");
    }
}
public class Person_5Question {
    public static void main(String[] args) {

        Person p=new Teacher();
        p.speak();
    }
}
