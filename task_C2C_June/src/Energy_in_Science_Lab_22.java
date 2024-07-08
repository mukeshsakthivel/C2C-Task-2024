import java.util.Arrays;
import java.util.Scanner;

public class Energy_in_Science_Lab_22 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int mul=in.nextInt();
        int n=in.nextInt();

        int val[]=new int[n];
        for(int i=0;i<n;i++)
        {
            val[i]=a;
            a=a*mul;
        }
        System.out.println(Arrays.toString(val));
    }
}
