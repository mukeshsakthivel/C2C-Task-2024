package Patten;

public class RhombusPattern {
    public static void main(String[] args) {

        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=n-2;j>=0;j--)
            {
                if(j==0)
                    System.out.print("*");
                else
                    System.out.print("*_");
            }
            if(i!=n-1)
                System.out.println();
            if(i==n-1)
                break;
            for(int k=0;k<=i;k++)
            {
                System.out.print(".");
            }

        }
    }
}
