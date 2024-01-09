package Recursion.ReverseNumber;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(12345));

    }
    static int reverse(int number){
        String len=String.valueOf(number);

        if (number==0){
            return number;
        }
        else {
            return (int) ((number%10)*(Math.pow(10,len.length()-1))+reverse(number/10));
        }
    }


//different approach n%10+reverse(n/10)
}
