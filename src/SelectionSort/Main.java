package SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={2,4,5,3,1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[]  input){
        int min;
        int temp;
        for (int i=0;i<input.length;i++){
            min=i;
            for (int j=i;j<input.length;j++){
                if (input[j]<input[min]){
                    min=j;
                }
            }

            temp=input[i];
            input[i]=input[min];
            input[min]=temp;
            System.out.println("Each Time: "+Arrays.toString(input));

        }
        return input;
    }
}
