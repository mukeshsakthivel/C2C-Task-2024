package Patten;

public class LeftHalfPyramid {
    public static void main(String[] args) {

        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n-i-1;k++)
            {
                System.out.print("__");
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
