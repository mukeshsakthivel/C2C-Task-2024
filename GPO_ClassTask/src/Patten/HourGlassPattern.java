package Patten;

public class HourGlassPattern {
    public static void main(String[] args) {

        int n=4;
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                if(i==j)
                    System.out.println("*");
                else
                    System.out.print("*_");
            }
            if(i==n-1)
                break;
            for(int k=0;k<=i;k++)
                System.out.print(".");

        }
        for(int i=1;i<n;i++)
        {
            for(int k=1;k<n-i;k++)
            {
                System.out.print(".");
            }
            for(int j=0;j<i+1;j++)
            {
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print("*_");
            }
            if(i!=n-1)
                System.out.println();
        }
    }
}
