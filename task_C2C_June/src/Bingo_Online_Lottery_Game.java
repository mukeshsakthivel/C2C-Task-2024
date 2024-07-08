import java.util.Scanner;

public class Bingo_Online_Lottery_Game {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String number=in.next();
        char a[]=number.toCharArray();
        char fmax=0;
        char smax=0;
        //  System.out.println(Arrays.toString(a));
        for(int i=0;i<number.length();i++)
        {
            for(int j=i+1;j<number.length();j++)
            {
                if(a[i]<a[j])
                {
                    //System.out.println(a[j]);
                    smax=a[i];
                    fmax=a[j];
                }
            }
        }
        int add=smax-'0';
        int add1=fmax-'0';
        System.out.println(add+add1);
    }
}
