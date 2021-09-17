public class Exercise1 {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        }
        else{
           return Math.round(kilometersPerHour*0.621);
        }
    }

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
    }
}
