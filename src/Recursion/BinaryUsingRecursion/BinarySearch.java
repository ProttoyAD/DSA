package Recursion.BinaryUsingRecursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] x={1,4,8,10,14,18};
        System.out.println(binary(x,10,0,5));

    }

    static int binary(int[] arr, int target, int s, int e) {
        int mid = (s + e) / 2;
        if (s > e) {
            return -1;
        }
        if (arr[mid]>target) {
            return binary(arr,target,s, mid);
        }
        else if (arr[mid]<target){
            return binary(arr,target,mid,e);
        }
        else{
            return mid;
        }
    }
}
