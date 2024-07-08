package Patten;

public class demo {
    public static void main(String[] args)
    {

        // label for outer loop
        outer:
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 10; j++) {
                if (j == 2)
                    continue outer;
                System.out.println(" value of j = " + j);
            }
        } // end of outer loop
    } // end of main()
} // end of class Main
