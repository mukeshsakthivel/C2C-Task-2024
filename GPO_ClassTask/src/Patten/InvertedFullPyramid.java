package Patten;

public class InvertedFullPyramid {
    public static void main(String[] args) {

        int n=5;

        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                if(i==j)
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
                System.out.print("_");
            }

        }
    }
}
