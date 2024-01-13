package Recursion.LinearSearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input={1,2,3,4,5,6,7,8};
        System.out.println(input.length);
        System.out.println(linear(input,8));
    }

    static int linear(int[] arr,int target) {
        int result = 0;
        if (arr.length == 0) {
                return -(Integer.MAX_VALUE);
        } else {
            if (arr[0] == target) {
                result = 0;
            } else {
                result = 1 + linear(Arrays.copyOfRange(arr, 1, arr.length), target);
            }
        }
        return result;
    }
}

