package BasicTask;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Enter the option");
        int option =in.nextInt();
        System.out.println(patterend( n, option));

    }
    public static int patterend(int n,int option)
    {
        int result=0;
        int minus=0;
        switch (option)
        {
            case 1:
            {
                for(int i=n;i>0;i=i-2) {
                 //   result = result + ((n - minus++) - ((n - 1) - minus++));
                    result=result+(n-(n-1));
                    System.out.println(result);
                }
            }
            case 2:
            {
               for(int i=n-1;i>0;i=i-2)
               {
                   result=result+(i-(i-1));
               }
              return n+result;

            }

        }
        return  result;
    }
}
