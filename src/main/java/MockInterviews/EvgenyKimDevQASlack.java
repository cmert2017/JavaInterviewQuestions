package MockInterviews;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
1.Write a function that takes an array of integers and returns the sum of all elements
sumArray([1,2,3,4,5])->15
 */
/*
2.
 */

public class EvgenyKimDevQASlack {

    public static int sumArray(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }


    //second question
    public static boolean check(int[] arr, int num){
        boolean result= false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                result=true;
                break;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(sumArray(arr));

        System.out.println(check(arr,7));
    }

}
