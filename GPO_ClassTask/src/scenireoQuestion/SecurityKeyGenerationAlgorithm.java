package scenireoQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class SecurityKeyGenerationAlgorithm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String word1=in.nextLine();
        String word2=in.nextLine();
        keygeneration(word1,word2);
    }
    static void keygeneration(String word1,String word2)
    {
        String key1[]=new String[3];
        String key2[]=new String[3];

       key1= wordsplit(word1);
       key2= wordsplit(word2);

        System.out.println(Arrays.toString(key1));
        System.out.println(Arrays.toString(key2));

        StringBuffer key=new StringBuffer();
        key.append(key2[0]).append(key1[0]).append(key1[2]).append(key2[2]);
        System.out.println(key);
    }

    static String []  wordsplit(String word1)
    {

        String keyword[]=new String[3];
        int length=word1.length();
        int firstlast=length/3;
        if(length%3!=0) {
            int middle = length - (firstlast * 2);
            System.out.println(length);
            System.out.println(firstlast);
            System.out.println(middle);
            
            int i = 0;
            keyword[0] = word1.substring(0, firstlast);
            keyword[1] = word1.substring(firstlast, firstlast + middle);
            keyword[2] = word1.substring(firstlast + middle, length);
            System.out.println(Arrays.toString(keyword));

            return keyword;
        }
        else
        {
            keyword[0] = word1.substring(0, firstlast);
            keyword[1] = word1.substring(firstlast, firstlast*2);
            keyword[2] = word1.substring(firstlast*2, length);

            return keyword;
        }
    }
}
