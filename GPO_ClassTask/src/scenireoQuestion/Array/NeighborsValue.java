package scenireoQuestion.Array;

import java.util.Arrays;
import java.util.Scanner;

public class NeighborsValue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int limit=in.nextInt();
        int arr[]=new int[limit];
        for(int i=0;i<limit;i++){
            arr[i]=in.nextInt();
        }
        int equal=2;
        boolean peak=true;


        for(int i=1;i<limit-1;i++)
        {
            if((arr[i-1]<arr[i])&&(arr[i]>arr[i+1]))
            {
                System.out.println(arr[i]);
                peak=false;

            }
             if(arr[i-1]==arr[i]&&(arr[i]==arr[i+1]))
            {
                equal++;
            }
        }
        if(equal==limit)
        {
            System.out.println(arr[0]);
        }
        if(peak)
        {
            Arrays.sort(arr);
            System.out.println(arr[limit-1]);
        }
    }
}
