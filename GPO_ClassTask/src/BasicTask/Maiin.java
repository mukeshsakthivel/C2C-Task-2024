package BasicTask;

abstract class A
{
   abstract void display() ;
}
class b extends A{

    void display() {
        System.out.println("aa2");
    }
    void aa()
    {
        System.out.println("vv");
    }
}
class c extends b {

    void display() {
        System.out.println("aa3");
    }
    void bb()
    {
        System.out.println("zzz");
    }
}
    class Maiin {
    public static void main(String[] args) {
        b ob=new c();
        ob.display();

    }

}
