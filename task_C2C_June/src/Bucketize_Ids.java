import java.util.Arrays;
import java.util.Scanner;

public class Bucketize_Ids {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String number=in.next();
        char a[]=number.toCharArray();
        char max=0;
      //  System.out.println(Arrays.toString(a));
        for(int i=0;i<number.length();i++)
        {
            for(int j=i+1;j<number.length();j++)
            {
                if(a[i]<a[j])
                {
                    //System.out.println(a[j]);
                    max=a[j];
                }
            }
        }
        System.out.println(max);


    }
}
