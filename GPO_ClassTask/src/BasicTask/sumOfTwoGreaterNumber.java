package BasicTask;

public class sumOfTwoGreaterNumber {
    public static void main(String[] args) {
        int a=8;
        int b=6;
        int c=1;
        int sum=0;
//        if(a>b&&a>c)
//        {
//            sum=a;
//        }
//        else if(b>c&&b>a)
//            sum=sum+b;
//        else
//            sum=sum+c;
//        System.out.println(sum);
        if(a<b&&a<c)
        {
            System.out.println("ss");
            sum=b+c;
        }
        else if(b<a&&b<c) {
            System.out.println("two");
            sum = a + c;
        }
        else if(c<a&&c<b){
            System.out.println("three");
            sum = b + a;
        }
        System.out.println(sum);
    }
}
