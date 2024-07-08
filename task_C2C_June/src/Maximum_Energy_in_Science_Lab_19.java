import java.util.Scanner;

public class Maximum_Energy_in_Science_Lab_19 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int arr[]=new int[n];
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int num=in.nextInt();
            if(num>max1)
            {
                max2=max1;
                max1=num;
            } else if (num>max2)
                max2=num;
        }
        System.out.println(max1+max2);
    }
}
