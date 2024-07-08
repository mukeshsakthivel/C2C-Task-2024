import java.util.Scanner;


public class Security_Key {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        char[] inp=a.toCharArray();
        int key=0;
        boolean check[]=new boolean[10];
        for(int i=0;i<inp.length;i++)
        {
            int repeat=inp[i]-'0';//unicode
            if(check[repeat])
                continue;
            else{
                for(int j=i+1;j<inp.length;j++)
                {
                   // System.out.println("input"+i+" "+j);
                    if(inp[i]==inp[j])
                    {
                        //System.out.println("output"+i+"   "+j);
                        key++;
                        check[repeat]=true;
                        break;
                    }

                }
            }
        }
        System.out.print("key:"+key);

    }
}
