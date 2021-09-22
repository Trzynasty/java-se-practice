package Section5;

public class Exercise25 {
    public static int getLargestPrime(int number) {
        if (number<=1) return -1;
        else {
            int divider=2;
            while (divider<number) {
                if (number%divider!=0) {
                    divider++;
                } else {
                    number/=divider;
                    divider=2;
                }
            }
            return number;
        }
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime (21));
        System.out.println(getLargestPrime (217));
        System.out.println(getLargestPrime (0));
        System.out.println(getLargestPrime (45));
        System.out.println(getLargestPrime (-1));
    }
}