package BasicTask;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Stable_Number {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=in.nextInt();
        int arr[]=new int[n];
        boolean stableCheck[]=new boolean[n];

        for(int  i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            stableCheck[i]=repeatNumber(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(stableCheck));
        stableAdditionvalue(arr,stableCheck);

    }
    public static boolean repeatNumber(int input)
    {
        int inp=input;
        int size=0;
        while(inp!=0)
        {
            inp=inp/10;
            size++;
        }
        int arr[]=new int[size];
        int inc=0;
        while(input!=0)
        {
            int rem=input%10;
            arr[inc++]=rem;
            input/=10;
        }
        Arrays.sort(arr);
        int number[]=new int[10];
        int a=-1;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<arr.length;j++)
            {

                if(i==arr[j])
                {
                   // System.out.println(i);
                    number[i]++;
                     a=i;
                }
            }
        }
      //  System.out.println(Arrays.toString(arr));
      //  System.out.println(Arrays.toString(number));

        boolean stable=true;
      //  System.out.println(a);
        for(int i=0;i<10;i++)
        {
            if(number[i]==0)
                continue;
            else if(number[a]!=number[i]) {
                //System.out.println("no");
                stable=false;
            }



        }

        return stable;
    }


    static void stableAdditionvalue(int []arr,boolean []stablecheck)
    {
        int stable=0;
        int unstable=0;
        for(int i=0;i<arr.length;i++)
        {
            if(stablecheck[i])
                stable+=arr[i];
            else
                unstable+=arr[i];
        }
        System.out.println("Stable-unstable= "+Math.abs(stable-unstable));
    }
}
