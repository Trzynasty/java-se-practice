package Section8;

import java.util.Arrays;

public class Exercise43 {
    private static void reverse(int[] array){
        System.out.println("Array = "+ Arrays.toString(array));
        int controlValue;
        for(int i=0;i<array.length/2;i++){
            controlValue= array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=controlValue;
        }
        System.out.println("Reversed Array = "+ Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        reverse(array);
    }
}
