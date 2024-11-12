package SearchingAndSorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Helper {

    public int[] generateAnArrayWithRange(int arraySize, int maxNumber) {

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

        Arrays.sort(randomNumbers);
        return randomNumbers;
    }
}
