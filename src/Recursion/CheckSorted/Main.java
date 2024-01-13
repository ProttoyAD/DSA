package Recursion.CheckSorted;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input={1,2,3,4,5,6,7,8};
        System.out.println(checkSorted(input));

    }

    public static boolean checkSorted(int[] arr){
        boolean result=true;
        if (arr.length>1) {
            if (arr[0] < arr[1]) {
                int sub[] = Arrays.copyOfRange(arr, 1, arr.length);
                return result=checkSorted(sub);
            }
            else {
                return false;
            }
        }
        else {
            return result;
        }
    }
}
