package Section5;
import java.util.Scanner;

public class Exercise27 {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner= new Scanner(System.in);
        long sum=0;
        int averageCounter=0;
        while(true) {
            if(scanner.hasNextInt()) {
                int number=scanner.nextInt();
                sum+=number;
                averageCounter++;
            }
            else{
                break;
            }

            scanner.nextLine();
        }
        long average= Math.round((double)sum/averageCounter);
        System.out.println("SUM = "+ sum+ " AVG = "+ average);
        scanner.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
