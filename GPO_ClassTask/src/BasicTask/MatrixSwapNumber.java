package BasicTask;

import java.util.Scanner;

public class MatrixSwapNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        int [][]arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            {
               // System.out.print("["+i+"] ["+j+"] =");
                arr[i][j]=in.nextInt();
            }
        }
       // swap(arr,r,c);
       midelement(arr,r,c);
    }
    public static void swap(int [][]arr,int r,int c)
    {
        c=c-1;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
               // System.out.println(i+" ="+j);
                if(i==j)
                {
                   int  temp=arr[i][j];
                   arr[i][j]=arr[i][c-i];
                   arr[i][c-i]=temp;
                }
            }
        }



        for(int pri[]:arr)
        {
            for(int pri1:pri)
            {
                System.out.print(pri1+" ");
            }
            System.out.println();
        }
    }
    public static void midelement(int [][]arr,int r,int c) {
        if (c % 2 == 0) {
            c = c - 1;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < r; j++) {
                    if (i == 0 || j == 0 || i == c || j == c)
                        continue;
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println(arr[c/2][c/2]);
        }
    }

}
