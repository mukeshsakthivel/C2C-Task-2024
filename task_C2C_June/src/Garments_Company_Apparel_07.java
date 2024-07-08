import java.util.Scanner;

public class Garments_Company_Apparel_07 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int count=0;
        for(int i=0;i<a;i++)
        {
            int squ=in.nextInt();
            int check=(int) Math.sqrt(squ);
            if(check*check==squ)
                count++;
        }
        System.out.println(count);
    }
}
