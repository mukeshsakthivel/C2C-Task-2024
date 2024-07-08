import java.util.Scanner;

public class Missing_Data_18 {
    public static void main(String[] args)

    {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        Boolean aa = a.contains(b);
        System.out.println(aa);

        for (char com : b.toCharArray()) {
            if (!a.contains(String.valueOf(com)))
                System.out.println(com);

        }
        for (char com : a.toCharArray()) {
            if (!b.contains(String.valueOf(com)))
                System.out.println(com);

        }


    }
}
