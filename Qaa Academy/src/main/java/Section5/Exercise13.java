package Section5;
import Section4.Exercise4;

public class Exercise13 {
    public static int getDaysInMonth(int month, int year){
        if (month<1 || month>12 || year<1 || year>9999) return -1;
        else{
            switch(month){
                case 2:
                    return Exercise4.isLeapYear(year)?29:28;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
                default:
                    throw new IllegalStateException("Unexpected value: " + month);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }
}
