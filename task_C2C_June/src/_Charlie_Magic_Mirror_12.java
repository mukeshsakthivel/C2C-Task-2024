import java.util.Scanner;

public class _Charlie_Magic_Mirror_12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String word=in.next();
        String word1=in.next();
        String both=word+word;
        if(both.contains(word1))
            System.out.println("1");
        else
            System.out.println("-1");
    }
}
