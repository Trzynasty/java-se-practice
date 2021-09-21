package Section5;

public class Exercise15 {
    public static boolean isPalindrome(int number){
        if(number<0) number*=-1;
        int oldNumber=number;
        int reverse=0;
        while(number>0){
            reverse=reverse*10+(number%10);
            number/=10;
        }
        return oldNumber==reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
}
