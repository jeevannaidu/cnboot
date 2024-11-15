package Sorting;

public class InsertionSort {

  public static int[] sortWithInsertion(int[] elements) {

      for(int i = 1; i < elements.length; i++) {
         int j = i - 1, temp = elements[i];
         while(j >= 0 && (elements[j] > temp)) {
             elements[j + 1] = elements[j];
             j--;
         }
        elements[j+1] = temp;
      }
      return elements;
  }

  public static void main(String[] args) {
      int [] array = {6, 2, 4, 1, 5, 3};
      int [] result = sortWithInsertion(array);
      for(int i : result) {
          System.out.println(i);
      }
  }
}

