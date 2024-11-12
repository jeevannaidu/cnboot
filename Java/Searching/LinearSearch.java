package Searching;

import java.util.Scanner;

public class LinearSearch {

    static int search(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find in the list : ");
        int n = sc.nextInt();
        sc.close();
        int[] a = {5, 7, 1, 2, 33, 90, 87, 54, 12, 34, 78};
        System.out.println(search(a, n));
    }
}
