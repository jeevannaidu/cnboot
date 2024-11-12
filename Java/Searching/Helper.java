package Searching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Helper {

    public static int[] generateAnArrayWithRange(int arraySize, int maxNumber, boolean sortedOrUnsorted) {

        int[] randomNumbers =  new int[arraySize];
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        Random random = new Random();
        int index = 0;
        while(uniqueNumbers.size() < arraySize) {
            int randomNumber = random.nextInt(maxNumber) + 1;
            if(uniqueNumbers.add(randomNumber)) {
                randomNumbers[index++] = randomNumber;
            }
        }
        if(sortedOrUnsorted) {
            Arrays.sort(randomNumbers);
        }
        return randomNumbers;
    }
}
