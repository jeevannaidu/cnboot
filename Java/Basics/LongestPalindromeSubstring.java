package Basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LongestPalindromeSubstring {

    public static void main(String[] args) {
        String s = "abcbabcbabc";
        StringBuilder sb = new StringBuilder();
        List<String> palindromeList = new ArrayList<>();
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if (sb.toString().toLowerCase().indexOf(c) != -1) {
                String palindrome = sb.append(c).substring(sb.toString().indexOf(c), sb.length());
                palindromeList.add(palindrome);
            } else {
                sb.append(c);
            }
        }

        String longest = null;

        for (String pal : palindromeList) {
            if (longest == null) {
                longest = pal;
            } else if (longest.length() < pal.length()) {
                longest = pal;
            }

        }

        System.out.println(longest);
    }
}
