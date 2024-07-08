package Patten;

public class InvertedRightHalfPyramid {
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
            for(int k=1;k<=i;k++)
            {
                System.out.print("__");
            }
            if(i!=n-1)
                System.out.println();
        }
    }
}

//or
/*
int n=5;
        for(int i=0;i<n;i++)
        {
        for(int j=n-1;j>=i;j--)
        {
        if(i==j)
        System.out.println("*");
        else
        System.out.print("*_");
        }

        }*/
