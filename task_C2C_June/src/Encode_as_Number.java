import java.util.Scanner;

public class Encode_as_Number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        char[] inp=a.toCharArray();
        int max=0;

        char val = 0;
        for(int i=0;i< inp.length;i++)
        {
            int count=0;
            for(int j=i+1;j< inp.length;j++)
            {
                if(inp[i]==inp[j])
                {
                    count++;
                }
            }
            //System.out.println(i+"="+count+"   "+max);
            if(count>max){
                max=count;
                val=inp[i];
            }
            System.out.println(val);
        }
        System.out.println(val);


    }
}
