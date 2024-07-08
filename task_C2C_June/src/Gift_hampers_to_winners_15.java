import java.util.Scanner;

public class Gift_hampers_to_winners_15 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("enter the git boss");
        int gift=in.nextInt();
        System.out.println("enter the price of produc");
        int pro[]=new int[n];

        int count=0;
        for(int i=0;i<n;i++) {
            pro[i] = in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(Math.abs(pro[i]-pro[j])==gift)
                    count++;
            }
        }
        System.out.println(count);

    }
        }
