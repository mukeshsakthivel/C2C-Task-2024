package BasicTask;

import java.util.Arrays;

public class repeated_Array_number {
    public static void main(String[] args) {
        int[] arr = {11,1,1,11,0,0};

       /* for(int i=0;i< arr.length;i++)
        {
            if(arr[i]<0)
                continue;
            int count=0;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=-1;
                    count++;
                }
            }
            if(count>0)
                System.out.println(arr[i]);
        }*/
/*
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    i=j;
                    System.out.println(arr[i]);
                }
            }
        }*/



                int[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 9, 3};

                for (int i = 0; i < numbers.length; i++) {
                    boolean isDuplicate = false;
                    for (int j = 0; j < i; j++) {
                        if (numbers[i] == numbers[j]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (isDuplicate) {
                        boolean alreadyPrinted = false;
                        for (int k = 0; k < i; k++) {
                            if (numbers[i] == numbers[k]) {
                                alreadyPrinted = true;
                                break;
                            }
                        }
                        if (!alreadyPrinted) {
                            System.out.println(numbers[i]);
                        }
                    }
                }
            }
        }

