import java.util.Scanner;

public class Special_Discount_14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("enter the product");
        int dis =in.nextInt();
        int count=0;
        int product[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int cust=in.nextInt();
            if(dis%cust==0)
                count++;
        }
        System.out.println(count);
    }
}
