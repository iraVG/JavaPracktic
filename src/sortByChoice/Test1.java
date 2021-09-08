package sortByChoice;

public class Test1 {
    public static void main(String[] args) {
        int[] array = {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println(arrayToString(array));

        for (int step = 0; step < array.length; step++) {
            int index=minSearch(array,step);
            int tmp=array[step];
            array[step]=array[index];
            array[index]=tmp;
        }
        System.out.println(arrayToString(array));

    }

    public static int minSearch(int[] arr, int start) {
        int minIndex = start;
        int minValue = arr[start];
        for (int i = start + 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue=arr[i];
                minIndex=i;
            }

        }


        return minIndex;
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
