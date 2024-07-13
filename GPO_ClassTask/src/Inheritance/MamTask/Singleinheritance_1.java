package Inheritance.MamTask;

 class Shape{
    int area;
    int getArea()
    {
        return area;
    }
}

 class rectangle extends Shape{
int length,width;
   rectangle(int l,int w){
       length=l;
       width=w;
   }

    int getArea()
    {
        return length*width;
    }

}

class Box extends rectangle{
    int height;
    Box(int l,int w,int h)
    {
        super(l,w);
        height=h;
    }

    int getArea(){
        return (2*length*width)+(2*length*height)+(2*height*width);
    }
}
public class Singleinheritance_1 {
    public static void main(String[] args) {

        Shape s=new Shape();
        System.out.println(s.getArea());
        rectangle r=new rectangle(2,3);
        System.out.println(r.getArea());
        Box b=new Box(2,3,5);
        //knsdknas
        System.out.println(b.getArea());

    }

}
