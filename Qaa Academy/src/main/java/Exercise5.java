public class Exercise5 {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        if ((long)(firstNumber*1000)==(long)(secondNumber*1000))return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
