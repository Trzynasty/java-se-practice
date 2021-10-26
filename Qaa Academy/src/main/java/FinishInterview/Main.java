package FinishInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{0,1,2};
        getSecondElementOnArray(array);
        String name = "Adam Kaminski";
        System.out.println(name.split(" ")[0]);
        System.out.println(name.split(" ")[1]);
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.addAll(list1);
    }

    public static void getSecondElementOnArray(int[] array){
        for(int i=0;i<array.length;i++){
            if (i==1){
                System.out.println("Get it "+array[i]);
            }
        }
    }
}
