package BasicTask;

public class reverseString {
    public static void main(String[] args) {
        String str="' helloe.everyone.hi '";
        System.out.println(str.length());
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}
