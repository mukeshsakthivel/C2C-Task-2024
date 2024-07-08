import java.util.Arrays;
import java.util.Scanner;

public class Sales_Report_24 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int arr[][]=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

        for(int i=0;i<a;i++)
        {
            int max=0;
            for(int j=0;j<b;j++)
            {
                if(max<arr[i][j])
                    max=arr[i][j];
            }
            System.out.println(max);
        }
    }
}
