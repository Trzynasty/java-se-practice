package Section5;

public class Exercise23 {
    public static int getDigitCount(int number){
        if(number<0) return -1;
        else{
            int digitNumber=0;
            do{
                digitNumber++;
                number/=10;
            }
            while(number>0);
            return digitNumber;
        }
    }

    public static int reverse(int number){
        int reversedNumber=0;
        while(number!=0){
            reversedNumber=reversedNumber*10+(number%10);
            number/=10;
        }
        return reversedNumber;
    }
    public static void numberToWords(int number){
        if (number<0) System.out.println("Invalid Value");
        else{
            int digitNumber=getDigitCount(number);
            number = reverse(number);
            for(int i=0;i<digitNumber;i++){
                Exercise12.printNumberInWord(number%10);
                number/=10;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
}
