import java.util.Scanner;

public class Traillinr_Zero_23 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println(fact);

        int zero=0;

        if(n<5)
            System.out.println("Traillinr is : 0");
        else {
            while (n >= 5) {
                zero += n / 5;
                n /= 5;
            }
            System.out.println(zero);
        }

    }
}
