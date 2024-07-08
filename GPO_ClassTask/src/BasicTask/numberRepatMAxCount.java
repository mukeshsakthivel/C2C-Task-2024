package BasicTask;

import java.util.Arrays;


public class numberRepatMAxCount {
    public static void main(String[] args) {
        String str="1223465789999";
        repeatNumber(str);
    }
    public static void repeatNumber(String str)
    {
        char [] arr=str.toCharArray();
        int count[]=new int[10];

        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]-'0']++;
        }

        int max=0;
        int maxindex=0;
        for(int i=0;i<count.length;i++)
        {
            if(max<count[i])
            {
                max=count[i];
                maxindex=i;
            }
        }


        System.out.println(Arrays.toString(count));
        System.out.println(max);
        System.out.println(maxindex);




    }
}
//E:\TaskQuestion
//to finding the greatest number in the string at indeex position