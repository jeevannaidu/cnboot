package SearchingAndSorting;

import java.util.*;

public class BinarySearch {

    public static int searchElement(int[] elements, int numberToSearch, int leftPointerIndex, int rightPointerIndex) {

        if(leftPointerIndex >  rightPointerIndex) {
            return -1;
        }

        int midPointerIndex = (rightPointerIndex + leftPointerIndex) / 2;

        if (elements[midPointerIndex] == numberToSearch) {
            return midPointerIndex;
        } else if (elements[midPointerIndex] > numberToSearch) {
            return searchElement(elements, numberToSearch, leftPointerIndex, midPointerIndex - 1);
        } else {
            return searchElement(elements, numberToSearch, midPointerIndex + 1, rightPointerIndex);
        }
    }


    public static int[] generateAnArrayWithRange(int arraySize, int maxNumber) {

        int[] randomNumbers =  new int[arraySize];
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        Random random = new Random();

        int index = 0;

        while(uniqueNumbers.size() < 1000) {
            int randomNumber = random.nextInt(maxNumber) + 1;
            if(uniqueNumbers.add(randomNumber)) {
                randomNumbers[index++] = randomNumber;
            }
        }

        Arrays.sort(randomNumbers);

        return randomNumbers;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What should be the size of the array ? ");
        int arraySize = sc.nextInt();
        System.out.println("Max range to generate random "+ arraySize + " entries. EX: If the max range is 1000 then random numbers under 1000 would be generated");
        System.out.println("NOTE: RANGE SHOULD BE GREATER THAN THE SIZE OF THE ARRAY");
        int maxRange = sc.nextInt();

        if(maxRange < arraySize) {
            System.out.println("Max range is less than size of the array !");
            System.out.println("Rerun to give input again");
        }

        System.out.println("Enter any number to find if it is available in the array should be within the max range:");
        int n = sc.nextInt();
        sc.close();

        System.out.println(searchElement(generateAnArrayWithRange(arraySize, maxRange), n, 0, arraySize -1));
    }
}
