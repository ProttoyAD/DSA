package Recursion.SumOfDigits;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {


        System.out.println(sumOfDigits(253));

    }

    static int sumOfDigits(int number) {
        String num = String.valueOf(number);
        if (num.length() > 1) {
            String result = num.substring(1);
            return Character.getNumericValue(num.charAt(0))+sumOfDigits(Integer.valueOf(result));
        } else {
            return Character.getNumericValue(num.charAt(0));

        }
    }
}
