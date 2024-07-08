import java.util.Scanner;

public class Christmas_Discount_17 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        int num[]=new int[a.length()];
        for(int i=0;i<a.length();i++)
        {
            num[i]=Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        int odd=0,even=0;
        for(int i=0;i< num.length;i++)
        {
            if(num[i]%2==0)
                odd+=num[i];
            else
                even+=num[i];
        }
        System.out.println(odd);
        System.out.println(even);
        System.out.println(odd*even);

    }
}
