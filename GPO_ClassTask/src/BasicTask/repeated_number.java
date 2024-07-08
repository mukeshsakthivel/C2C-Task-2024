package BasicTask;

import java.util.Arrays;
import java.util.Scanner;

public class repeated_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        repatecount(num1);
    }

    public static void repatecount(int num1)
    {


        int arrcount[]=new int[10];
        boolean validate[]=new boolean[10];
        while(num1!=0)
        {
            int check=num1%10;
            int second=num1/10;
            if(!validate[check]) {

                while (second != 0) {
                    int rem = second % 10;
                    if (check == rem) {
                        validate[check] = true;
                       // System.out.println(check);
                        arrcount[check] = arrcount[check] + 1;

                    }
                   // System.out.println("sjdj");
                    second = second / 10;
                }
            }
                num1 = num1 / 10;

        }
        //System.out.println(Arrays.toString(arrcount));
        for(int i=0;i<9;i++)
        {
            if(arrcount[i]==0)
                continue;
            else
                System.out.println("Repeat of number"+i+" :"+(arrcount[i]+1));
        }
    }


    public static void repateNumberOnly(int num1)
    {

        boolean validate[]=new boolean[10];
        while(num1!=0)
        {
            int check=num1%10;
            int second=num1/10;
            while(second!=0)
            {
                int rem=second%10;
                if(check==rem)
                {

                    if(!validate[check]) {
                        System.out.println(check);
                        validate[check]=true;
                    }


                }
                second=second/10;
            }
            num1=num1/10;
        }
    }

}
