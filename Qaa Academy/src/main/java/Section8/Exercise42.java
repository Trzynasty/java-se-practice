package Section8;

import java.util.Scanner;

public class Exercise42 {
    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] readElements(int arrayLength){
        int[] array = new int[arrayLength];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static int findMin(int[] array){
        int min=Integer.MAX_VALUE;
        for (int j : array) {
            if (min > j) min = j;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Please write a length of an array:");
        int arrayLength=readInteger();
        System.out.println("Please write the elements of an array:");
        int[] array = readElements(arrayLength);
        System.out.println("The minimum number in the array is: " +findMin(array));
    }
}
