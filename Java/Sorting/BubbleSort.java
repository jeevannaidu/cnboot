package Sorting;
import Searching.Helper;

public class BubbleSort {
    static int[] sortTheArray(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j +1]) {
                        array[j] = array[j+1] + array[j];
                        array[j + 1] = array[j] - array[j+1];
                        array[j] = array[j] - array[j + 1];
                    }
            }
        }
        return array;
    }

    public static void main(String[] args) {
       int[] unsortedArray =  Helper.generateAnArrayWithRange(1000, 100000, false);
       int[] sortedArray = sortTheArray(unsortedArray);
       System.out.println(sortedArray);
    }
}
