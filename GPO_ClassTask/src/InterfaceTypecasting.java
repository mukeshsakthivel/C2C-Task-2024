class A{
    void shows()
    {
        System.out.println("A");
    }

    void sp(){
        System.out.println("sanhasudas");
    }

}

class B extends  A{
    void show1()
    {
        System.out.println("B");
    }
    void aa()
    {

    }

    void shows()
    {
        super.shows();
        System.out.println("as");
    }
}

class c {
    void show1()
    {
        System.out.println("C");
    }
    void showsaa()
    {
        System.out.println("hello");
    }


}

class D
{

}
public class InterfaceTypecasting {
    public static void main(String[] args) {

         /*   A obj=new c();
            obj.show1();
            obj.shows();
            c ob=(c)obj;
        ob.show1();
        ob.showsaa();
        */
       /* c cc=new B();
        cc.show1();
*/
        A ob=new B();
        ob.shows();
        ob.sp();

    }
}
