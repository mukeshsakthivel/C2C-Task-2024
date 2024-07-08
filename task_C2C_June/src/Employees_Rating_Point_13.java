import java.util.Scanner;

public class Employees_Rating_Point_13 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int mark=in.nextInt();
        if(81<=mark&& mark<=100)
            System.out.println("A");
        else if (61<=mark&& mark<=80) {
            System.out.println("B");
        }
        else if (51<=mark&& mark<=60)
            System.out.println("C");
        else if(30<=mark&& mark<=50)
            System.out.println("D");
        else
            System.out.println("Please enter the correct ERP");
    }
}
