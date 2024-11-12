package Sorting;

public class SelectionSort {
    static int[] sort(int[] array) {
        int total = 0;
        for(int i = 0; i < array.length; i++) {
            int minValue = i;
            for(int j = i +1; j < array.length; j ++) {
                if(array[j] < array[minValue])
                    minValue = j;
            }
            int temp = array[i];
            array[i] = array[minValue];
            array[minValue] = temp;
            total = total + (minValue - i);
        }
        return array;
    }

    public static void main(String [] args) {
        int[] arr =  {3, 2, 11, 5, 1};
        int[] result = sort(arr);
        for(int i : result) {
            System.out.print(i + " ");
        }
    }
}
