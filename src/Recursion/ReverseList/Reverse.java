package Recursion.ReverseList;

public class Reverse {
    public static void main(String[] args) {
        printStraight(10);
        revprint(10);

    }
    static void printStraight(int x){
        if (x==1) {
        }
        else {
            System.out.println(x);
            printStraight(x-1);
        }
    }
    static void revprint(int x){
        if (x==1){
            return;
        }
        else {
            revprint(x-1);
            System.out.println((x));
        }
    }
}
