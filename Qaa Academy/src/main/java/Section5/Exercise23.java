package Section5;

public class Exercise23 {
    public static int getDigitCount(int number){
        if(number<0) return -1;
        else{
            int digitNumber=0;
            do{
                digitNumber++;
                number%=10;
            }
            while(number>0);
            return digitNumber;
        }
    }

    public static int reverse(int number){
        return 0;
    }
}
