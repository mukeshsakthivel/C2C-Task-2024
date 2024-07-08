package BasicTask;

import java.util.Scanner;

public class Twin_primeNumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int st=in.nextInt();
        int ed=in.nextInt();
        prime(st,ed);
    }
  public   static void prime(int st,int ed)
    {
        int pair=0;
        int pre=0;
        boolean check=false;
        for(int i=st;i<=ed;i++)
        {

            int count =0;
            for(int j=1;j<=i;j++)
            {

                if(i%j==0) {
                    count++;
                }
             }


            if(count==2){
                pre=pair;
                pair=i;
                check=true;


            }
            if(check&&pre!=0) {

                System.out.println(pre +" "+pair);
                check = false;

            }
        }
    }
}
