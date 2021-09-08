package interview;

//
//
///*  Given a sorted array arr[] of n elements, write a function to search a given element ‘23’ in arr[].
//Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval covering the whole array.
//If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
//Otherwise, narrow it to the upper half. Repeatedly check until the value is found or the interval is empty. */
public class Main {
    public static void main(String[] args) {
        int[] arr2 = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println("index of  value is: ");
        System.out.println(search(arr2, 23));
    }

    public static int search(int[] array, int value) {
        int middle;
        int first = 0;
        int last = array.length - 1;
        while (first <= last) {
            middle = (last + first) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] > value) {
                last = middle - 1;
            } else  if (array[middle] < value)
                first = middle + 1;


        }



        return 0;
    }
}



