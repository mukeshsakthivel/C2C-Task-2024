package Patten;

public class FullPyramid {
    public static void main(String[] args) {

        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n-1-i;k++)
            {
                System.out.print("_");
            }
            for(int j=0;j<=i;j++)
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
