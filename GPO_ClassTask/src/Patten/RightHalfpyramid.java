package Patten;

public class RightHalfpyramid {
    public static void main(String[] args) {

        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==i)
                System.out.print("*");
                else
                    System.out.print("*_");
            }
            if(i!=n-1)
                System.out.println();
        }
    }
}
