package Section4;

public class Exercise9 {
    public static void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            final long daysInMinutes =60*24;
            long days = minutes/daysInMinutes;
            long years = days/365;
            if (years > 0) days= days-years*365;
            System.out.printf("%s min = %s y and %s d%n",minutes,years, days);
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}
