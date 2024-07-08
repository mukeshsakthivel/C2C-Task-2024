package BasicTask;

import java.util.Arrays;
import java.util.Scanner;

public class MidNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       // System.out.println(n);
        int number =n;
        int count=0;
        while(n!=0)
        {
            n/=10;
            count++;
        }
        if(countcheck(count))
            middlenumberfind(number,count);

        else
         System.out.println("please enter the correct odd place numbers try again");
    }
    public static boolean countcheck(int count)
    {
        return count%2==0?false:true;
    }
    public static void middlenumberfind(int numberint ,int count)
    {
        int[] arr=new int[count];
        for(int i=count-1;i>=0;i--)
        {
            arr[i]=numberint%10;
            numberint/=10;
        }
        System.out.println((arr[count/2]));
    }

}
