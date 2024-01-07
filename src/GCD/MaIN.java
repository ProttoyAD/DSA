package GCD;

public class MaIN {
    public static void main(String[] args) {
        System.out.println(gcd(10,4));

    }

    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else {
            int remainder=a%b;
            return gcd(b,remainder);
        }
    }
}
