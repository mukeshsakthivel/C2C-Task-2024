import java.util.Scanner;

public class Gift_hampers_to_winners_16 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("first triangle");
        float base1=in.nextFloat();
        float height1=in.nextFloat();
        System.out.println("second Triangle");
        float base2=in.nextFloat();
        float height2=in.nextFloat();
        float tri1=(base1*height1)/2;
        float tri2=(base2*height2)/2;
        if(tri1>tri2)
            System.out.printf("%.2f",tri1);
        else
            System.out.printf("%.2f",tri2);

    }
}