package Patten;

public class Diamond_Patten {
    public static void main(String[] args) {
        int n = 4;
        int l=8;

            for(int  i=0;i<n;i++) {
                int k = 0;
                for (k = 0; k < n - i - 1; k++) {

                    System.out.print("_");
                }
                for(int j=0;j<=i;j++) {
                    if(j==i)
                        System.out.print("*");
                    else
                        System.out.print("*_");
                }
                System.out.println();
            }
            for(int i=0;i<n-2;i++)
            {
                for(int k=0;k<=i;k++) {
                    System.out.print("_");
                }
                for(int j=0;j<n-i-1;j++){
                    if(j==n-i-2)
                     System.out.print("*");
                    else
                        System.out.print("*_");
                }
                if(i!=n-1)
                 System.out.println(".");
            }

            }
        }
