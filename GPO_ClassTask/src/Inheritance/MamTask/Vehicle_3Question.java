package Inheritance.MamTask;

class Vehicle{
    void start()
    {
        System.out.println("vehicle start");
    }
}

class Car extends Vehicle
{
    void drive()
    {
        System.out.println("car start");
    }
}

class SportsCar extends Car{
    void drive()
    {
        System.out.println("sportsCar start");
    }
}
public class Vehicle_3Question {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.start();
        Car c=new Car();
        c.drive();
        c.start();
        SportsCar sc=new SportsCar();
        sc.drive();
        sc.start();
    }
}
