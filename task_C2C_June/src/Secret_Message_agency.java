import java.util.Scanner;

public class Secret_Message_agency {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String letter=in.next();
        char word[]=letter.toCharArray();
        int count=0;
        for(int i=0;i<word.length;i++)
        {
            char ch=word[i];
            if(!((ch >=65 && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')))
                count++;
        }
        System.out.println(count);
    }
}
