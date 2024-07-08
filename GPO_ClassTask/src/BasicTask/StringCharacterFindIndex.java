package BasicTask;

import java.util.Scanner;

public class StringCharacterFindIndex {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();  // i like india
        String find=in.next();
        int first=(int)find.charAt(0);
        System.out.println(first);
        for(int i=0;i<str.length()-1;i++)
        {
             if(((int)str.charAt(i) == (int)find.charAt(i)))
             {
                 String a=(str.substring(i, i + (find.length() - 1)));
                 if(a==find)
                 {
                     System.out.println(i);
                     break;
                 }


             }
        }
    }
}
