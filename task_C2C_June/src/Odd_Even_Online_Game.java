import java.util.Arrays;
import java.util.Scanner;

public class Odd_Even_Online_Game {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();}

        int b[]=new int[size];
        int count=0,e=0;

        for(int i=0;i<size;i++)
        {
            if((a[i]%2)==0)
            {
                b[i]=a[e++];
                count++;
                System.out.println(count);
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(i);
            if((a[i]%2)!=0)
            {
                b[e++]=a[i];
            }
        }

        System.out.println(Arrays.toString(b));

    }
}
