import java.util.Scanner;

public class Sum_of_Ajacent_Distances {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=in.nextInt();
        int a[]=new int[count];
        int val=0;
            for(int i=0;i<count;i++)
            {
                 a[i]=in.nextInt();
            }
            for(int i=0;i<count-1;i++)
            {
                int min=Math.abs(a[i]-a[i+1]);
                val+=min;

            }
        System.out.println(val);
    }
}
