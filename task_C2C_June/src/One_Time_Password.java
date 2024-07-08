import java.util.Scanner;

public class One_Time_Password {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int min=in.nextInt();
        int max=in.nextInt();
        int prime=0;

        for(int i=min;i<=max;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if((i%j)==0)
                    count++;
            }
            if(count==2){
                prime=i;
            }
        }
      //  System.out.println(prime);
       // System.out.println(min);
        System.out.println(Math.abs(min+prime));
    }
}
