package Section5;

public class Exercise19 {
    public static boolean isValid(int number){
        return(number>=10 && number<=1000);
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        if (isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)){
            return firstNumber % 10 == secondNumber % 10 ||
                    firstNumber % 10 == thirdNumber % 10 ||
                    secondNumber % 10 == thirdNumber % 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }
}
