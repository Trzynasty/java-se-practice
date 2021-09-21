package Section5;

public class Exercise18 {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if(firstNumber>=10 && firstNumber<=99 && secondNumber>=10 && secondNumber<=99) {
            int firstDigit,secondDigit,oldSecondNumber;
            while(firstNumber>0){
                firstDigit=firstNumber%10;
                oldSecondNumber=secondNumber;
                while(oldSecondNumber>0){
                    secondDigit=oldSecondNumber%10;
                    if (secondDigit==firstDigit) return true;
                    oldSecondNumber/=10;
                }
                firstNumber/=10;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }
}
