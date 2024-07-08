package BasicTask;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int inp1=in.nextInt();
      int inp2=in.nextInt();
        int inp3=in.nextInt();
        int result=maxvalue(inp1)+maxvalue(inp2)+maxvalue(inp3);
        System.out.println(result);
    }
    public static int maxvalue(int inp)
    {
        int max=0;
        int smax=0;
        int value=inp;
        while(value!=0)
        {
            int rem=value%10;
            if(rem>max) {

                max = rem;
            }
            value =value/10;

        }

        while(inp!=0)
        {
            int rem=inp%10;
            if(max==rem) {
                inp=inp/10;
                continue;
            }
            else if (rem>smax) {
                smax = rem;
            }
            inp =inp/10;

        }

        return max+smax;
    }
}
