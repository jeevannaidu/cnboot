package Basics;

import java.util.Arrays;

public class TwoSum {


    static int[] findIndexes(int[] sortedArray, int target) {
        int sum = 0;
        int leftPointer = 0;
        int rightPointer = sortedArray.length - 1;

        while (leftPointer < rightPointer) {
            sum = sortedArray[leftPointer] + sortedArray[rightPointer];
            if (sum == target) {
                return new int[]{leftPointer, rightPointer};
            }
            if (sum > target) {
                rightPointer--;
            } else {
                leftPointer++;
            }

        }
        return null;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 13;
        int[] result = findIndexes(array, target);

        Arrays.stream(result).forEach(n -> System.out.println(n));

    }
}
