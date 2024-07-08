import java.sql.SQLOutput;
import java.util.Scanner;

public class Transmit_value_20 {
    public static boolean find(int a)
    {
        if((a&1)==0)
            return true;
        else
            return false;
    }
    static String stringprint(int a)
    {
        if(find(a))
            return "Odd";
        else
            return "even";
    }
    static  int intprint(int a)
    {
        if(find(a))
            return 0;
        else
            return 1;
    }
    public static void main(String[] args) {
       /* Scanner in=new Scanner(System.in);
        StringBuffer a=new StringBuffer(in.next());
        String rev=a.reverse().toString();
        System.out.println(rev);
*/
        System.out.println(find(5));
        System.out.println(stringprint(5));
        System.out.println(intprint(5));

    }
}
