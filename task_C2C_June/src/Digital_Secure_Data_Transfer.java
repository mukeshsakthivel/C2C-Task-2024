import java.util.Scanner;

public class Digital_Secure_Data_Transfer {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String character=in.next();
        int key=in.nextInt();
        char ch=(char)(character.charAt(0)+key);
        System.out.println(ch);
    }
}
