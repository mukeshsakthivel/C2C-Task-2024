package BasicTask;

public class Series {
    public static void main(String[] args) {
        int n=2;
        int series=0;
        for(int i=1;i<=n;i++)
        {
            series= (int) (series+(Math.pow(i,i))/i);
        }
        System.out.println(series);
    }
}
