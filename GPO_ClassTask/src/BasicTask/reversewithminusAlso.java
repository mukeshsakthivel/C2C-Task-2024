package BasicTask;

import java.util.Scanner;

public class reversewithminusAlso {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       long  a=in.nextLong();
        System.out.println(reverse(a));

    }
    public static long reverse(long x){
        long a=x;
        long num=0;
        while (a!=0)
        {
            long rem=a%10;
            num=num*10+rem;
            a/=10;
        }
        if(x<0)
            return -num;

        return num;
    }
}
