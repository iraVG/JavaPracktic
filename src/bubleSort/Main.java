package bubleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] array = {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println(arrayToString(array));
       bubbleSort(array);
        System.out.println(arrayToString(array));
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted=false;
        while (!isSorted) {
            isSorted=true;
            for (int i = 1; i < array.length; i++) {
                if(array[i-1]>array[i]){
                    int tmp=array[i];
                    array[i]=array[i-1];
                    array[i-1]=tmp;
                    isSorted=false;

                }

            }

        }
        }


    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);

        }
        sb.append("]");

        return sb.toString();
    }





}
