package Section8;

import java.util.Scanner;

public class Exercise41 {

    public static int[] getIntegers(int arraySize){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[arraySize];
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static void printArray(int[] printedArray){
        for(int i=0;i<printedArray.length;i++){
            System.out.println("Element "+ i+ " contents "+ printedArray[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray){
        int controlValue;
        for(int i = 0; i< unsortedArray.length; i++){
            int j=i+1;
            while (j<unsortedArray.length){
                if (unsortedArray[i]< unsortedArray[j]){
                    controlValue= unsortedArray[i];
                    unsortedArray[i]= unsortedArray[j];
                    unsortedArray[j]=controlValue;
                }
                j++;
            }
        }
        return unsortedArray;
    }

    public static void main(String[] args) {
        System.out.println("Write 5 integers");
        int[] array = getIntegers(5);
        printArray(array);
        System.out.println("Sorted array:");
        printArray(sortIntegers(array));
    }
}
