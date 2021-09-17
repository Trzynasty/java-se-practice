public class Exercise1 {
    public long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        }
        else{
           return Math.round(kilometersPerHour);
        }
    }
}
