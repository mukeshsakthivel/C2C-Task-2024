package scenireoQuestion;

import java.util.Arrays;
import java.util.Scanner;

//an two diamontional array an diagonal value can be add if it is even to transpoce the array and if odd minus the add value
//an 3x3 matrix an center value can be add only onces
public class TranspoceArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int intex=in.nextInt();
        int arr[][]=new int[intex][intex];
        for(int a=0;a<intex;a++)
        {
            for(int b=0;b<intex;b++)
            {
                arr[a][b]=in.nextInt();
            }
        }
        int sum=0;
        for(int i=0,j=intex-1;i<intex;i++,j-- )
        {
            sum=sum+arr[i][i]+arr[i][j];
            System.out.println(sum);
        }
        if(intex%2!=0)
            sum=sum-arr[intex/2][intex/2];


        for(int [] a:arr)
        {
            System.out.println(Arrays.toString(a));
        }
        System.out.println(sum);

        }

    }

