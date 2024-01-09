package Recursion.CountZero;

public class Main {
    public static void main(String[] args) {
        System.out.println(countZero(1020305405));
    }

    static int countZero(int number){
        if(number==0) {
            return number;
        } else if (number%10==0) {
            return 1 + countZero(number / 10);
        } else {
            return 0 + countZero(number / 10);
        }
    }
}
