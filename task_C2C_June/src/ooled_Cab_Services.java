import java.util.Scanner;

public class ooled_Cab_Services {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in .nextInt();
        int start=in.nextInt();
        int end=in.nextInt();
        int dis[]=new int[n];
        for(int i=0;i<n;i++)
        {
            dis[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(start<=dis[i]&&dis[i]<=end)
            {
                System.out.println(dis[i]);
            }
        }
    }
}
